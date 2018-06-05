show databases;
use hw4imcs;

create table patron 
(pat_id INT NOT NULL PRIMARY KEY, 
pat_name VARCHAR(50) NOT NULL, 
image BLOB);

create table bank(
bank_id INT NOT NULL primary key, 
bank_name varchar(100));

create table account(
account_id INT not null,
bank_id int not null, pat_id int not null, 
primary key (account_id), 
FOREIGN KEY(bank_id) references bank(bank_id) on delete cascade,
FOREIGN KEY(pat_id) references patron(pat_id) on delete cascade);

create table transaction (
tran_id INT not null, 
account_id int not null,
amount double not null, 
account_type varchar(10) not null,
primary key(tran_id), 
foreign key(account_id) references account(account_id) on delete cascade);

create table address (
add_id int not null,
street1 varchar(30) not null,
street2 varchar(30),
city varchar(20) not null,
state varchar(30) not null,
zip varchar(30) not null,
country varchar(30) not null,
primary key(add_id));

create table address_bank_relationship(
addbk_id int not null, 
bank_id int not null,
add_id int not null,
primary key(addbk_id),
foreign key(bank_id) references bank(bank_id) on delete cascade,
foreign key(add_id) references address(add_id) on delete cascade);

create table address_patron_relationship(
addpat_id int not null,
pat_id int not null,
add_id int not null,
primary key(addpat_id),
FOREIGN KEY(pat_id) references patron(pat_id) on delete cascade,
foreign key(add_id) references address(add_id) on delete cascade
); 

drop table transaction;