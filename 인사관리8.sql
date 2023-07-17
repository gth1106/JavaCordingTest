select emp_name,dept_name
from y_emp cross join y_dept;

SELECT dept_id, dept_name, city
FROM y_dept NATURAL JOIN y_loc
WHERE dept_id IN (100,200);

SELECT dept_id, dept_name, city
FROM y_dept NATURAL JOIN y_loc;

select emp_id ,emp_name,dept_id,dept_name -- 누구의 테이블 열 인지 알수없기 오류가떴다
from y_emp join y_dept
using (dept_id); -- 테이블 양쪽에서 사용하지만 중복으로 표시되지않게 using 절 사용

select  emp_name, dept_id , dept_name
from y_emp natural join y_dept
order by dept_id ASC;

SELECT emp_id, emp_name, d.mgr_id, dept_id, dept_name
FROM y_emp JOIN y_dept d
USING (dept_id);

select d.dept_id , d.dept_name , d.loc_id , l.city
from  y_loc l join y_dept d
on (d.loc_id = l.loc_id);

SELECT e.emp_id, e.emp_name, e.mgr_id, m.emp_name
FROM y_emp e JOIN y_emp m
ON (e.mgr_id = m.emp_id);

select emp_id,emp_name,mgr_id
from y_emp;

select y.emp_id,y.emp_name,y.mgr_id,m.emp_name
from y_emp y join y_emp m
on (y.mgr_id = m.emp_id);

select e.emp_id , d.dept_name , l.city
from y_emp e 
join y_dept d on (e.dept_id = d.dept_id) 
join y_loc l on (d.loc_id = l.loc_id);

SELECT e.emp_name, e.dept_id, d.dept_name
FROM y_emp e LEFT OUTER JOIN y_dept d
ON (e.dept_id = d.dept_id) ;

SELECT e.emp_name, d.dept_id, d.dept_name
FROM y_emp e RIGHT OUTER JOIN y_dept d
ON (e.dept_id = d.dept_id) ;

SELECT e.emp_name, e.dept_id, d.dept_name
FROM y_emp e FULL OUTER JOIN y_dept d
ON (e.dept_id = d.dept_id) ;



SELECT e.emp_id, e.emp_name, e.dept_id, d.loc_id
FROM y_emp e, y_dept d
WHERE e.dept_id = d.dept_id
AND e.dept_id BETWEEN 100 AND 300 ;

select e.emp_id , e.emp_name , e.dept_id , d.loc_id 
from y_emp e , y_dept d 
where e.dept_id = d.dept_id 
and e.dept_id between 100 and 300;

select e.emp_id , e.emp_name, e.salary , p.pay_level
from y_emp e , pay_grade p
where e.salary between p.low_pay and p.high_pay;

SELECT e.emp_id, e.emp_name, e.salary, p.pay_level
FROM y_emp e, pay_grade p
WHERE e.salary BETWEEN p.low_pay AND p.high_pay;

SELECT e.emp_id, e.emp_name, e.dept_id, d.dept_name
FROM y_emp e, y_dept d
WHERE e.dept_id=d.dept_id(+);

SELECT e.emp_id, e.emp_name, e.dept_id, d.dept_name
FROM y_emp e, y_dept d
WHERE e.dept_id(+) = d.dept_id ;

SELECT e.emp_id, e.emp_name, e.dept_id, d.dept_name
FROM y_emp e
LEFT OUTER JOIN y_dept d ON e.dept_id = d.dept_id;

select emp_name, position , salary 
from y_emp 
where salary > (select salary
                from y_emp
                where emp_name = '오상우');
                
select *
from y_emp
where mgr_id Not in (1001,1002);

select emp_name , position
from y_emp
where position = ( select position
                   from y_emp
                   where emp_id = 1049);
                   
select emp_name ,position, salary
from y_emp
where position = ( select position
                   from y_emp
                   where emp_id = 1044)
                                and salary > (select salary
                                              from y_emp
                                              where emp_id = 1050 );
                                              
 select emp_id , emp_name ,position , salary
 from y_emp
 where salary = ( select min(salary)
                  from y_emp);
                
select position , avg(salary)
from y_emp
group by position
having avg(salary) = (select min(avg(salary))
                      from y_emp
                      group by position);
                                             
SELECT emp_id, emp_name, position, salary
FROM y_emp
WHERE salary = (SELECT salary FROM y_emp
                WHERE position='차장'); -- 오류발생 서브쿼리가 
                --차장인 직급의 여러 사원을 불러오기때문에
               

SELECT emp_id, emp_name FROM y_emp
WHERE salary = (SELECT MIN(salary)
                FROM y_emp
                GROUP BY dept_id
                having dept_id = 100);
                
