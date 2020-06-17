SELECT
	LEAST(
		IFNULL(dstar_exam_score, ~0 >> 1),
		IFNULL(barinel_exam_score, ~0 >> 1),
		IFNULL(tarantula_exam_score, ~0 >> 1),
		IFNULL(ochiai_exam_score, ~0 >> 1)
	) as exam_score
FROM ths_results
WHERE
    LEAST(
		IFNULL(dstar_exam_score, ~0 >> 1),
		IFNULL(barinel_exam_score, ~0 >> 1),
		IFNULL(tarantula_exam_score, ~0 >> 1),
		IFNULL(ochiai_exam_score, ~0 >> 1)
	) < ~0 >> 1
AND
    experiment_id = ?
