# create the database
create database school;

## specify we're going to use the school database
use school;

## create a table person
create table people(
idPerson int not null auto_increment,
personCode varchar(5) unique not null,
firstName varchar(50) not null,
country varchar(60) not null,
phoneNumber varchar(8) null,
email varchar(50) null,
birthdate date null,
gender varchar(10) not null,
PRIMARY KEY (idPerson)
);

## inserting a person just for testing
insert into people (personCode, firstName, country, phoneNumber, email, birthDate, gender) 
values ("001","Douglas", "El Salvador", "72785974", "douglasbarrera@gmail.com", CURDATE(), "Male");

# get all the people
select * from people;
