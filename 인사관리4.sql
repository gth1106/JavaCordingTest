--1번
select emp_id,emp_name,substr(email,1,3) as email ,length(email)
from y_emp
where birthdate >= '89/01/01';

select birthdate,emp_name
from y_emp
where birthdate >= '89/01/01';

--2번
select emp_id,emp_name,RPAD(email,15,'*') as email , LPAD(salary,10,'*') as lpad
from y_emp;
--3번
--4번
select emp_name,gender,dept_id, concat(email,'@yj.com') as 이메일
from y_emp
where emp_name Like '%현%';
--5반
select emp_id,emp_name,salary,position, trunc(months_between(sysdate,hiredate)) as 근무기간
from y_emp
where dept_id =300;
--6번
select emp_id,emp_name,position,salary
from y_emp
where dept_id IN (200,300) AND mgr_id =1044;
--7번
select emp_id,emp_name,phone,dept_id
from y_emp
where phone Like '053%';
--8번
select emp_id,emp_name,salary*12,hiredate
from y_emp;

SELECT emp_name, TO_CHAR(hiredate,'yyyy') 입사년도 
       ,TO_CHAR((salary+nvl(comm,0))*12, 'L99,999') as "연봉합계"
from y_emp;
--9번

select emp_id,emp_name,dept_id,NVL(comm,0) 수당율 ,NVL2(comm,'Yes','No') 비고
from y_emp;
--10
select emp_id ,emp_name,position,dept_id
from y_emp
where  salary = (select min(salary)
                  from y_emp);
--11 부서별 인원수 평균 급여 .급여 총합결과 아래 전체 사원수 , 전체 사원의 평균급여,
--   를 만족하는 부서별 정보와 사원전체정보를 함께출력.
select dept_id,count(dept_id) 사원수, trunc(avg(salary)) 부서평균급여 
    , sum(salary) 부서급여총합, COUNT(*) AS 전체사원수 
from y_emp
where dept_id is not null
group by dept_id
having count(dept_id) >1 ;
 
select *
from y_emp
where emp_id not in (select mgr_id from y_emp
                     where mgr_id is not null);

--12
SELECT e.emp_id, e.emp_name,e.position, d.dept_id, d.dept_name
FROM y_emp e left OUTER JOIN y_dept d
ON (e.dept_id = d.dept_id)
order by d.dept_name ASC;



