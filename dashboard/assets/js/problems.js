let Problems;

(function ($) {
    Problems = {

        table: null,

        settings: {
            dataUrl: null,
            updateUrl: null,
        },

        /**
         * Init the problem page.
         *
         * @param settings
         */
        init: function (settings) {
            Problems.settings = settings;

            Problems.setup();
            Problems.binds();
        },

        /**
         * Setup the table.
         *
         * @returns {boolean}
         */
        setup: function () {
            if (Problems.table !== null) {
                console.error('Experiment table has already been initialised.');
                return false;
            }

            Problems._addInputHeader();
            Problems.table = $("#table").DataTable({
                ajax: {
                    url: Problems.settings.dataUrl,
                    dataSrc: ''
                },
                order: [[0, 'asc'], [1, 'asc'], [2, 'asc']],
                columns: [
                    {"data": "project_id"},
                    {"data": "bug_id"},
                    {"data": "target_frame"},
                    {"data": "defective_statement"},
                    {"data": "docker_defects4j_runner"},
                    {"data": "docker_botsing_runner"},
                    {"data": "docker_botsing_multiple_runner"},
                    {"data": "docker_evosuite_runner"},
                ],
                columnDefs: [
                    {
                        targets: [1, 2],
                        className: "text-center"
                    },
                    {
                        targets: 3,
                        render: function (data) {
                            return '<code>' + (data.length > 255 ? data.substr(0, 255) + '...' : data) + '</code>';
                        },
                    },
                    {
                        targets: [4, 5, 6, 7],
                        render: Problems._renderBooleanIcons
                    }
                ],
                paging: false,
                orderCellsTop: true,
                fixedHeader: true
            });
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

                $('input', this).on('keyup change clear', Problems._searchTableColumn);
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

            if (Problems.table.column(columnIndex).search() !== this.value) {
                if (firstChar === "^" && lastChar === "$") {
                    Problems.table.column(columnIndex).search(this.value, true, false).draw();
                } else {
                    Problems.table.column(columnIndex).search(this.value).draw();
                }
            }
        },

        /**
         * Render the boolean icons based on the data in the field.
         *
         * @param data
         * @returns {string}
         * @private
         */
        _renderBooleanIcons: function (data) {
            if (data === '-1') {
                return '<i class="fas fa-fw fa-question text-black-50"></i><span class="d-none">none</span>';
            } else if (data === '0') {
                return '<i class="fas fa-fw fa-times text-danger"></i><span class="d-none">false</span>';
            } else {
                return '<i class="fas fa-fw fa-check text-success"></i><span class="d-none">true</span>';
            }
        },
    }
})(jQuery);
