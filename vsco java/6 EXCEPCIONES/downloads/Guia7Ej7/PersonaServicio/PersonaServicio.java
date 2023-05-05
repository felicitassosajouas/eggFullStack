/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia7Ej7.PersonaServicio;

import Guia7Ej7.Persona.Persona;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Julian_Velasco
 */
public class PersonaServicio {

    Scanner sc = new Scanner(System.in).useDelimiter("\n");
    public ArrayList<Persona> arregloPersonas = new ArrayList();

    public Persona crearPersona() {

        Persona p1 = new Persona();
        Date fechaActual = new Date();
        int anhoActual = fechaActual.getYear() + 1900;
        String mesNacimientoNombre = "";
        String meses[] = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio",
                "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
        System.out.println("Ingresa el nombre de la persona");
        p1.setNombre(sc.next());
        System.out.println("Ingresa la fecha de nacimiento DD-MM-AAAA. Ej: 31-01-1994");
        String fechaNacimiento = sc.next();

        while (fechaNacimiento.length() != 10) {
            System.out.println("La fecha ingresada no tiene el formato esperado");
            System.out.println("Ingresa una fecha de nacimiento DD-MM-AAAA. Ej: 30-05-1990");
            fechaNacimiento = sc.next();
        }

        int diaNacimiento = Integer.parseInt((fechaNacimiento.substring(0, 2)));
        int mesNacimiento = Integer.parseInt((fechaNacimiento.substring(3, 5)));
        int anhoNacimiento = Integer.parseInt((fechaNacimiento.substring(6)));

        for (int i = 1; i <= meses.length; i++) {
            if (mesNacimiento == i) {
                mesNacimientoNombre = meses[i - 1];
            }
        }
        String fecha = diaNacimiento + " de " + mesNacimientoNombre + " de " + anhoNacimiento;
        p1.setFechaNacimiento(fecha);
        p1.setEdad(anhoActual - anhoNacimiento);
        System.out.println("Ingresa el sexo (M, F u O)");
        p1.setSexo(sc.next().toUpperCase());
        while (!p1.getSexo().equalsIgnoreCase("M") & !p1.getSexo().equalsIgnoreCase("F") && !p1.getSexo().equalsIgnoreCase("O")) {
            System.out.println("Ingresa un sexo válido (M, F u O)");
            p1.setSexo(sc.next().toUpperCase());
        }
        System.out.println("Ingresa tu peso en Kilogramos. Ej: 82,5 => 82,5 Kgs ");
        p1.setPeso(sc.nextDouble());

        while (p1.getPeso() <= 0) {
            System.out.println("Tu peso no puede ser menor o igual a cero. Ingresa tu peso nuevamente");
            p1.setPeso(sc.nextDouble());
        }

        System.out.println("Ingresa tu altura en Metros. Ej: 1,75 => 1,75Mts ");
        p1.setAltura(sc.nextDouble());

        while (p1.getAltura() <= 0) {
            System.out.println("Tu altura no puede ser menor o igual a cero. Ingresa tu altura nuevamente");
            p1.setAltura(sc.nextDouble());
        }
        arregloPersonas.add(p1);
        return p1;
    }

//    public void arregloPersonas(Persona p1){
//
//        arregloPersonas.add(p1);
//
//    }

    public int calcularIMC(Persona p1) {
        double imc = p1.getPeso() / Math.pow(p1.getAltura(), 2);
        int resul = 0;
        if (imc < 20) {
            resul = -1;
        } else if (imc >= 20 || imc <= 25) {
            resul = 0;
        } else if (imc > 25) {
            resul = 1;
        }
        return resul;
    }

    public boolean esMayorDeEdad(Persona p1) {
        boolean mayorDeEdad;

        if (p1.getEdad() >= 18) {
            mayorDeEdad = true;
        } else {
            mayorDeEdad = false;
        }
        return mayorDeEdad;
    }

}
