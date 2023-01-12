/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej8poo;

import Entidad.Cadena;
import Servicio.CadenaServicio;

/**
 *
 * @author usuario
 */
public class Ej8Poo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        CadenaServicio cadS = new CadenaServicio();
        Cadena cad1 = cadS.crearCadena();
        
        cadS.mostrarVocales();
        cadS.invertirFrase();
        cadS.vecesRepetido();
        cadS.compararLongitud();
        cadS.unirFrases();
        
    }
    
}