SELECT emp_id, emp_name, position
FROM y_emp
WHERE mgr_id = (SELECT mgr_id FROM y_emp
                WHERE emp_id = 1045);
                
select *
from y_emp
where mgr_id not in (1001,1002,null) ;


select emp_name , salary , dept_id
from y_emp
where salary IN (select  max(salary)
                           from y_emp
                           where dept_id <=200
                           group by dept_id);
                           
select emp_name , salary , dept_id
from y_emp
where (dept_id,salary) IN (select dept_id, max(salary)
                           from y_emp
                           where dept_id <=200
                           group by dept_id);
                           
select emp_id,emp_name , position ,salary
from y_emp
where  salary > all (select salary
                     from y_emp
                     where position = '대리')
                     and position <>' 대리 ' ;
             -- 대리가 출력되지 않는다 . -> all : 모든값과 비교하기때문        
select emp_id,emp_name , position ,salary
from y_emp
where  salary > any (select salary
                     from y_emp
                     where position = '대리')
                     and position <>' 대리 ' ;
                     
            -- 대리까지 출력됌 , any 는 각값들을 각각 비교함
            
-- 다중열 서브쿼리의 개념

select emp_id , emp_name , position , dept_id
from y_emp
where (dept_id,position) IN ( select dept_id,position
                              from y_emp
                              where emp_name Like '차%')
                              and emp_name NOT LIKE '차%';
                              
select emp_id , emp_name ,position , dept_id
from y_emp
where position IN (select position
                   from y_emp
                   where emp_name LIKE '차%')
        and dept_id IN (select dept_id
                        from y_emp
                        where  emp_name LIKE '차%')
        and emp_name NOT LIKE '차%';
        
select emp_name,salary,dept_id
from y_emp e
where salary > (select AVG(salary)
                from y_emp
                where dept_id = e.dept_id);
                -- 서브쿼리에서 외부 쿼리의 부서 ID와 동일한 부서의 행만 고려
select round(AVG(salary),1),position,dept_id
from y_emp
where position is not null and dept_id is not null
group by position, dept_id;       

select emp_id , emp_name , position , dept_id
from y_emp e
where exists ( select 'X'
               from y_emp
               where mgr_id = e.emp_id);
               
select emp_id , emp_name , position , dept_id
from y_emp e
where not exists ( select 'X'
               from y_emp
               where mgr_id = e.emp_id);
               
--인라인 뷰
-- 조인시 테이블 별칭 처럼 서브쿼리에 대하여 별칭을 사용
--하나의 SQL 문장 내부에서는 서브 쿼리의 결과 집합을 
--하나의 테이블처럼 접근하기 때문에 인라인 뷰 라고 함

-- 하나의 서브쿼리를 통째로 별칭을 주기에 서브쿼리안에서는 그룹화를 진행한다

select e.emp_name,e.salary,e.dept_id, b.salavg
from y_emp e join (select dept_id , avg(salary) salavg 
                   from y_emp
                   group by dept_id) b
on (e.dept_id = b.dept_id ) and e.dept_id <400 and e.salary > b.salavg ;

SELECT ROWNUM as RANK, emp_id, emp_name, salary
FROM (SELECT emp_id, emp_name,salary FROM y_emp
WHERE salary IS NOT NULL
ORDER BY salary DESC)
WHERE ROWNUM <= 6 ;

select rownum rank , e.emp_name,e.salary
from (select emp_name,salary
      from y_emp
      where salary is not null
      order by salary DESC)e
where rownum <=5;

select rownum rank , e.emp_name, e.hiredate
from (select emp_name, hiredate
      from y_emp
      order by hiredate ASC) e
where rownum<=3;

-- 서브쿼리  case 구문에서의 활용
select emp_id ,emp_name , ( case when dept_id = ( select dept_id 
                                                  from y_dept
                                                  where loc_id = 4)
                                then '대구'
                                else '기타' end ) as "지역"
from y_emp;

-- order by 절  서브쿼리

select emp_id , emp_name
from y_emp e 
order by (select dept_name 
          from y_dept d
          where e.dept_id = d.dept_id);

-- 복습해야해
-- with 은 select 문에 대해서만 사용 가능하다 
-- 쿼리 블록은 다르쿼리블록을 참조하여 작성가능
-- 내부적으로 인라인 뷰 또는 임시 테이블로 해석
-- 성능 향상
WITH
dept_total_sal AS ( SELECT d.dept_name, SUM(e.salary) AS dept_total
                    FROM y_emp e JOIN y_dept d
                    ON (e.dept_id = d.dept_id)
                    GROUP BY d.dept_name),
total_avg_sal AS (SELECT SUM(dept_total)/COUNT(*) AS dept_avg
                  FROM dept_total_sal )
SELECT * FROM dept_total_sal
WHERE dept_total > (SELECT dept_avg
                    FROM total_avg_sal);
