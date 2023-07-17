select emp_name,dept_name
from y_emp cross join y_dept;

SELECT dept_id, dept_name, city
FROM y_dept NATURAL JOIN y_loc
WHERE dept_id IN (100,200);

SELECT dept_id, dept_name, city
FROM y_dept NATURAL JOIN y_loc;

select emp_id ,emp_name,dept_id,dept_name -- ������ ���̺� �� ���� �˼����� ����������
from y_emp join y_dept
using (dept_id); -- ���̺� ���ʿ��� ��������� �ߺ����� ǥ�õ����ʰ� using �� ���

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
                where emp_name = '�����');
                
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
                WHERE position='����'); -- �����߻� ���������� 
                --������ ������ ���� ����� �ҷ����⶧����
               

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
                     where position = '�븮')
                     and position <>' �븮 ' ;
             -- �븮�� ��µ��� �ʴ´� . -> all : ��簪�� ���ϱ⶧��        
select emp_id,emp_name , position ,salary
from y_emp
where  salary > any (select salary
                     from y_emp
                     where position = '�븮')
                     and position <>' �븮 ' ;
                     
            -- �븮���� ��� , any �� �������� ���� ����
            
-- ���߿� ���������� ����

select emp_id , emp_name , position , dept_id
from y_emp
where (dept_id,position) IN ( select dept_id,position
                              from y_emp
                              where emp_name Like '��%')
                              and emp_name NOT LIKE '��%';
                              
select emp_id , emp_name ,position , dept_id
from y_emp
where position IN (select position
                   from y_emp
                   where emp_name LIKE '��%')
        and dept_id IN (select dept_id
                        from y_emp
                        where  emp_name LIKE '��%')
        and emp_name NOT LIKE '��%';
        
select emp_name,salary,dept_id
from y_emp e
where salary > (select AVG(salary)
                from y_emp
                where dept_id = e.dept_id);
                -- ������������ �ܺ� ������ �μ� ID�� ������ �μ��� �ุ ���
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
               
--�ζ��� ��
-- ���ν� ���̺� ��Ī ó�� ���������� ���Ͽ� ��Ī�� ���
--�ϳ��� SQL ���� ���ο����� ���� ������ ��� ������ 
--�ϳ��� ���̺�ó�� �����ϱ� ������ �ζ��� �� ��� ��

-- �ϳ��� ���������� ��°�� ��Ī�� �ֱ⿡ ���������ȿ����� �׷�ȭ�� �����Ѵ�

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

-- ��������  case ���������� Ȱ��
select emp_id ,emp_name , ( case when dept_id = ( select dept_id 
                                                  from y_dept
                                                  where loc_id = 4)
                                then '�뱸'
                                else '��Ÿ' end ) as "����"
from y_emp;

-- order by ��  ��������

select emp_id , emp_name
from y_emp e 
order by (select dept_name 
          from y_dept d
          where e.dept_id = d.dept_id);

-- �����ؾ���
-- with �� select ���� ���ؼ��� ��� �����ϴ� 
-- ���� ����� �ٸ���������� �����Ͽ� �ۼ�����
-- ���������� �ζ��� �� �Ǵ� �ӽ� ���̺�� �ؼ�
-- ���� ���
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
