SELECT dept_id, position, SUM(salary)
FROM y_emp
GROUP BY dept_id, position
ORDER BY dept_id;