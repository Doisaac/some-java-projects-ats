CREATE DATABASE dates;
USE dates;

CREATE TABLE birthdates(
	idDate INT NOT NULL auto_increment,
    `date` DATE NOT NULL,
    PRIMARY KEY(idDate)
);

SELECT * FROM birthdates;
