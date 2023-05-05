-- Active: 1679611087066@@localhost@3306
-- si ya existe dicha tabla, q se borre 
DROP DATABASE IF EXISTS superheroes;
-- creo el esquema superhéroes
CREATE DATABASE superheroes CHARACTER SET utf8mb4;
-- me ubico en esa tabla
USE superheroes;

CREATE TABLE creador (
id_creador INT UNSIGNED AUTO_INCREMENT PRIMARY KEY, 
nombre VARCHAR(20) NOT NULL
);


CREATE TABLE personajes (
  id_personaje INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
  nombre_real VARCHAR(20) NOT NULL,
  personaje VARCHAR(20) NOT NULL,
  inteligencia INT(10) NOT NULL,
  fuerza VARCHAR(10) NOT NULL,
  velocidad INT(11) NOT NULL,
  poder INT(11) NOT NULL,
  aparicion INT(11) NOT NULL,
  ocupacion VARCHAR(30) NULL,
  id_creador INT UNSIGNED NOT NULL,
  FOREIGN KEY (id_creador) REFERENCES creador(id_creador)
  );
  
  insert into creador 
	values (1, 'felicitas'),
		   (2, 'leonel'),
           (3, 'ciro'),
           (4, 'pepita');
   
   insert into personajes 
   values (10, 'felicitas','feli',10,7,8,9,6,'programadora',1),
		  (20, 'leonel','leo',9,10,9,9,7,'profe',2),
          (30, 'ciro','cirito',6,7,9,10,10,'se la rasca',3),
          (40, 'pepita','pp',4,5,9,8,5,'estudia',4);
          
	select * from creador;
    select * from personajes;
    select nombre_real, personaje from personajes order by personaje asc;
    select personaje, poder from personajes where poder>7 order by poder asc;
	select id_creador as 'id del creador',nombre_real from personajes order by id_creador desc;

-- BORRO FILA DE UNA TABLA
	-- DELETE FROM nombre_tabla [WHERE condicion] [ORDER BY ...] [LIMIT cantidad_filas]
	delete from personajes where id_creador = 4;
    select * from personajes;
-- AGREGO NUEVOS VALORES EN LAS DOS TABLAS Y DESPUÉS LAS MUESTRO
	-- INSERT INTO nombre_tabla (columna1, columna2, columna3,...) VALUES(valor, valor2, valor3,...);
	insert into creador values (5,'veronica');
    insert into personajes values (50, 'veronica', 'vero', 5, 6, 3, 4, 2, 'pintora', 5);
    select * from personajes;
-- ACTUALIZO EL NOMBRE/PERSONAJE Y NOMBRE REAL DEL ID=5
	-- UPDATE nombre_tabla 
	-- SET nombre_columna1 = valor1, 
	-- nombre_columna2 = valor2,
	-- [ORDER BY ...] [WHERE condicion]
	update creador set  nombre = 'Diego' where id_creador = 5;
    update personajes set nombre_real = 'Diego', personaje = 'Diegote' where id_creador = 5;
    select * from creador;
    
    -- inserto personajes nuevos a los creadores 
    insert into personajes values(60, 'florencia', 'flor', 8,3,9,9,10, 'astronauta', 1);
    insert into personajes values(70, 'luciano', 'lu', 8,3,7,5,8, 'profe', 2);
    insert into personajes values(80, 'claudia', 'clau', 6,7,7,5,8, 'astronauta', 3);
    insert into personajes values(90, 'pablo', 'pablito', 6,9,8,10,10, 'programador', 4);
    insert into personajes values(100, 'julio', 'ju', 6,4,7,9,6, 'astronauta', 5);
	select * from personajes;

	-- select fuerza, inteligencia, velocidad from personajes group by id_creador;



