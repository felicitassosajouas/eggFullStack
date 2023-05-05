/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia7Ej7;

import Guia7Ej7.Service.Service;
import Guia7Ej7.Atributos.Persona;
import java.util.Scanner;

/**
 *
 * @author Julian_Velasco
 */
public class Ej7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Service serv = new Service();
        System.out.println("SISTEMA DE CARGA\n==========");
        Persona[] pers = new Persona[4];
        for (int i = 0; i < 4; i++) {
            System.out.println("==========\nCARGA PERSONA " + (i + 1));
            pers[i] = serv.crearPersona();
        }

        int pesof = 0, peson = 0, pesoa = 0;
        int cant = pers.length;
        int opcion = 0;
        do {
            System.out.println("SELECCIONE UNA OPCION\n1-MOSTRAR DATOS\n2-EVALUACION DE PESO\n3-CONDICION DE EDAD\n4-SALIR");
            opcion = leer.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("DATOS");
                    for (int j = 0; j < 4; j++) {
                        System.out.println("==========\nDATOS PERSONA " + (j + 1));
                        serv.Mostrar(pers[j]);
                    }
                    break;
                case 2:
                    System.out.println("EVALUACION");
                    for (int i = 0; i < 4; i++) {
                        System.out.println();
                        if (serv.calcularIMC(pers[i]) == -1) {
                            pesof++;
                        } else if (serv.calcularIMC(pers[i]) == 0) {
                            peson++;
                        } else if (serv.calcularIMC(pers[i]) == 1) {
                            pesoa++;
                        }
                    }
                    System.out.println("El porcentaje de personas con bajo peso es de: " + (pesof * 100 / cant) + " %");
                    System.out.println("El porcentaje de personas con peso normal es de: " + (peson * 100 / cant) + " %");
                    System.out.println("El porcentaje de personas con sobrepeso es de: " + (pesoa * 100 / cant) + " %");
                    break;
                case 3:
                    int may = 0,
                     men = 0;
                    for (int i = 0; i < 4; i++) {
                        if (serv.esMayor(pers[i]) == true) {
                            System.out.println("La persona " + (i+1) + " es mayor de edad");
                            may++;
                        } else {
                            System.out.println("La persona " + (i+1) + " es menor de edad");
                            men++;
                        }
                    }
                    System.out.println("Porcetaje de personas mayores: " + may * 100 / cant + " %");
                    System.out.println("Porcentaje de personar menores: " + men * 100 / cant + " %");
                    break;
                case 4:
                    System.out.println("Hasta la proxima");

                    break;
            }
        } while (opcion != 4 && cant < 4);

    }
}
