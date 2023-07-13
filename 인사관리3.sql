select Lower(email),upper(email),initcap(email)
from y_emp;

select substr(emp_name,2,3)
from y_emp;

select INSTR(emp_name,'Çý')
from y_emp;

select emp_id , emp_name ,comm 
from y_emp
where comm is not null;

SELECT emp_name || '''s Salary : ' || salary AS "Employee's Salary"
FROM y_emp;

select emp_name ||q'[ 's salray ]'|| salary
from y_emp;

SELECT emp_name, salary*12 annsal
FROM y_emp
WHERE salary * 12 > 8000;

SELECT emp_name, position, dept_id, hiredate
FROM y_emp
ORDER BY hiredate ASC;