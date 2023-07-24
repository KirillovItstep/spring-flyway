alter table users add column nick_name varchar(255);
update users set nick_name=name;
commit;