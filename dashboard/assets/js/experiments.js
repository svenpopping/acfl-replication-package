let Experiments;

(function ($) {
    Experiments = {

        table: null,

        settings: {
            dataUrl: null,
            updateUrl: null,
        },

        /**
         * Init the Experiments table.
         *
         * @param settings
         */
        init: function (settings) {
            Experiments.settings = settings;

            $('#toast').toast({
                delay: 2000
            });

            Experiments.setup();
            Experiments.binds();
        },

        /**
         * Setup the DataTable.
         *
         * @returns {boolean}
         */
        setup: function () {
            if (Experiments.table !== null) {
                console.error('Experiment table has already been initialised.');
                return false;
            }

            Experiments._addInputHeader();
            Experiments.table = $("#table").DataTable({
                ajax: {
                    url: Experiments.settings.dataUrl,
                    dataSrc: ''
                },
                order: [[0, 'asc'], [1, 'asc'], [2, 'asc']],
                columns: [
                    {"data": "project_id"},
                    {"data": "bug_id"},
                    {"data": "target_frame"},
                    {"data": "exp_human_human"},
                    {"data": "exp_botsing_human"},
                    {"data": "exp_mult_botsing_human"},
                    {"data": "exp_botsing_evosuite"},
                    {"data": "exp_mult_botsing_evosuite"},
                    {"data": "description"},
                ],
                columnDefs: [
                    {
                        targets: [1, 2],
                        className: "text-center"
                    },
                    {
                        targets: [3, 4, 5, 6, 7],
                        render: Experiments._renderBooleanIcons
                    }
                ],
                paging: false,
                orderCellsTop: true,
                fixedHeader: true
            });
        },

        /**
         * Events binds.
         */
        binds: function () {
            $("#reloadTable").on('click', Experiments._reloadTable);
            $("#table tbody").on('click', 'tr', Experiments._rowClick);

            let resultsModal = $('#resultsModal .form-control');
            resultsModal.on('keyup', Experiments._debounce(Experiments._submitModalForm, 500));
            resultsModal.on('keydown', Experiments._removeSavedButton);

            $('#resultsModal input[type=radio]').on('change', Experiments._submitModalForm);
        },

        /**
         * Reload the datatable.
         *
         * @private
         */
        _reloadTable: function () {
            Experiments.table.ajax.reload(null, false);

            $('#toast .toast-body').html('Table reloaded!');
            $('#toast').toast('show');
        },

        /**
         * Click on a row.
         *
         * @private
         */
        _rowClick: function () {
            let data = Experiments.table.row(this).data();

            if (data !== undefined) {
                Experiments._resetModal();
                Experiments._fillModal(data);

                $('#resultsModal').modal('show');
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

            $('#resultsModal input[type=radio]').each(function () {
                $(this).prop('checked', false);
                $(this).parent().removeClass('active');
            });
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

            let experiments = ['exp_human_human', 'exp_botsing_human', 'exp_mult_botsing_human', 'exp_botsing_evosuite', 'exp_mult_botsing_evosuite'];

            experiments.forEach(function (value) {
                let expHumanHuman = $('#' + value + '_' + data[value]);
                expHumanHuman.prop('checked', true);
                expHumanHuman.parent().addClass('active');
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

                $('input', this).on('keyup change clear', Experiments._searchTableColumn);
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

            if (Experiments.table.column(columnIndex).search() !== this.value) {
                if (firstChar === "^" && lastChar === "$") {
                    Experiments.table.column(columnIndex).search(this.value, true, false).draw();
                } else {
                    Experiments.table.column(columnIndex).search(this.value).draw();
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

        /**
         * Remove saved message.
         *
         * @private
         */
        _removeSavedButton: function () {
            $("#saved").addClass('d-none').removeClass('d-block');
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

            $('#resultsModal input[name^=exp_]:checked').each(function (index, element) {
                requestBody[element.name] = element.id.split('_').slice(-1)[0];
            });

            $.ajax({
                url: Experiments.settings.updateUrl + '/' + requestBody['id'],
                type: 'POST',
                data: requestBody,
                complete: function () {
                    $("#saved").addClass('d-block').removeClass('d-none');

                    Experiments.table.ajax.reload(null, false);
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
