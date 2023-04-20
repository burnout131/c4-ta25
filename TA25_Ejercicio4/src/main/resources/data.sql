DROP TABLE IF EXISTS salas;
DROP TABLE IF EXISTS peliculas;

CREATE TABLE peliculas(
	id INT NOT NULL AUTO_INCREMENT,
	nombre VARCHAR(100) DEFAULT NULL,
	calificacion_edad int DEFAULT NULL,
	PRIMARY KEY (id)
);

CREATE TABLE salas(
	id INT NOT NULL AUTO_INCREMENT,
	nombre VARCHAR(100) DEFAULT NULL,
	pelicula int DEFAULT NULL,
	PRIMARY KEY(id),
	CONSTRAINT FK_pelicula FOREIGN KEY (pelicula) REFERENCES peliculas(id)
	ON DELETE CASCADE ON UPDATE CASCADE
);

INSERT INTO peliculas(nombre, calificacion_edad) VALUES ('John Wick', 18);
INSERT INTO peliculas(nombre, calificacion_edad) VALUES ('Deadpool', 13);
INSERT INTO peliculas(nombre, calificacion_edad) VALUES ('Fast & Furious', 3);

INSERT INTO salas(nombre, pelicula) VALUES ('Sala 1', 1);
INSERT INTO salas(nombre, pelicula) VALUES ('Sala 2', 2);
INSERT INTO salas(nombre, pelicula) VALUES ('Sala 3', 3);