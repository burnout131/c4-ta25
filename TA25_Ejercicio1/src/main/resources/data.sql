DROP TABLE IF EXISTS articulos;
DROP TABLE IF EXISTS fabricantes;

CREATE TABLE fabricantes (
	id INT NOT NULL AUTO_INCREMENT,
    nombre VARCHAR(100),
    PRIMARY KEY (id)
);

CREATE TABLE articulos (
	id INT NOT NULL AUTO_INCREMENT,
    nombre VARCHAR(100),
    precio INT,
    codigo_fabricantes INT NOT NULL,
    PRIMARY KEY (id),
    FOREIGN KEY (codigo_fabricantes) REFERENCES fabricantes (id) ON DELETE CASCADE ON UPDATE CASCADE
);

INSERT INTO fabricantes(nombre) VALUES ('Asus');
INSERT INTO fabricantes(nombre) VALUES ('LG');

INSERT INTO articulos(nombre, precio, codigo_fabricantes) VALUES ('Placa base', 130, 1);
INSERT INTO articulos(nombre, precio, codigo_fabricantes) VALUES ('TV OLed', 450, 2);