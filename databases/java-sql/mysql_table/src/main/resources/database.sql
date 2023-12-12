# Creates the database
create database store;

# Use the db
use store;

# Creates the table product
create table product(
productId int auto_increment,
productCode varchar(45) not null unique,
productName varchar(45) not null,
price decimal(10,2) not null,
amount int not null,
PRIMARY KEY(productId)
);

# Insert an example
insert into product (productCode, productName, price, amount)
values
("001", "Chips", 1.5, 100),
("002", "Coockies", 2.5, 200),
("003", "Chocolates", 3.5, 300),
("004", "Candies", 0.25, 100),
("005", "Macs", 800, 200),
("006", "Iphones", 745.00, 60);

# Shows all the products
select * from product;


