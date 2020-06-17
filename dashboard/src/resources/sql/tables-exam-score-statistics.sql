SELECT COUNT(*)               as item_count,
       AVG(ochiai_exam_score) as avg_exam_score,
       STD(ochiai_exam_score) as std_exam_score,
       MIN(ochiai_exam_score) as min_exam_score,
       MAX(ochiai_exam_score) as max_exam_score
FROM ths_results
WHERE IFNULL(ochiai_exam_score, ~0 >> 1) < ~0 >> 1
  AND experiment_id = ?
  AND problem_id IN (
    SELECT problem_id
    FROM ths_results
    WHERE experiment_id = 5
      AND IFNULL(ochiai_exam_score, ~0 >> 1) < ~0 >> 1
)
