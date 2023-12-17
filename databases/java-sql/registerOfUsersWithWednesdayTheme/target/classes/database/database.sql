create database users;
use users;

# Creates the user type table
create table user_type(
id int not null auto_increment,
name varchar(50) not null,
primary key(id)
);

insert into user_type(name) values ("Admin"),("User");

# Creates the user table
create table user (
id int not null auto_increment,
username varchar(50) not null,
password varchar(100) not null,
name varchar(50) not null,
email varchar(50) not null,
last_session datetime null default null,
idUser_Type int not null,

primary key (id),
constraint fk_user_type foreign key (idUser_Type) references user_type(id)
on delete cascade
on update cascade
);

select * from user_type;
select * from user;

drop table user;