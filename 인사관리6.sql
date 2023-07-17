INSERT INTO emp300
SELECT emp_id, emp_name, salary, dept_id
FROM y_emp
WHERE dept_id = 300;
SELECT * 
FROM emp300;
 COMMIT;
 
INSERT INTO emp300(emp_id, emp_name,salary) -- ¿À·ù  ORA-00913 too many values
SELECT emp_id, emp_name, salary, dept_id
FROM y_emp
WHERE
dept_id = 200;

select *
from y_dept;

INSERT INTO y_emp(emp_id, emp_name, hiredate, dept_id)
VALUES(2007,' ¹Ú¹Î¿µ ', SYSDATE, 700);

rollback;
select *
from y_dept;

insert into y_dept(dept_id , dept_name,loc_id,mgr_id)
values(600,'»ý»ê°ü¸®',6,1038);


select *
from y_dept;
commit;

SELECT emp_id, emp_name, hiredate, dept_id
FROM y_emp;
--WHERE emp_id = 2007;

INSERT INTO y_emp(emp_id, emp_name,hiredate)
VALUES (2008, 'À±Çö¹Î ', TO_DATE('99/02/03','YY/MM/dd'));

SELECT emp_id, emp_name, hiredate, dept_id
FROM y_emp;

INSERT INTO y_emp(emp_id, emp_name,hiredate)
VALUES(2009,'Jason Lee',TO_DATE('99/02/03','RR/MM/DD'));

commit;

select emp_id, emp_name
from y_emp
where emp_name = 'À±Çö¹Î' and  to_char(hiredate,'RR/mm/dd') = 'yyyy';

DELETE FROM y_dept
WHERE dept_id = 600 AND dept_name = '»ý»ê°ü¸®'
AND loc_id = null AND mgr_id = null;

insert into emp300
select emp_id,emp_name,salary , dept_id
from y_emp
where dept_id =300;
commit;

select *
from y_emp;
INSERT ALL
INTO sal_list VALUES(emp_id, salary, position)
INTO mgr_list VALUES(emp_id, mgr_id, hiredate)
SELECT emp_id, hiredate, salary, position , mgr_id
FROM y_emp
WHERE emp_id > 2000 ;

select * 
from sal_list;
select * 
from mgr_list;

INSERT ALL
WHEN salary > 300
THEN INTO sal_list VALUES(emp_id, salary, position)
WHEN position <> ' ´ë¸® ' THEN
INTO mgr_list VALUES(emp_id, mgr_id, hiredate)

SELECT emp_id, hiredate, salary, position , mgr_id
FROM y_emp
WHERE emp_id > 1080;

select * 
from sal_list;
select * 
from mgr_list;



INSERT FIRST
WHEN SAL > 5000 THEN
INTO high_income VALUES (DEPTID, SAL)
WHEN HIREDATE like ('17%') THEN
INTO hired_list17 VALUES(DEPTID,HIREDATE)
WHEN HIREDATE like ('18%') THEN
INTO hired_list18 VALUES(DEPTID, HIREDATE)
ELSE INTO hired_list VALUES(DEPTID, HIREDATE)
SELECT dept_id DEPTID, SUM(salary) SAL, MAX(hiredate) HIREDATE
FROM y_emp
GROUP BY dept_id ;

select *
from hired_list18;
select *
from hired_list17;
select *
from hired_list;
select *
from hired_list17;
select *
from high_income;

commit;

DELETE FROM emp300
WHERE
emp_id = 1019;
commit;