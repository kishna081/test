set names utf8;
set foreign_key_checks = 0;
drop database if exists logindb_kishi;
create database logindb_kishi;
use logindb_kishi;

create table user(
id int,
user_name varchar(255),
password varchar(255)
);

insert into user values
(1,"taro","123"),
(2,"jiro","456"),
(3,"hanako","135"),
(4,"sauburo","246");
