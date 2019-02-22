set names utf8;
set foreign_key_checks =0;
drop database if exists ecsite_kishi2;

--DBの作成
create database if not exists ecsite_kishi2;
user ecsite_kishi2;

--TABLE login_user_transaction2 の作成
drop table if exists login_user_transaction_2;
create table login_user_transaction2(
id int not null primary key auto_increment,
login_id varchar(16) unique,
login_pass varchar(16),
user_name varchar(50),
insert_date datetime,
updated_date datetime
);

--TABLE item_info_transaction2 の作成
drop table if exists item_info_transaction2;
create table item_info_transaction2(
id int not null primary key auto_increment,
item_name varchar(30),
item_price int,
item_stock int,
insert_date datetime,
update_date datetime
);

--TABLE user_buy_item_transaction2 の作成
drop table if exists user_buy_item_transaction2;
create table if exists user_buy_item_transaction2(
id int not null primary key auto_increment,
item_transaction_id int,
total_price int,
total_count int,
user_master_id varchar(16),
pay varchar(30),
insert_date datetime,
delete_date datetime
);

--データの追加
INSERT INTO item_info_transaction2(item_name,item_price,item_stock)
VALUES("ノートBook",100,50);

INSERT INTO login_user_transaction2(login_id,login_pass,user_name)
VALUES("internous","internous01","test");