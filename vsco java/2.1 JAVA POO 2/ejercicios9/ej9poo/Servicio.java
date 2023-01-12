/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia7Ej9.Servicio;

import Guia7Ej9.Atributos.Matematica;
import java.util.Scanner;

/**
 *
 * @author Julian_Velasco
 */
public class Servicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Matematica crear() {
        Matematica one = new Matematica();
        System.out.println("Vamos a generar dos numero aleatorios para realizar los calculos");
        one.setNumero(Math.random() * 10);
        one.setNumero1(Math.random() * 10);
        System.out.println("El primer valor es "+one.getNumero());
        System.out.println("El segundo valor es "+one.getNumero1());
        return one;
    }

    public double devolverMayor(Matematica one) {
        double mayor;
        mayor = Math.max(one.getNumero(), one.getNumero1());
        System.out.println("El mayor es: "+mayor);
        return mayor;
    }
    public double calcularPotencia(Matematica one){
        double aux,poten,redon,redon1;
        redon=Math.round(one.getNumero());
        redon1=Math.round(one.getNumero1());
        System.out.println("Se redondeo el primer numero a "+redon);
        System.out.println("Se redondeo el segundo numero a "+redon1);
        aux=Math.max(redon, redon1);
        if (aux==redon){
            poten=Math.pow(redon, redon1);
        }else 
            poten=Math.pow(redon1, redon);
        System.out.println("El resultado de la potencia es es "+poten);
        return poten;
    }
    public double calcularRaiz(Matematica one){
        double aux, raiz, abso, abso1;
        abso=Math.abs(one.getNumero());
        abso1=Math.abs(one.getNumero1());
        System.out.println("El absoluto del primer numero es "+abso);
        System.out.println("El absolutop del segundo numero es "+abso1);
        aux=Math.min(abso, abso1);
        if (aux==abso){
            raiz=Math.sqrt(aux);
        }else
            raiz=Math.sqrt(aux);
        System.out.println("El resultado de la raiz es "+raiz);
        return raiz;
    }
    public void menu(Matematica one) {

        boolean salir = false;
        int opcion;
        do{
            System.out.println("===MENU===");
            System.out.println("1-CREAR DOS VALORES ALEATORIOS\n2-COMPROBAR MAYOR\n3-CALCULAR POTENCIA DEL MAYOR ELEVADO AL MENOR\n4-CALCULAR RAIZ\n5-SALIR\n==========");
            opcion=leer.nextInt();
            switch (opcion){
                case 1:
                    one = crear();
                    break;
                case 2:
                    devolverMayor(one);
                    break;
                case 3:
                    calcularPotencia(one);
                    break;
                case 4:
                    calcularRaiz(one);
                    break;
                case 5:
                    salir = true;
                    break;
            }
            System.out.println("==========");
        }while (!salir);
}
}