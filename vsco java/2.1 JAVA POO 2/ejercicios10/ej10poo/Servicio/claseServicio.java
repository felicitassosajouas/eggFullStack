// 
// Decompiled by Procyon v0.5.36
// 

package Servicio;

import java.util.Arrays;
import java.math.RoundingMode;
import java.math.BigDecimal;
import Entidades.ClassEntidades;

public class claseServicio
{
    public ClassEntidades crearArreglo() {
        final ClassEntidades arreglo = new ClassEntidades();
        final double[] arregloAuxiliar = new double[50];
        double numero = 0.0;
        for (int i = 0; i < 50; ++i) {
            final BigDecimal big1 = new BigDecimal(Math.random() * 100.0);
            numero = big1.setScale(2, RoundingMode.DOWN).doubleValue();
            arregloAuxiliar[i] = numero;
        }
        arreglo.setArreglo1(arregloAuxiliar);
        System.out.println("el arreglo original es: " + Arrays.toString(arregloAuxiliar));
        return arreglo;
    }
    
    public void ordenarArreglo(final ClassEntidades arreglo) {
        Arrays.sort(arreglo.getArreglo1());
        System.out.println("\n el arreglo original es: " + Arrays.toString(arreglo.getArreglo1()));
    }
    
    public void crearArrglo2(final ClassEntidades arreglo) {
        final double[] arregloAuxiliar2 = new double[20];
        Arrays.fill(arregloAuxiliar2, 10, arregloAuxiliar2.length, 0.5);
        for (int i = 0; i < 10; ++i) {
            arregloAuxiliar2[i] = arreglo.getArreglo1()[i];
        }
        arreglo.setArreglo2(arregloAuxiliar2);
        System.out.println("\n el arreglo dos: " + Arrays.toString(arreglo.getArreglo2()));
    }
}
