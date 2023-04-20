DROP TABLE IF EXISTS cajas;
DROP TABLE IF EXISTS almacenes;

CREATE TABLE almacenes(
	id INT NOT NULL AUTO_INCREMENT,
	lugar VARCHAR(100) DEFAULT NULL,
	capacidad int DEFAULT NULL,
	PRIMARY KEY (id)
);

CREATE TABLE cajas(
	id INT NOT NULL AUTO_INCREMENT,
	contenido VARCHAR(100) DEFAULT NULL,
	valor int DEFAULT NULL,
	almacen int,
	PRIMARY KEY(id),
	CONSTRAINT FK_almacen FOREIGN KEY (almacen) REFERENCES almacenes(id)
	ON DELETE CASCADE ON UPDATE CASCADE
);

INSERT INTO almacenes(lugar, capacidad) VALUES ('Córdoba', 873);
INSERT INTO almacenes(lugar, capacidad) VALUES ('Barcelona', 150);
INSERT INTO almacenes(lugar, capacidad) VALUES ('Madrid', 500);

INSERT INTO cajas(contenido, valor, almacen) VALUES ('Llaveros', 50, 1);
INSERT INTO cajas(contenido, valor, almacen) VALUES ('Huevos de corral XL', 200, 3);
INSERT INTO cajas(contenido, valor, almacen) VALUES ('Auriculares', 125, 2);