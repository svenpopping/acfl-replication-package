let Graphs;

Chart.plugins.register({
    beforeDraw: function(chartInstance) {
        let ctx = chartInstance.chart.ctx;
        ctx.fillStyle = "white";
        ctx.fillRect(0, 0, chartInstance.chart.width, chartInstance.chart.height);
    }
});

(function ($) {
    Graphs = {

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
        init: (settings) => {
            Graphs.settings = settings;
            Graphs._renderBestFormulaBarChart();
            Graphs._renderExamScoreDistribution();

            Graphs.binds();
        },

        /**
         * Bind on the hml page.
         */
        binds: () => {

        },

        /**
         *
         * @private
         */
        _renderBestFormulaBarChart: () => {
            Graphs._getData('/api/v1/graphs/best-formula-distribution', (data) => {
                let ctx = document.getElementById('line-chart').getContext('2d');
                let chart = new Chart(ctx, {
                    type: 'bar',
                    data: data,
                    options: {
                        scales: {
                            yAxes: [{
                                ticks: {
                                    beginAtZero: true
                                }
                            }]
                        },
                        animation: {
                            onComplete: () => {
                                $("#line-chart-download").attr('href', chart.toBase64Image());
                            }
                        }
                    }
                });
            });
        },

        /**
         * Render EXAM Score distribution graphs.
         *
         * @private
         */
        _renderExamScoreDistribution: () => {
            Graphs._getData('/api/v1/graphs/exam-score-boxplot', (data) => {
                let ctx = document.getElementById('exam-score-boxplot').getContext('2d');
                let chart = new Chart(ctx, {
                    type: 'boxplot',
                    data: data,
                    options: {
                        tooltipDecimals: 5,
                        responsive: true,
                        legend: {
                            position: 'top',
                        },
                        scales: {
                            yAxes: [{
                                ticks: {
                                    maxStats: 'max',
                                    coef: 1.5,
                                    beginAtZero: true
                                }
                            }]
                        },
                        animation: {
                            onComplete: () => {
                                $("#exam-score-boxplot-download").attr('href', chart.toBase64Image());
                            }
                        }
                    }
                });

                let labels = chart.data.labels;
                $.each(labels, (index, label) => {
                    let ctx = $("#exam-score-boxplot-statistics");
                    let statsData1 = chart.data.datasets[0].data[index].__stats;
                    let statsData2 = chart.data.datasets[1].data[index].__stats;

                    // @formatter:off
                    let nodes = '<div class="row">' +
                        '<p class="col-12 font-weight-bold mb-0">' + label + '</p>' +
                        '<pre class="col">' +
                        'Problems' + "\n" +
                        'median: ' + statsData1.median.toFixed(5) + "\n" +
                        'min:    ' + statsData1.min.toFixed(5) + "\n" +
                        'max:    ' + statsData1.max.toFixed(5) + "\n" +
                        'q1:     ' + statsData1.q1.toFixed(5) + "\n" +
                        'q3:     ' + statsData1.q3.toFixed(5) + "\n" +
                        '</pre>' +
                        '<pre class="col">' +
                        'Including extra problems' + "\n" +
                        'median: ' + statsData2.median.toFixed(5) + "\n" +
                        'min:    ' + statsData2.min.toFixed(5) + "\n" +
                        'max:    ' + statsData2.max.toFixed(5) + "\n" +
                        'q1:     ' + statsData2.q1.toFixed(5) + "\n" +
                        'q3:     ' + statsData2.q3.toFixed(5) + "\n" +
                        '</pre>' +
                        '</div>';
                    // @formatter:on

                    ctx.append(nodes);
                });
            });
        },

        /**
         * Get the data via AJAX request.
         *
         * @param url
         * @param callback
         */
        _getData(url, callback) {
            $.ajax({
                url: url,
                success: callback
            });
        }
    }
})(jQuery);
