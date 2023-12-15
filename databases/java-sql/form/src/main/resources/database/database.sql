create database forms;
use forms;

create table form(
id int auto_increment,
gender varchar(45) not null,
age int not null,
soccer boolean null,
basketball boolean null,
tennis boolean null,
swimming boolean null,
baseball boolean null,
PRIMARY KEY (id)
);

select * from form;