<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Botsing Evaluation</title>

    <link rel="stylesheet" href="/assets/css/bootstrap.min.css">
    <link rel="stylesheet" href="/assets/css/datatables.min.css">
    <link rel="stylesheet" href="/assets/css/main.css">
    <link rel="stylesheet" href="/assets/css/all.min.css">
</head>
<body>
<nav class="navbar navbar-light navbar-expand-lg bg-dark navbar-dark mb-4">
    <a href="" class="navbar-brand text-light">Search-based Crash Reproduction Evaluation</a>
    <div class="collapse navbar-collapse" id="navbarNav">
        <ul class="navbar-nav">
            <li class="nav-item">
                <a href="/index.php?q=problems" class="nav-link">problems</a>
            </li>
            <li class="nav-item">
                <a href="/index.php?q=experiments" class="nav-link">experiments</a>
            </li>
            <li class="nav-item">
                <a href="/index.php?q=results&type=1" class="nav-link">results</a>
            </li>
            <li class="nav-item">
                <a href="/index.php?q=comparison&resultsA=1&resultsB=2" class="nav-link">comparison</a>
            </li>
        </ul>
    </div>
</nav>

<div aria-live="polite" aria-atomic="true" style="position: fixed; bottom: 20px; left: 20px; z-index: 1000;">
    <div class="toast" id="toast">
        <div class="toast-body bg-dark text-white">
        </div>
    </div>
</div>

<div class="container-fluid">
    %s
</div>

<script src="/assets/js/vendor/jquery-3.3.1.min.js"></script>
<script src="/assets/js/vendor/datatables.min.js"></script>
<script src="/assets/js/vendor/bootstrap.min.js"></script>
<script src="/assets/js/vendor/Chart.min.js"></script>
<script src="/node_modules/chartjs-chart-box-and-violin-plot/build/Chart.BoxPlot.min.js"></script>
<script src="/node_modules/clipboard/dist/clipboard.min.js"></script>
%s
</body>
</html>
