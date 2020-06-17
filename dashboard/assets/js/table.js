let Table;

(function ($) {
    Table = {

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
            Table.settings = settings;
            Table._generateExamScoreStatistics();

            $('#toast').toast({
                delay: 2000
            });

            Table.binds();
        },

        /**
         * Bind on the html page.
         */
        binds: function () {
            let clipboard = new ClipboardJS('.copyToLatexTable', {
                text: function (trigger) {
                    let tableId = $(trigger).attr('data-table');
                    Table._getLatexTable(tableId);

                    return $("#clipboard").val();
                }
            });

            clipboard.on('success', (e) => {
                $('#toast .toast-body').html('Table has been copied!');
                $('#toast').toast('show');

                e.clearSelection();
            })
        },


        /**
         * Generate EXAM score statistics tables.
         *
         * @private
         */
        _generateExamScoreStatistics: function () {
            $.ajax({
                url: '/api/v1/table/statistics-exam-score',
                success: function (data) {
                    $.each(data, function (index, element) {
                        if (element.column_name !== 'botsing-human' && element.column_name !== 'botsing-evosuite') {
                            $("#exam-score-statistics tbody").append('<tr>' +
                                '<td>' + element.column_name + '</td>' +
                                '<td class="text-center">' + element.item_count + '</td>' +
                                '<td class="text-center">' + Table._numberFormat(element.avg_exam_score) + '</td>' +
                                '<td class="text-center">' + Table._numberFormat(element.std_exam_score) + '</td>' +
                                '<td class="text-center">' + Table._numberFormat(element.min_exam_score) + '</td>' +
                                '<td class="text-center">' + Table._numberFormat(element.max_exam_score) + '</td>' +
                                '</tr>');
                        }
                    });
                }
            });

            $.ajax({
                url: '/api/v1/table/statistics-exam-score-filtered',
                success: function (data) {
                    $.each(data, function (index, element) {
                        $("#exam-score-statistics-filtered tbody").append('<tr>' +
                            '<td>' + element.column_name + '</td>' +
                            '<td class="text-center">' + element.item_count + '</>' +
                            '<td class="text-center">' + Table._numberFormat(element.avg_exam_score) + '</>' +
                            '<td class="text-center">' + Table._numberFormat(element.std_exam_score) + '</>' +
                            '<td class="text-center">' + Table._numberFormat(element.min_exam_score) + '</>' +
                            '<td class="text-center">' + Table._numberFormat(element.max_exam_score) + '</>' +
                            '</tr>');
                    });
                }
            });
        },

        _numberFormat: number => {
            return parseFloat(number).toFixed(5);
        },


        _getLatexTable: async tableId => {
            return await Promise.resolve($.ajax({
                url: '/api/v1/table/convert/latex',
                method: 'POST',
                async: false,
                data: {
                    table: document.getElementById(tableId).outerHTML
                },
                success: payload => {
                    $("#clipboard").val(payload);
                }
            }));
        }
    }
})(jQuery);
