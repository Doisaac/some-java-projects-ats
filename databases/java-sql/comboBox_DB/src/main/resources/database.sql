# creates the database
create database countryDB;
use countryDB;

# creates the table
create table country(
idCountry int auto_increment,
name varchar(50) not null,
PRIMARY KEY (idCountry)
);

# inserts the countries
insert into country (name) values
('El Salvador'),
('Canada'),
('Australia'),
('Japan'),
('Brazil'),
('France'),
('Germany'),
('India'),
('United States'),
('Argentina');

# sees the data
select * from country;

# creates the states table
create table states (
idState int auto_increment,
name varchar(50) not null,
idCountry int not null,
PRIMARY KEY(idState),

CONSTRAINT fk_country FOREIGN KEY (idCountry) REFERENCES country(idCountry)
ON DELETE NO ACTION
ON UPDATE NO ACTION
);

# inserts data into states
-- El Salvador
INSERT INTO states (name, idCountry) VALUES
('San Salvador', 1),
('Santa Ana', 1),
('San Miguel', 1),
('La Libertad', 1),
('Usulután', 1);

-- Canada
INSERT INTO states (name, idCountry) VALUES
('Ontario', 2),
('Quebec', 2),
('British Columbia', 2),
('Alberta', 2),
('Manitoba', 2);

-- Australia
INSERT INTO states (name, idCountry) VALUES
('New South Wales', 3),
('Queensland', 3),
('Victoria', 3),
('Western Australia', 3),
('South Australia', 3);

-- Japan
INSERT INTO states (name, idCountry) VALUES
('Tokyo', 4),
('Osaka', 4),
('Hokkaido', 4),
('Kyoto', 4),
('Fukuoka', 4);

-- Brazil
INSERT INTO states (name, idCountry) VALUES
('Sao Paulo', 5),
('Rio de Janeiro', 5),
('Minas Gerais', 5),
('Bahia', 5),
('Ceara', 5);

-- France
INSERT INTO states (name, idCountry) VALUES
('Île-de-France', 6),
('Provence-Alpes-Côte d''Azur', 6),
('Auvergne-Rhône-Alpes', 6),
('Hauts-de-France', 6),
('Occitanie', 6);

-- Germany
INSERT INTO states (name, idCountry) VALUES
('Bavaria', 7),
('North Rhine-Westphalia', 7),
('Baden-Württemberg', 7),
('Lower Saxony', 7),
('Hesse', 7);

-- India
INSERT INTO states (name, idCountry) VALUES
('Maharashtra', 8),
('Uttar Pradesh', 8),
('Tamil Nadu', 8),
('Karnataka', 8),
('Gujarat', 8);

-- United States
INSERT INTO states (name, idCountry) VALUES
('California', 9),
('Texas', 9),
('New York', 9),
('Florida', 9),
('Illinois', 9);

-- Argentina
INSERT INTO states (name, idCountry) VALUES
('Buenos Aires', 10),
('Córdoba', 10),
('Santa Fe', 10),
('Mendoza', 10),
('Tucumán', 10);


# shows all the states
select * from states order by idState desc;

 