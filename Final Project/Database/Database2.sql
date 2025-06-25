create database login;
show databases;
use login;
create table login(username varchar(25), password varchar(25));
insert into login values('IBA', '12345');
select * from login;