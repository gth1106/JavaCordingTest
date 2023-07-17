select e.emp_id,e.emp_name,e.dept_id,d.loc_id
from y_emp e , y_dept d
where e.dept_id = d.dept_id
and d.dept_id between 100 and 300;

select e.emp_id,e.emp_name,e.salary , p.pay_level
from y_emp e, pay_grade p
where e.salary between p.low_pay and p.high_pay;

select e.emp_name , d.dept_name ,l.city
from y_emp e,y_dept d,y_loc l
where e.dept_id = d.dept_id and d.loc_id = l.loc_id;