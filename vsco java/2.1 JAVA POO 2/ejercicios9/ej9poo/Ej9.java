/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia7Ej9;

import Guia7Ej9.Servicio.Servicio;
import Guia7Ej9.Atributos.Matematica;
import java.util.Scanner;

/**
 *
 * @author Julian_Velasco
 */
public class Ej9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in).useDelimiter("\n");
        Servicio serv=new Servicio();
        Matematica one = null;
        serv.menu(one);
    }
}
