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
select * from states;


# creates the tourist places table
create table touristPlaces (
idPlace int not null auto_increment,
name varchar(100) not null,
idState int,

PRIMARY KEY(idPlace),
CONSTRAINT fk_place FOREIGN KEY (idState) REFERENCES states(idState)
on delete no action
on update no action
);

 
# inserts data into tourist places table
-- Para San Salvador (idState = 51)
INSERT INTO touristPlaces (name, idState) VALUES
('Monumento al Divino Salvador del Mundo', 51),
('Museo Nacional de Antropología Dr. David J. Guzmán', 51),
('Parque Nacional El Boquerón', 51);

-- Para Santa Ana (idState = 52)
INSERT INTO touristPlaces (name, idState) VALUES
('Teatro de Santa Ana', 52),
('Parque Nacional Cerro Verde', 52),
('Catedral de Santa Ana', 52);

-- Para San Miguel (idState = 53)
INSERT INTO touristPlaces (name, idState) VALUES
('Catedral Basílica de la Reina del Santísimo Rosario', 53),
('Parque Nacional Bahía de Jiquilisco', 53),
('Iglesia El Calvario', 53);

-- Para La Libertad (idState = 54)
INSERT INTO touristPlaces (name, idState) VALUES
('Playa El Tunco', 54),
('Puerto de La Libertad', 54),
('Parque Nacional San Diego', 54);

-- Para Usulután (idState = 55)
INSERT INTO touristPlaces (name, idState) VALUES
('Isla San Juan del Gozo', 55),
('Laguna de Alegría', 55),
('Monumento al Divino Salvador del Mundo', 55);

-- Para Ontario (idState = 56)
INSERT INTO touristPlaces (name, idState) VALUES
('CN Tower', 56),
('Royal Ontario Museum', 56),
('Niagara Falls', 56);

-- Para Quebec (idState = 57)
INSERT INTO touristPlaces (name, idState) VALUES
('Old Quebec (Vieux-Québec)', 57),
('Montreal Museum of Fine Arts', 57),
('Montmorency Falls Park', 57);

-- Para British Columbia (idState = 58)
INSERT INTO touristPlaces (name, idState) VALUES
('Capilano Suspension Bridge Park', 58),
('Stanley Park', 58),
('Whistler Blackcomb', 58);

-- Para Alberta (idState = 59)
INSERT INTO touristPlaces (name, idState) VALUES
('Banff National Park', 59),
('Jasper National Park', 59),
('Calgary Stampede', 59);

-- Para Manitoba (idState = 60)
INSERT INTO touristPlaces (name, idState) VALUES
('The Forks, Winnipeg', 60),
('Assiniboine Park', 60),
('Canadian Museum for Human Rights', 60);

# shows all data from touristPlaces
select * from touristPlaces;

