USE store;
-- INSERTING DATA INTO CATEGORY TABLE
INSERT INTO category values (NULL, 'Beverages');
INSERT INTO category  (name) values ('Oils');
INSERT INTO  category (name) VALUES
('Detergents'), ('Cookies'), ('Chocolates'), ('Fried food');

select * from category;

-- INSERTING DATA INTO PRODUCT
INSERT INTO product (name,price,dateOfPurchase, idCategory)
VALUES
("Coca Cola", 0.75, '2023-05-26 11:50:00', 1),
("Pepsi lata", 0.75, '2023-05-25 11:50:00', 1),
("Pilsener beer", 1.75, current_timestamp(), 1),
("Olive oil", 3.25, current_timestamp(), 2),
("Vegatable oil", 2.25, current_timestamp(), 2),
("Cocunut oil", 2.00, current_timestamp(), 2),
("Liquid detergent", 3.50, current_timestamp(), 3),
("Powdered detergent", 1.25, current_timestamp(), 3),
("Multipurpose cleaner", 2.00, current_timestamp(), 3),
("Oreo cookies", 3.25, current_timestamp(), 4),
("Oatmeal cookies", 2.78, current_timestamp(), 4),
("Butter cookies", 1.25, current_timestamp(), 4),
("Milk chocolate", 1.00, current_timestamp(), 5),
("White Chocolate", 1.50, current_timestamp(), 5),
("Fried chicken", 5.80, current_timestamp(), 6);

SELECT * FROM product;

-- INSERTING DATA INTO QRCODE
INSERT INTO qrcode (serial, idProduct) VALUES
("Coca-Cola", 1),
("Pepsi-lata",2),
("Pilsener-beer", 3),
("Olive-oil", 4),
("Vegatable-oil",5),
("Cocunut-oil",6),
("Liquid-detergent",7),
("Powdered-detergent",8 ),
("Multipurpose-cleaner",9),
("Oreo-cookies", 10),
("Oatmeal-cookies",11),
("Butter-cookies", 12),
("Milk-chocolate",13),
("White-Chocolate",14),
("Fried-chicken", 15);

SELECT * FROM qrcode;

-- MODIFY COLUMN FROM CATEGORY
UPDATE category set name = 'Gas Beverages' WHERE idCategory = 1;

-- ADDIND AMOUNT OF PRODUCT 
ALTER TABLE product ADD COLUMN amount int;

-- UPDATING AMOUNT
UPDATE product set amount = 10 where idProduct = 1;

-- Deleting a product 
DELETE FROM product where idProduct =15;

INSERT INTO PRODUCT (name,price,dateOfPurchase, idCategory)
VALUES ('Fried chicken', 4.80, current_timestamp(), 6);

-- QUERIES -----------------------------------------

-- SELECT THE PRODUCT WITH THE MINIMUM AND MAX STOCK
SELECT min(stock) as 'Min', max(stock) as 'Max' FROM PRODUCT;

-- ORDER PRODUCTS BY PRICE
SELECT name, price FROM PRODUCT
ORDER BY PRICE ASC;

-- LIKE OPERATOR
SELECT * FROM PRODUCT WHERE NAME LIKE '%CO%';

-- QUERIES IN MORE THAN ONE TABLE

-- SELECTING THE NAME, PRICE AND THE CATYEGORY NAME OF THE PRODUCT
SELECT P.NAME AS 'NAME', P.PRICE AS 'PRICE' ,C.NAME AS 'CATEGORY'
FROM PRODUCT P INNER JOIN CATEGORY C
ON P.IDCATEGORY  = C.IDCATEGORY
WHERE P.STOCK < 20;

-- SELECTING THE PRODUCT NAME AND ITS QR-CODE
SELECT P.NAME, Q.SERIAL 
FROM PRODUCT P INNER JOIN QRCODE Q
ON P.IDPRODUCT = Q.IDPRODUCT;

-- SELECTING THE PRODUCT NAME, QRCODE, CATEGORY AND NAME OF PROVIDER
SELECT P.NAME, Q.SERIAL, C.NAME AS 'CATEGORY NAME', PR.NAME AS 'PROVIDER'
FROM PRODUCT P INNER JOIN QRCODE Q
ON P.IDPRODUCT = Q.IDPRODUCT
INNER JOIN CATEGORY C  
ON P.IDCATEGORY = C.IDCATEGORY
INNER JOIN PRODUCT_PROVIDER PP
ON P.IDPRODUCT = PP.IDPRODUCT
INNER JOIN PROVIDERS PR
ON PP.IDPROVIDER = PR.IDPROVIDER;

-- VIEWS : It is a easy way to save a BIG query, to use it later on another part

CREATE VIEW product_serial_category_provider as
SELECT P.NAME, Q.SERIAL, C.NAME AS 'CATEGORY NAME', PR.NAME AS 'PROVIDER'
FROM PRODUCT P INNER JOIN QRCODE Q
ON P.IDPRODUCT = Q.IDPRODUCT
INNER JOIN CATEGORY C  
ON P.IDCATEGORY = C.IDCATEGORY
INNER JOIN PRODUCT_PROVIDER PP
ON P.IDPRODUCT = PP.IDPRODUCT
INNER JOIN PROVIDERS PR
ON PP.IDPROVIDER = PR.IDPROVIDER;

-- Testing the view
SELECT * FROM product_serial_category_provider;

-- VIEW FOR SEE PRODUCT AND PROVIDER
CREATE VIEW product_provider_view AS
SELECT P.NAME AS "PRODUCT NAME", PRO.NAME AS "PROVIDER NAME"
FROM PRODUCT P INNER JOIN PRODUCT_PROVIDER PP
ON P.IDPRODUCT = PP.IDPRODUCT
INNER JOIN PROVIDERS PRO
ON PP.IDPROVIDER = PRO.IDPROVIDER;

-- Testing the view product_provider_view
SELECT * FROM product_provider_view;

-- Delete a view
drop view product_provider_view;

-- PROCEDURES : SOME STEPS SAVED AS A FUNCTION THAT CAN BE CALLED IN THE PROGRAM
DELIMITER //
create procedure productxCategoria
(in id int)
begin
	select * from Product
    where idCategory = id;
end //
DELIMITER ;

select version();

-- Testing the procedure
call productxCategoria(5);

-- Deleting
drop procedure productxCategoria;

# TRIGGERS : Events that are going to be called automatically after something we define

select * from category;
delimiter |
create trigger insertIntoTemporal before insert on category
for each row
begin 	
	insert into temporal (category) values (new.name);
end |

select * from temporal;
insert into category (name) values ('Chips');
