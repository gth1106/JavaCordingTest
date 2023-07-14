--1��
select emp_id,emp_name,substr(email,1,3) as email ,length(email)
from y_emp
where birthdate >= '89/01/01';

select birthdate,emp_name
from y_emp
where birthdate >= '89/01/01';

--2��
select emp_id,emp_name,RPAD(email,15,'*') as email , LPAD(salary,10,'*') as lpad
from y_emp;
--3��
--4��
select emp_name,gender,dept_id, concat(email,'@yj.com') as �̸���
from y_emp
where emp_name Like '%��%';
--5��
select emp_id,emp_name,salary,position, trunc(months_between(sysdate,hiredate)) as �ٹ��Ⱓ
from y_emp
where dept_id =300;
--6��
select emp_id,emp_name,position,salary
from y_emp
where dept_id IN (200,300) AND mgr_id =1044;
--7��
select emp_id,emp_name,phone,dept_id
from y_emp
where phone Like '053%';
--8��
select emp_id,emp_name,salary*12,hiredate
from y_emp;

SELECT emp_name, TO_CHAR(hiredate,'yyyy') �Ի�⵵ 
       ,TO_CHAR((salary+nvl(comm,0))*12, 'L99,999') as "�����հ�"
from y_emp;
--9��

select emp_id,emp_name,dept_id,NVL(comm,0) ������ ,NVL2(comm,'Yes','No') ���
from y_emp;
--10
select emp_id ,emp_name,position,dept_id
from y_emp
where  salary = (select min(salary)
                  from y_emp);
--11 �μ��� �ο��� ��� �޿� .�޿� ���հ�� �Ʒ� ��ü ����� , ��ü ����� ��ձ޿�,
--   �� �����ϴ� �μ��� ������ �����ü������ �Բ����.
select dept_id,count(dept_id) �����, trunc(avg(salary)) �μ���ձ޿� 
    , sum(salary) �μ��޿�����, COUNT(*) AS ��ü����� 
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



