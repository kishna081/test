set names utf8;
set foreign_key_checks =0;

-- DBの作成
drop database if exists ecsite_kishi3;
create database if not exists ecsite_kishi3;
use ecsite_kishi3;

-- TABLE login_user_transaction の作成
drop table if exists login_user_transaction3;
create table login_user_transaction3(
id int not null primary key auto_increment,
login_id varchar(16) unique,
login_pass varchar(16),
user_name varchar(50),
insert_date datetime,
updated_date datetime
);

-- TABLE item_info_transaction の作成
drop table if exists item_info_transaction3;
create table item_info_transaction3(
id int not null primary key auto_increment,
item_name varchar(30),
item_price int,
item_stock int,
insert_date datetime,
update_date datetime
);

-- TABLE user_buy_item_transaction の作成
drop table if exists user_buy_item_transaction3;
create table if not exists user_buy_item_transaction3(
id int not null primary key auto_increment,
item_transaction_id int,
total_price int,
total_count int,
user_master_id varchar(16),
pay varchar(30),
insert_date datetime,
delete_date datetime
);

-- データの追加
INSERT INTO item_info_transaction3(item_name,item_price,item_stock)
VALUES("ノートBook",100,50);

INSERT INTO login_user_transaction3(login_id,login_pass,user_name)
VALUES("internous","internous01","test");