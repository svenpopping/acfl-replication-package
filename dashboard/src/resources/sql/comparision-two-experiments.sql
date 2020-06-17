SELECT
    trA.id as trA_id,
    trB.id as trB_id,
	trA.problem_id,
	ts.project_id,
	ts.bug_id,
	ts.buggy_frame,
	tp.target_frame,
	tp.sloc,
	trA.green_test_count as trA_passing_tests,
	trA.red_test_count as trA_failing_tests,
	trB.green_test_count as trB_passing_tests,
	trB.red_test_count as trB_failing_tests,
	LEAST(
		IFNULL(trA.dstar_exam_score, ~0 >> 1),
		IFNULL(trA.barinel_exam_score, ~0 >> 1),
		IFNULL(trA.tarantula_exam_score, ~0 >> 1),
		IFNULL(trA.ochiai_exam_score, ~0 >> 1)
	) as trA_exam_score,
	LEAST(
		IFNULL(trB.dstar_exam_score, ~0 >> 1),
		IFNULL(trB.barinel_exam_score, ~0 >> 1),
		IFNULL(trB.tarantula_exam_score, ~0 >> 1),
		IFNULL(trB.ochiai_exam_score, ~0 >> 1)
	) as trB_exam_score
FROM ths_results trA
INNER JOIN ths_results trB ON trA.problem_id  = trB.problem_id
INNER JOIN ths_problems tp ON trA.problem_id = tp.id
INNER JOIN ths_software ts ON tp.software_id = ts.id
WHERE trA.experiment_id = (SELECT id FROM ths_experiments WHERE name = ?)
AND trB.experiment_id = (SELECT id FROM ths_experiments WHERE name = ?);
