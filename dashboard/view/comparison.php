<div class="row">
    <div class="col-6">
        <div class="form-group">
            <label for="navigation-select-results-a" class="font-weight-bold">Experiment A</label>
            <select class="custom-select" name="" id="navigation-select-results-a" data-variable="resultsA">
                <?php
                foreach (json_decode(file_get_contents('http://localhost/api/v1/experiments'), true) as $experiment) {
                    if ($experiment['id'] === $_GET['resultsA']) {
                        $resultsA = $experiment['name'];
                        ?>
                        <option selected value="<?= $experiment['id'] ?>"><?= $experiment['name'] ?></option>
                        <?php
                    } else {
                        ?>
                        <option value="<?= $experiment['id'] ?>"><?= $experiment['name'] ?></option>
                        <?php
                    }
                }
                ?>
            </select>
        </div>
    </div>
    <div class="col-6">
        <div class="form-group">
            <label for="navigation-select-results-b" class="font-weight-bold">Experiment B</label>
            <select class="custom-select" name="" id="navigation-select-results-b" data-variable="resultsB">
                <?php
                foreach (json_decode(file_get_contents('http://localhost/api/v1/experiments'), true) as $experiment) {
                    if ($experiment['id'] === $_GET['resultsB']) {
                        $resultsB = $experiment['name'];
                        ?>
                        <option selected value="<?= $experiment['id'] ?>"><?= $experiment['name'] ?></option>
                        <?php
                    } else {
                        ?>
                        <option value="<?= $experiment['id'] ?>"><?= $experiment['name'] ?></option>
                        <?php
                    }
                }
                ?>
            </select>
        </div>
    </div>
</div>

<table id="table" class="table table-responsive-lg" style="max-width: 100% !important;">
    <thead>
    <tr class="text-center">
        <th></th>
        <th></th>
        <th></th>
        <th></th>
        <th colspan="4">Results A</th>
        <th></th>
        <th colspan="4">Results B</th>
        <th></th>
        <th></th>
    </tr>
    <tr>
        <th>Project</th>
        <th>Bug</th>
        <th>Frame</th>
        <th>Buggy frame</th>
        <th class="text-center"># pass</th>
        <th class="text-center"># fail</th>
        <th class="text-center">EXAM Score</th>
        <th class="text-center">Ranking</th>
        <th></th>
        <th class="text-center">Ranking</th>
        <th class="text-center">EXAM Score</th>
        <th class="text-center"># fail</th>
        <th class="text-center"># pass</th>
        <th>Category</th>
        <th>Description</th>
    </tr>
    </thead>
    <tbody>

    </tbody>
</table>

@@@@@@

<script src="/assets/js/comparison.js" type="text/javascript"></script>
<script type="text/javascript">
    jQuery(document).ready(function ($) {
        Comparison.init({
            dataUrl: '/api/v1/comparision/<?= $resultsA ?>/<?= $resultsB ?>'
        });
    });
</script>
