/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia7Ej7.coleccion;

import Guia7Ej7.Persona.Persona;
import Guia7Ej7.PersonaServicio.PersonaServicio;

/**
 *
 * @author Julian_Velasco
 */
public class coleccion {
    public static void main(String[] args) {
        int contadorPesoDebajo = 0;
        int contadorPesoIdeal = 0;
        int contadorPesoEncima = 0;
        double contadorMayorDeEdad = 0;
        double contadorMenorDeEdad = 0;
        int i;
        double promedioMayoresEdad = 0;
        double promedioMenoresEdad = 0;

        PersonaServicio ps = new PersonaServicio();
        Persona p1 = ps.crearPersona();
        System.out.println("Primer tamaño del arreglo: " + ps.arregloPersonas.size());
        Persona p2 = ps.crearPersona();
//        Persona p3 = ps.crearPersona();
//        Persona p4 = ps.crearPersona();
        System.out.println("Último tamaño del arreglo: " + ps.arregloPersonas.size());


        for (i = 0; i < ps.arregloPersonas.size(); i++) {
            if (ps.esMayorDeEdad(ps.arregloPersonas.get(i))) {
                contadorMayorDeEdad += 1;
            } else {
                contadorMenorDeEdad += 1;
            }
        }

        for (i = 0; i < ps.arregloPersonas.size(); i++) {
            if (ps.calcularIMC(ps.arregloPersonas.get(i)) == -1) {
                contadorPesoDebajo += 1;
            } else if (ps.calcularIMC(ps.arregloPersonas.get(i)) == 0) {
                contadorPesoIdeal += 1;
            } else if (ps.calcularIMC(ps.arregloPersonas.get(i)) == 1) {
                contadorPesoEncima += 1;
            }
        }

        promedioMayoresEdad = contadorMayorDeEdad / ps.arregloPersonas.size() * 100;
        promedioMenoresEdad = contadorMenorDeEdad / ps.arregloPersonas.size() * 100;

        System.out.println("El porcentaje de personas mayores de edad es " + promedioMayoresEdad + " %");
        System.out.println("El porcentaje de personas menores de edad es " + promedioMenoresEdad + " %");

        System.out.println("La cantidad de personas con peso debajo del ideal es " + contadorPesoDebajo);
        System.out.println("La cantidad de personas con peso  ideal es " + contadorPesoIdeal);
        System.out.println("La cantidad de personas con peso por encima del ideal es " + contadorPesoEncima);

    }
}