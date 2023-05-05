package com.prueba.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity

public class Libro {
    //arriba de los atributos le tengo que dar las propiedades
    @Id //propiedad ID
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id; //atributo LLAVE PRIMARIA

    @Column(nullable = false)
    private String titulo;

    //AUTOR ES LLAVE FORÁNEA DE LIBRO CON AUTOR
    @ManyToOne
    //@JoinColumn(nullable = false) //para hacer relaciones NO NULAS
                                    //para relacionar la entidad libro con la entidades autor
    //private Autor autor; --> un autor tiene muchos libros escritos
    private String autor;
}
