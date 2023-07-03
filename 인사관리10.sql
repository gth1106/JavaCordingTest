create table dept200
as select emp_id,emp_name,salary*12 annsal , hiredate
from y_emp
where dept_id=200;

desc dept200

select * from dept200;

desc y_emp

SELECT systimestamp, current_timestamp FROM dual;
select sysdate
from dual;


ALTER SESSION SET time_zone = '-10:10';
SELECT systimestamp, current_timestamp FROM dual;
ALTER SESSION SET time_zone = '+9:00';
SELECT systimestamp, current_timestamp FROM dual;

desc time_test1
INSERT INTO time_test1
VALUES(11,SYSDATE,SYSDATE,SYSDATE,SYSDATE);
commit;
select* from time_test1;

ALTER SESSION SET TIME_ZONE = '-10:00';
SELECT * FROM time_test1;

desc time_test2
INSERT INTO time_test2
VALUES(1, INTERVAL '10-6' YEAR TO MONTH, INTERVAL '7 12:00:00' DAY TO SECOND);
COMMIT;
SELECT * FROM time_test2;

SELECT emp_id, hiredate, hiredate+dur1 review_day
FROM y_emp, time_test2;

select * from time_test2;

SELECT SYSTIMESTAMP, SYSTIMESTAMP+dur2 FROM dual, time_test2
WHERE no = 1;

alter table dept200
add(position varchar2(10));
desc dept200

alter table dept200 drop column hiredate;
describe dept200

alter table dept200
set unused (annsal , position);

describe dept200
select * from dept200;

alter table dept200 drop unused columns;

drop table customers;
desc customers
select * from tab;

flashback table customers to before drop;
select * from tab;

drop table customers purge;
select * from tab;


select constraint_name , constraint_type
from user_constraints
where table_name = 'customers';

select*from user_constraints;

ALTER TABLE Y_EMP
ADD CONSTRAINT EMP_EMPID_PK PRIMARY KEY(EMP_ID);

ALTER TABLE y_dept
ADD CONSTRAINT dept_deptid_pk PRIMARY KEY(dept_id);

ALTER TABLE y_emp
ADD CONSTRAINT emp_deptid_fk FOREIGN KEY(dept_id)
REFERENCES y_dept(dept_id)
ON DELETE SET NULL;

alter table y_emp
add constraint emp_mgrid_fk foreign key(mgr_id)
references y_emp(emp_id);

ALTER TABLE y_emp DROP PRIMARY KEY CASCADE;

ALTER TABLE y_emp
ADD CONSTRAINT emp_empid_pk PRIMARY KEY(emp_id);

CREATE INDEX emp_deptid_idx ON y_emp(dept_id);

CREATE INDEX emp_empid_lname_idx ON y_emp(emp_id, emp_name);

CREATE INDEX emp_lname_idx ON y_emp(emp_name);

SELECT emp_id, emp_name, salary, position FROM y_emp
WHERE LOWER(emp_name) = 'mark kim';

SELECT emp_id, emp_name, salary, position FROM y_emp
WHERE emp_name = INITCAP('mark kim');

CREATE INDEX emp_sal_fidx ON y_emp(salary*12*0.9);

SELECT emp_id, emp_name, position FROM y_emp
WHERE salary*12*0.9 > 10000;

DROP INDEX emp_sal_fidx;

select index_name
from user_indexes;

SELECT ic.index_name, ic.column_name, uniqueness
FROM user_indexes ix, user_ind_columns ic
WHERE ic.index_name = ix.index_name
AND ic.table_name = 'Y_EMP';

CREATE OR REPLACE VIEW dept300_vu
AS
SELECT emp_id, emp_name, position, mgr_id, dept_id
FROM y_emp
WHERE dept_id = 300;

DESC dept300_vu

CREATE OR REPLACE VIEW sal_vu200
AS
SELECT emp_id id, emp_name name, salary*12 ann_sal
FROM y_emp
WHERE dept_id = 200;

CREATE OR REPLACE VIEW sal_vu200 (id, name, ann_sal)
AS
SELECT emp_id , emp_name, salary*12
FROM y_emp
WHERE dept_id = 200;

SELECT * FROM dept300_vu;
SELECT * FROM sal_vu200;

CREATE TABLE sal200
AS
SELECT emp_id id, emp_name, salary*12 ann_sal
FROM y_emp
WHERE dept_id = 200;

DESC sal200;
SELECT * FROM sal200;

UPDATE y_emp
SET salary = salary+200
WHERE dept_id = 200;

COMMIT;

SELECT * FROM sal200;
SELECT * FROM sal_vu200;

INSERT INTO dept300_vu
VALUES(2020,'이병헌', '과장', 1001,500);
commit;

SELECT emp_id, emp_name, position, salary, mgr_id, dept_id
FROM y_emp
WHERE emp_id = 2020; 
--
--뷰를
--통해 입력했기 때문에
--뷰에 포함되지 않은
--SALARY 열은 NULL 값이다

CREATE OR REPLACE VIEW sal_vu200
AS
SELECT emp_id id, emp_name, salary*12 ann_sal, dept_id deptid
FROM y_emp
WHERE dept_id = 200;
DESC sal_vu200
SELECT * FROM sal_vu200;

CREATE SEQUENCE dept_deptid_seq
INCREMENT BY 100
START WITH 1000
MAXVALUE 9900
NOCACHE
NOCYCLE ;

SELECT sequence_name,increment_by, last_number
FROM user_sequences
WHERE sequence_name = 'DEPT_DEPTID_SEQ';

INSERT INTO y_dept(dept_id, dept_name)
VALUES(dept_deptid_seq.NEXTVAL, 'AS');
COMMIT;
SELECT * FROM y_dept;

INSERT INTO y_emp (emp_id, emp_name)
VALUES(dept_deptid_seq.NEXTVAL, '노영준');
commit;

SELECT emp_id, emp_name FROM y_emp
WHERE emp_name='노영준';


ALTER SEQUENCE dept_deptid_seq
INCREMENT BY 10
MAXVALUE 20000;

DROP SEQUENCE dept_deptid_seq;

select * from user_sequences;
