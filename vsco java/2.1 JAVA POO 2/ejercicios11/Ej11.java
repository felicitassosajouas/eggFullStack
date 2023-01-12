/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej11;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ej11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
       int dia, mes, anio;
        System.out.println("Por favor, ingrese su fecha de nacimiento (dia, mes y año)" );
        dia = leer.nextInt();
        mes = leer.nextInt();
        anio= leer.nextInt();  
       Date fecha = new Date(anio - 1900 ,mes-1,dia); //el año 0 con el Date es 1900. Al año se le resta 1900 para ingrese la fecha correcta. Al mes se le resta 1 por que va hasta el mes 11
       
       
       Date fechaActual = new Date(); //dejandolo vacio trae la fecha de hoy
       
       int resta = fechaActual.getYear() - fecha.getYear();
        System.out.println("La diferencia de años es de: " + resta);
    
       
       
       
    }
    
}
