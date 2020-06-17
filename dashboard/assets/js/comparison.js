let Comparison;

(($) => {
    Comparison = {

        settings: {
            dataUrl: null
        },

        /**
         * Init the result page.
         *
         * @param settings
         */
        init: (settings) => {
            Comparison.settings = settings;
            Comparison.binds();

            Comparison.setupTable();
        },

        /**
         * Bind on the hml page.
         */
        binds: () => {
            $("#navigation-select-results-a").on('change', Comparison._navigateComparison);
            $("#navigation-select-results-b").on('change', Comparison._navigateComparison);

            let tableBody = $("#table tbody");
            tableBody.on('click', 'tr', Comparison._rowClick);
        },

        /**
         * Setup the table.
         */
        setupTable: () => {
            Comparison._addInputHeader();
            Comparison.table = $("#table").DataTable({
                ajax: {
                    url: Comparison.settings.dataUrl,
                    dataSrc: ''
                },
                order: [[0, 'asc'], [1, 'asc'], [2, 'asc']],
                columns: [
                    {"data": "project_id"},
                    {"data": "bug_id"},
                    {"data": "target_frame"},
                    {"data": "buggy_frame"},
                    {"data": "trA_passing_tests", "width": "50px"},
                    {"data": "trA_failing_tests", "width": "50px"},
                    {"data": "trA_exam_score", "width": "100px"},
                    {"data": null, "defaultContent": ""},
                    {"data": null, "defaultContent": ""},
                    {"data": null, "defaultContent": ""},
                    {"data": "trB_exam_score", "width": "100px"},
                    {"data": "trB_failing_tests", "width": "50px"},
                    {"data": "trB_passing_tests", "width": "50px"},
                    {"data": null, "defaultContent": "", "orderable": false, "searchable": false},
                    {"data": null, "defaultContent": "", "orderable": false, "searchable": false, "width": "20%"},
                ],
                columnDefs: [
                    {
                        targets: [8],
                        render: Comparison._renderIcons,
                        className: "text-center"
                    },
                    {
                        targets: [7, 9],
                        render: Comparison._computeRanking,
                        className: "text-center"
                    },
                    {
                        targets: [3, 4, 5, 6, 7, 8, 9, 10, 11, 12],
                        className: "text-center"
                    },
                    {
                        targets: [6, 10],
                        render: Comparison._renderResults
                    }
                ],
                paging: false,
                orderCellsTop: true,
                fixedHeader: true
            });
        },

        /**
         * Render the results.
         *
         * @param data
         * @returns {string}
         * @private
         */
        _renderResults: (data) => {
            let number = parseFloat(data);

            if (number > 10000) {
                return '<i class="fas fa-fw fa-times text-danger"></i><span class="d-none">false</span>';
            } else {
                return number.toFixed(10);
            }
        },

        /**
         * Render the comparison icons,
         *
         * @param data
         * @param _
         * @param columnData
         * @returns {string}
         * @private
         */
        _renderIcons: (data, _, columnData) => {
            let trA_exam_score = columnData.trA_exam_score;
            let trB_exam_score = columnData.trB_exam_score;

            if (trA_exam_score > trB_exam_score) {
                return '<i class="fas fa-fw fa-arrow-right text-info"></i><span class="d-none">trB</span>';
            } else if (trA_exam_score < trB_exam_score) {
                return '<i class="fas fa-fw fa-arrow-left text-info"></i><span class="d-none">trA</span>';
            } else {
                return '<i class="fas fa-fw fa-equals text-info"></i><span class="d-none">trAtrBequal</span>';
            }
        },

        /**
         * Compute the ranking based on the exam score and the slocs.
         *
         * @param data
         * @param _
         * @param row
         * @param meta
         * @returns {string}
         * @private
         */
        _computeRanking: (data, _, row, meta) => {
            let sLoc = row.sloc;

            if (meta.col === 6) {
                let trAExamScore = parseFloat(row.trA_exam_score);

                if (trAExamScore > 10000) {
                    return '';
                }

                return (trAExamScore * sLoc).toFixed(0);
            } else if (meta.col === 8) {
                let trBExamScore = row.trB_exam_score;

                if (trBExamScore > 10000) {
                    return '';
                }

                return (trBExamScore * sLoc).toFixed(0);
            }

            return '';
        },

        /**
         * Add input headers.
         *
         * @private
         */
        _addInputHeader: function () {
            $('#table thead tr:eq(1)').clone(true).appendTo('#table thead');
            $('#table thead tr:eq(2) th').each(function (index) {
                let title = $(this).text();
                $(this).html('<input class="form-control form-control-sm" type="text" data-column-index="' + index + '" placeholder="Search ' + title + '" />');

                $('input', this).on('keyup change clear', Comparison._searchTableColumn);
            });
        },

        /**
         * Click on a row.
         *
         * @private
         */
        _rowClick: function () {
            let rowSelectedCssClass = 'row_selected';
            let alreadySelected = false;
            if ($(this).hasClass(rowSelectedCssClass)) {
                alreadySelected = true;
            }

            $('#table tbody tr').removeClass(rowSelectedCssClass);
            if (alreadySelected === false) {
                $(this).addClass(rowSelectedCssClass);
            }
        },

        /**
         * Search in a table column.
         *
         * @param event
         * @private
         */
        _searchTableColumn: function (event) {
            let columnIndex = $(event.target).data("column-index");
            let firstChar = this.value.charAt(0);
            let lastChar = this.value.charAt(this.value.length - 1);

            if (Comparison.table.column(columnIndex).search() !== this.value) {
                if (firstChar === "^" && lastChar === "$") {
                    Comparison.table.column(columnIndex).search(this.value, true, false).draw();
                } else {
                    Comparison.table.column(columnIndex).search(this.value).draw();
                }
            }
        },


        /**
         * Navigate to the new comparison.
         *
         * @private
         */
        _navigateComparison: (e) => {
            let redirectUrl = Comparison._updateQueryStringParameter(
                window.location.href,
                $(e.target).attr('data-variable'),
                $(e.target).val()
            );

            window.location.replace(redirectUrl);
        },

        /**
         * Update the query string based on a key and value.
         *
         * @param {string} uri
         * @param {string} key
         * @param {string} value
         * @returns {void | string|string}
         * @private
         */
        _updateQueryStringParameter: (uri, key, value) => {
            // From https://stackoverflow.com/a/6021027
            let re = new RegExp("([?&])" + key + "=.*?(&|$)", "i");
            let separator = uri.indexOf('?') !== -1 ? "&" : "?";

            if (uri.match(re)) {
                return uri.replace(re, '$1' + key + "=" + value + '$2');
            } else {
                return uri + separator + key + "=" + value;
            }
        }
    }
})(jQuery);
