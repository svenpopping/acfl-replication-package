let Results;

(function ($) {
    Results = {

        table: null,

        settings: {
            dataUrl: null,
            experimentName: null,
            testCaseName: null
        },

        /**
         * Init the result page.
         *
         * @param settings
         */
        init: function (settings) {
            Results.settings = settings;

            $('#toast').toast({
                delay: 2000
            });

            Results.setup();
            Results.binds();
        },


        /**
         * Setup the datatable.
         */
        setup: function () {
            Results._addInputHeader();
            Results.table = $("#table").DataTable({
                ajax: {
                    url: Results.settings.dataUrl,
                    dataSrc: ''
                },
                order: [[0, 'asc'], [1, 'asc'], [2, 'asc']],
                columns: [
                    {"data": "project_id"},
                    {"data": "bug_id"},
                    {"data": "target_frame"},
                    {"data": "green_test_count"},
                    {"data": "red_test_count"},
                    {"data": "exam_score"},
                    {"data": "ochiai_exam_score"},
                    {"data": "dstar_exam_score"},
                    {"data": "barinel_exam_score"},
                    {"data": "tarantula_exam_score"},
                    {"data": "category"},
                    {"data": "description"},
                ],
                columnDefs: [
                    {
                        targets: [1, 2, 3, 4, 5, 6, 7, 8,],
                        className: "text-center"
                    },
                    {
                        targets: [5, 6, 7, 8, 9],
                        render: Results._renderResults
                    },
                    {
                        targets: [11],
                        render: (data) => {
                            if (data == null) {
                                return data;
                            }

                            if (data.length > 50) {
                                return data.substr(0, 50) + '...';
                            } else {
                                return data;
                            }
                        }
                    }
                ],
                paging: false,
                orderCellsTop: true,
                fixedHeader: true
            });
        },

        /**
         * Bind on the hml page.
         */
        binds: function () {
            $("#reloadTable").on('click', Results._reloadTable);
            $("#navigation-select").on('change', Results.redirect);

            let tableBody = $("#table tbody");
            tableBody.on('click', 'tr', Results._rowClick);
            tableBody.on('dblclick', 'tr', Results._rowDoubleClick);

            let resultsModal = $('#resultsModal .form-control');
            resultsModal.on('keyup change', Results._debounce(Results._submitModalForm, 500));
            resultsModal.on('keydown', Results._removeSavedButton);
        },

        /**
         * Redirect on navigation change.
         *
         * @param e
         */
        redirect: function (e) {
            window.location.replace('/index.php?q=results&type=' + e.target.value);
        },

        /**
         * Reload the datatable.
         *
         * @private
         */
        _reloadTable: function () {
            Results.table.ajax.reload(null, false);

            $('#toast .toast-body').html('Table reloaded!');
            $('#toast').toast('show');
        },

        /**
         * Add input headers.
         *
         * @private
         */
        _addInputHeader: function () {
            $('#table thead tr').clone(true).appendTo('#table thead');
            $('#table thead tr:eq(1) th').each(function (index) {
                let title = $(this).text();
                $(this).html('<input class="form-control form-control-sm" type="text" data-column-index="' + index + '" placeholder="Search ' + title + '" />');

                $('input', this).on('keyup change clear', Results._searchTableColumn);
            });
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

            if (Results.table.column(columnIndex).search() !== this.value) {
                if (firstChar === "^" && lastChar === "$") {
                    Results.table.column(columnIndex).search(this.value, true, false).draw();
                } else {
                    Results.table.column(columnIndex).search(this.value).draw();
                }
            }
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
         * Click on a row.
         *
         * @private
         */
        _rowDoubleClick: function () {
            let data = Results.table.row(this).data();

            if (data !== undefined) {
                Results._resetModal();
                Results._fillModal(data);

                $('#resultsModal').modal('show');
            }
        },

        /**
         * Render the results fo the table.
         *
         * @param data
         * @returns {string}
         * @private
         */
        _renderResults: (data) => {
            let number = parseFloat(data);

            if (isNaN(number) || number === 9223372036854776000) {
                return '<i class="fas fa-fw fa-times text-danger"></i><span class="d-none">false</span>';
            } else {
                return number.toFixed(10);
            }
        },

        /**
         * Reset the modal.
         *
         * @private
         */
        _resetModal: function () {
            $('#resultsModal .form-control').each(function (index, element) {
                element.value = '';
            });
            $('#resultsModal #defective_statement').html('');

            $('#resultsModal .table-control').each(function (index, element) {
                element.innerHTML = '';
            });

            $("#resultsModal #testCase").html('');
            $("#resultsModal #files").html('');
        },

        /**
         * Fill the modal.
         *
         * @param data
         * @private
         */
        _fillModal(data) {
            $('#resultsModal .form-control').each(function (index, element) {
                element.value = data[element.getAttribute('data-column')];
            });
            $('#defective_statement').html(data['defective_statement'].replace(/\s/g, "\n"));
            $('.table-control').each(function (index, element) {
                element.innerHTML = data[element.getAttribute('data-column')];
            });

            let projectId = data['project_id'];
            let bugId = data['bug_id'];
            let targetFrame = data['target_frame'];

            this._listExperimentFiles(projectId, bugId, targetFrame);
            this._getTestCase(projectId, bugId, targetFrame);
        },

        /**
         * Get the corresponding test case.
         *
         * @param projectId
         * @param bugId
         * @param targetFrame
         * @private
         */
        _getTestCase: function (projectId, bugId, targetFrame) {
            let problemUrl = 'http://10.33.0.236:9001/?project_id=' + projectId + '&bug_id=' + bugId + '&target_frame=' + targetFrame;
            let testCaseUrl = problemUrl + '&testcase=' + Results.settings.testCaseName;

            $.ajax({
                url: testCaseUrl,
                success: function (data) {
                    $("#testCase").html(data);
                }
            })
        },

        /**
         * List the experiment files.
         *
         * @param projectId
         * @param bugId
         * @param targetFrame
         * @private
         */
        _listExperimentFiles: function (projectId, bugId, targetFrame) {
            let problemUrl = 'http://10.33.0.236:9001/?project_id=' + projectId + '&bug_id=' + bugId + '&target_frame=' + targetFrame;
            let fileUrl = problemUrl + '&experiment=' + Results.settings.experimentName;

            $.ajax({
                url: fileUrl,
                success: function (data) {
                    $.each(data, function (data, element) {
                        $("#files").append(
                            '<a href="' + fileUrl + '&file=' + element + '" '
                            + 'class="list-group-item list-group-item-action" target="_blank">'
                            + '<i class="far fa-fw fa-file-code mr-2" />'
                            + element +
                            '</a>'
                        );
                    });
                },
            });
        },

        /**
         * Submit the content of the modal.
         *
         * @private
         */
        _submitModalForm: function () {
            let requestBody = {};
            $('#resultsModal .form-control').each(function (index, element) {
                requestBody[element.getAttribute('data-column')] = element.value;
            });

            $.ajax({
                url: Results.settings.updateUrl + '/' + requestBody['id'],
                type: 'POST',
                data: requestBody,
                complete: function () {
                    $("#saved").addClass('d-block').removeClass('d-none');

                    Results.table.ajax.reload(null, false);
                }
            });
        },

        /**
         *
         * @param func
         * @param wait
         * @param immediate
         * @returns {Function}
         * @private
         */
        _debounce: function (func, wait, immediate) {
            let timeout;
            return function () {
                let context = this, args = arguments;
                let later = function () {
                    timeout = null;
                    if (!immediate) func.apply(context, args);
                };
                let callNow = immediate && !timeout;
                clearTimeout(timeout);
                timeout = setTimeout(later, wait);
                if (callNow) func.apply(context, args);
            };
        }
    }
})(jQuery);
