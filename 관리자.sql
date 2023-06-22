create user demo identified by demo
default tablespace users
temporary tablespace temp
/
grant connect, resource to demo
/
grant create view, create synonym to demo
/