<a href="#" class="btn btn-dark btn-sm btn-block mb-2" id="reloadTable">
    <i class="fas fa-fw fa-sync"></i> reload
</a>

<div aria-live="polite" aria-atomic="true" style="position: absolute; bottom: 20px; left: 20px; z-index: 1000;">
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
        <th>Human/Human</th>
        <th>Botsing/Human</th>
        <th>Multiple Botsing/Human</th>
        <th>Botsing/EvoSuite</th>
        <th>Multiple Botsing/EvoSuite</th>
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
                                <label for="description" class="font-weight-bold col-form-label">Description</label>
                                <textarea class="form-control" name="description" id="description"
                                          placeholder="" data-column="description"></textarea>
                            </div>
                        </div>
                        <div class="col-6">
                            <div class="form-group row">
                                <label for="exp_human_human" class="font-weight-bold col-6 col-form-label">Experiment
                                    human-human</label>
                                <div class="col-6 btn-group btn-group-toggle" data-toggle="buttons">
                                    <label class="btn btn-light">
                                        <input type="radio" name="exp_human_human" id="exp_human_human_-1">
                                        <i class="fas fa-fw fa-question text-black-50"></i>
                                    </label>
                                    <label class="btn btn-light">
                                        <input type="radio" name="exp_human_human" id="exp_human_human_0">
                                        <i class="fas fa-fw fa-times text-danger"></i>
                                    </label>
                                    <label class="btn btn-light">
                                        <input type="radio" name="exp_human_human" id="exp_human_human_1">
                                        <i class="fas fa-fw fa-check text-success"></i>
                                    </label>
                                </div>
                            </div>
                            <div class="form-group row">
                                <label for="exp_botsing_human" class="font-weight-bold col-6 col-form-label">Experiment
                                    botsing-human</label>
                                <div class="col-6 btn-group btn-group-toggle" data-toggle="buttons">
                                    <label class="btn btn-light">
                                        <input type="radio" name="exp_botsing_human" id="exp_botsing_human_-1">
                                        <i class="fas fa-fw fa-question text-black-50"></i>
                                    </label>
                                    <label class="btn btn-light">
                                        <input type="radio" name="exp_botsing_human" id="exp_botsing_human_0">
                                        <i class="fas fa-fw fa-times text-danger"></i>
                                    </label>
                                    <label class="btn btn-light">
                                        <input type="radio" name="exp_botsing_human" id="exp_botsing_human_1">
                                        <i class="fas fa-fw fa-check text-success"></i>
                                    </label>
                                </div>
                            </div>
                            <div class="form-group row">
                                <label for="exp_mult_botsing_human" class="font-weight-bold col-6 col-form-label">Experiment
                                    mult_botsing-human</label>
                                <div class="col-6 btn-group btn-group-toggle" data-toggle="buttons">
                                    <label class="btn btn-light">
                                        <input type="radio" name="exp_mult_botsing_human"
                                               id="exp_mult_botsing_human_-1">
                                        <i class="fas fa-fw fa-question text-black-50"></i>
                                    </label>
                                    <label class="btn btn-light">
                                        <input type="radio" name="exp_mult_botsing_human" id="exp_mult_botsing_human_0">
                                        <i class="fas fa-fw fa-times text-danger"></i>
                                    </label>
                                    <label class="btn btn-light">
                                        <input type="radio" name="exp_mult_botsing_human" id="exp_mult_botsing_human_1">
                                        <i class="fas fa-fw fa-check text-success"></i>
                                    </label>
                                </div>
                            </div>
                            <div class="form-group row">
                                <label for="exp_botsing_evosuite" class="font-weight-bold col-6 col-form-label">Experiment
                                    botsing-evosuite</label>
                                <div class="col-6 btn-group btn-group-toggle" data-toggle="buttons">
                                    <label class="btn btn-light">
                                        <input type="radio" name="exp_botsing_evosuite" id="exp_botsing_evosuite_-1">
                                        <i class="fas fa-fw fa-question text-black-50"></i>
                                    </label>
                                    <label class="btn btn-light">
                                        <input type="radio" name="exp_botsing_evosuite" id="exp_botsing_evosuite_0">
                                        <i class="fas fa-fw fa-times text-danger"></i>
                                    </label>
                                    <label class="btn btn-light">
                                        <input type="radio" name="exp_botsing_evosuite" id="exp_botsing_evosuite_1">
                                        <i class="fas fa-fw fa-check text-success"></i>
                                    </label>
                                </div>
                            </div>
                            <div class="form-group row">
                                <label for="exp_mult_botsing_evosuite" class="col-6 font-weight-bold col-form-label">Experiment
                                    mult_botsing-evosuite</label>
                                <div class="col-6 btn-group btn-group-toggle" data-toggle="buttons">
                                    <label class="btn btn-light">
                                        <input type="radio" name="exp_mult_botsing_evosuite"
                                               id="exp_mult_botsing_evosuite_-1">
                                        <i class="fas fa-fw fa-question text-black-50"></i>
                                    </label>
                                    <label class="btn btn-light">
                                        <input type="radio" name="exp_mult_botsing_evosuite"
                                               id="exp_mult_botsing_evosuite_0">
                                        <i class="fas fa-fw fa-times text-danger"></i>
                                    </label>
                                    <label class="btn btn-light">
                                        <input type="radio" name="exp_mult_botsing_evosuite"
                                               id="exp_mult_botsing_evosuite_1">
                                        <i class="fas fa-fw fa-check text-success"></i>
                                    </label>
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

<script src="/assets/js/experiments.js" type="text/javascript"></script>
<script type="text/javascript">
    jQuery(document).ready(function ($) {
        Experiments.init({
            dataUrl: "/api/v1/experiments/runs",
            updateUrl: "/api/v1/experiments/runs",
        });
    });
</script>
