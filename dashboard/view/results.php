<?php
switch ($_GET['type']) {
    case 1:
        $testCase = 'red-human';
        break;
    case 2:
    case 4:
        $testCase = 'red-botsing';
        break;
    case 3:
    case 5:
        $testCase = 'red-botsing-multiple';
        break;
}
?>
<div class="form-group">
    <label for="navigation-select" class="font-weight-bold">Experiment</label>
    <select class="custom-select" name="" id="navigation-select">
        <?php
        foreach (json_decode(file_get_contents('http://localhost/api/v1/experiments/'), true) as $experiment) {
            if ($experiment['id'] === $_GET['type']) {
                $type = $experiment['name'];
                ?>
                <option <?= (($experiment['id'] === $_GET['type']) ? 'selected' : '') ?>
                        value="<?= $experiment['id'] ?>"><?= $experiment['name'] ?></option>
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

<a href="#" class="btn btn-dark btn-sm btn-block mb-2" id="reloadTable">
    <i class="fas fa-fw fa-sync"></i> reload
</a>

<div aria-live="polite" aria-atomic="true" style="position: fixed; bottom: 20px; left: 20px; z-index: 1000;">
    <div class="toast" id="toast">
        <div class="toast-body bg-dark text-white">
        </div>
    </div>
</div>

<table id="table" class="table table-striped table-responsive-lg" style="max-width: 100% !important;">
    <thead>
    <tr>
        <th>Project</th>
        <th>Bug</th>
        <th>Frame</th>
        <th># passing test cases</th>
        <th># failing test cases</th>
        <th>EXAM Score</th>
        <th>Ochiai</th>
        <th>DStar</th>
        <th>Barinel</th>
        <th>Tarantula</th>
        <th>Category</th>
        <th>Description</th>
    </tr>
    </thead>
    <tbody>

    </tbody>
</table>

<!-- Modal -->
<div class="modal fade" id="resultsModal" tabindex="-1" role="dialog" aria-hidden="true">
    <div class="modal-dialog" style="max-width: calc(70vw)" role="document">
        <div class="modal-content">
            <div class="modal-header">
                <h5 class="modal-title">Edit record</h5>
                <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                    <span aria-hidden="true">&times;</span>
                </button>
            </div>
            <div class="modal-body">
                <div class="container-fluid">
                    <div class="row">
                        <div class="col-6">
                            <input type="hidden" class="form-control" name="id" id="id" data-column="id"/>
                            <div class="form-group">
                                <label for="project_id" class="font-weight-bold col-form-label">Project</label>
                                <input type="text" class="form-control" name="project_id" id="project_id" placeholder=""
                                       readonly data-column="project_id">
                            </div>
                            <div class="form-group">
                                <label for="bug_id" class="font-weight-bold col-form-label">Bug</label>
                                <input type="text" class="form-control" name="bug_id" id="bug_id" placeholder=""
                                       readonly data-column="bug_id">
                            </div>
                            <div class="form-group">
                                <label for="target_frame" class="font-weight-bold col-form-label">Target frame</label>
                                <input type="text" class="form-control" name="target_frame" id="target_frame"
                                       placeholder="" readonly data-column="target_frame">
                            </div>
                            <div class="form-group">
                                <label for="defective_statement" class="font-weight-bold col-form-label">Defective
                                    statement(s)</label>
                                <figure class="highlight pt-0">
                                    <pre><code data-column="defective_statement"
                                               id="defective_statement">code block</code></pre>
                                </figure>
                            </div>
                            <div class="form-group">
                                <label class="font-weight-bold col-form-label">AFL Results</label>
                                <table class="table table-striped table-sm">
                                    <thead>
                                    <tr>
                                        <th></th>
                                        <th>EXAM Score</th>
                                    </tr>
                                    </thead>
                                    <tbody>
                                    <tr>
                                        <th>Highest</th>
                                        <td class="table-control" data-column="exam_score"></td>
                                    </tr>
                                    <tr>
                                        <th>Ochiai</th>
                                        <td class="table-control" data-column="ochiai_exam_score"></td>
                                    </tr>
                                    <tr>
                                        <th>DStar</th>
                                        <td class="table-control" data-column="dstar_exam_score"></td>
                                    </tr>
                                    <tr>
                                        <th>Tarantula</th>
                                        <td class="table-control" data-column="tarantula_exam_score"></td>
                                    </tr>
                                    <tr>
                                        <th>Barinel</th>
                                        <td class="table-control" data-column="barinel_exam_score"></td>
                                    </tr>
                                    </tbody>
                                </table>
                            </div>
                            <div class="form-group">
                                <label for="category" class="font-weight-bold col-form-label">Category</label>
                                <select class="form-control custom-select" name="category" id="category"
                                        data-column="category">
                                    <option>EXPERIMENT_FAILED</option>
                                    <option>NO_DEFECTIVE_FRAME</option>
                                    <option>NO_DEFECTIVE_STATEMENT</option>
                                    <option>OTHER</option>
                                    <option></option>
                                </select>
                            </div>
                            <div class="form-group">
                                <label for="description">Description</label>
                                <textarea class="form-control" data-column="description" name="description"
                                          id="description" rows="5"></textarea>
                            </div>
                        </div>
                        <div class="col-6">
                            <div class="form-group">
                                <label for="testCase" class="font-weight-bold col-form-label">Test case</label>
                                <figure class="highlight pt-0">
                                    <pre><code id="testCase">code block</code></pre>
                                </figure>
                            </div>
                            <div class="form-group">
                                <label for="files" class="font-weight-bold col-form-label">Files</label>
                                <div class="list-group" id="files">
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            <div class="modal-footer justify-content-between">
                <div>
                    <span class="d-none" id="saved">
                        <i class="far fa-fw fa-save text-success"></i> Content saved!
                    </span>
                </div>
                <button type="button" class="btn btn-secondary align-self-end" data-dismiss="modal">Close</button>
            </div>
        </div>
    </div>
</div>

@@@@@@

<script src="assets/js/results.js" type="text/javascript"></script>
<script type="text/javascript">
    jQuery(document).ready(function ($) {
        Results.init({
            dataUrl: "/api/v1/results/<?= $_GET['type'] ?>",
            updateUrl: "/api/v1/results",
            experimentName: "<?= str_replace("_", "-", $type) ?>",
            testCaseName: "<?= $testCase ?> ",
        });
    });
</script>