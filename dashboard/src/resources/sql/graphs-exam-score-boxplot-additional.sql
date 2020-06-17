SELECT IFNULL(ochiai_exam_score, ~0 >> 1) as exam_score
FROM ths_results
WHERE IFNULL(ochiai_exam_score, ~0 >> 1) < ~0 >> 1
  AND experiment_id = ?
  AND problem_id IN (
    SELECT problem_id
    FROM ths_results
    WHERE experiment_id = 5
      AND IFNULL(ochiai_exam_score, ~0 >> 1) < ~0 >> 1
)