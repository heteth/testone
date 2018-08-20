create table "transaction"(id int primary key, account_id int, amount decimal(10), ts timestamp, status varchar(100));

create table account(id int primary key, account_no varchar(30));