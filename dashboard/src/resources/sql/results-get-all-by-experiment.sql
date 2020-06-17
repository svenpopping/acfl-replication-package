SELECT
    tr.id,
    tr.experiment_id,
    tp.id as problem_id,
    ts.project_id,
    ts.bug_id,
    tp.target_frame,
    tp.defective_statement,
    tp.sloc,
    tr.green_test_count,
    tr.red_test_count,
    tr.barinel_exam_score,
    tr.dstar_exam_score,
    tr.ochiai_exam_score,
    tr.tarantula_exam_score,
    LEAST(
		IFNULL(dstar_exam_score, ~0 >> 1),
		IFNULL(barinel_exam_score, ~0 >> 1),
		IFNULL(tarantula_exam_score, ~0 >> 1),
		IFNULL(ochiai_exam_score, ~0 >> 1)
	) as exam_score,
    tr.category,
    tr.description
FROM ths_problems tp
    INNER JOIN ths_software ts ON tp.software_id = ts.id
    LEFT JOIN ths_results tr ON tr.problem_id = tp.id
WHERE tr.experiment_id = %s
