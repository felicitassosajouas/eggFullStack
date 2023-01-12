// 
// Decompiled by Procyon v0.5.36
// 

package ejercicio10.guia7;

import Entidades.ClassEntidades;
import Servicio.claseServicio;

public class Ejercicio10Guia7
{
    public static void main(final String[] args) {
        final claseServicio CS = new claseServicio();
        final ClassEntidades AR = CS.crearArreglo();
        CS.ordenarArreglo(AR);
        CS.crearArrglo2(AR);
    }
}
