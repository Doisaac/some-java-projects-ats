create database imagenes;

use imagenes;

create table imagen(
idImagen int auto_increment,
img longblob not null,
primary key(idImagen)
);

select * from imagen;