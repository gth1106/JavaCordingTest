--��ȣ��
--yjc �� �� ����� SM �� �����Ѵ� . ����ڸ� �����ϴ� �۾��� DBA �� �����̹Ƿ�
--�� �۾��� �����ڰ� �����ؾ� �Ѵ�

CREATE USER sm IDENTIFIED BY yjc;

GRANT create session, create table, create sequence, create view TO SM;

--GRANT object_ ���� ON schema.object_name [(columns)]
--TO {user | role | PUBLIC}
--[WITH GRANT OPTION ]];

CREATE USER ic IDENTIFIED BY ic;
CREATE ROLE ic_mgr;
GRANT create session, create table, create view TO ic_mgr;
GRANT ic_mgr TO ic;
SELECT * FROM session_privs;

SELECT username, granted_role FROM user_role_privs;
SELECT role, privilege FROM role_sys_privs ;