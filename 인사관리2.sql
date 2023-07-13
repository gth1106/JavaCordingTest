

select emp_id, emp_name, salary
from y_emp
where salary<(select salary 
                from y_emp
                where emp_name = '정해인');

select salary,emp_name
from y_emp
where salary = (select min(salary)
                from y_emp );
    
select *
from y_emp
where salary <> all (select min(salary)
                from y_emp
                group by dept_id);
                
select *
from y_emp
where mgr_id Not in (1001,1002,null);

select *
from y_emp
where emp_id in (select mgr_id 
                 from y_emp);

select *
from y_emp
where emp_id not in (select mgr_id from y_emp
                     where mgr_id is not null);
                     
--참고
select *
from y_emp
where emp_id = 3077;


                    