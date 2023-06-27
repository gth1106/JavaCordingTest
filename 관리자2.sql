--암호가
--yjc 인 새 사용자 SM 을 생성한다 . 사용자를 생성하는 작업은 DBA 의 권한이므로
--이 작업은 관리자가 실행해야 한다

CREATE USER sm IDENTIFIED BY yjc;

GRANT create session, create table, create sequence, create view TO SM;

--GRANT object_ 권한 ON schema.object_name [(columns)]
--TO {user | role | PUBLIC}
--[WITH GRANT OPTION ]];

CREATE USER ic IDENTIFIED BY ic;
CREATE ROLE ic_mgr;
GRANT create session, create table, create view TO ic_mgr;
GRANT ic_mgr TO ic;
SELECT * FROM session_privs;

SELECT username, granted_role FROM user_role_privs;
SELECT role, privilege FROM role_sys_privs ;