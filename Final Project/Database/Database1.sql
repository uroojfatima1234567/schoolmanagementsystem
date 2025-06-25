create database schoolmanagementsystem;

show databases;
use schoolmanagementsystem;

create table login(username varchar(25), password varchar(25));

insert into login values('admin', '123');

select * from login;