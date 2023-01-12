// 
// Decompiled by Procyon v0.5.36
// 

package Entidades;

public class ClassEntidades
{
    private double[] arreglo1;
    private double[] arreglo2;
    
    public ClassEntidades() {
        this.arreglo1 = new double[50];
        this.arreglo2 = new double[20];
    }
    
    public ClassEntidades(final double[] arreglo1, final double[] arreglo2) {
        this.arreglo1 = new double[50];
        this.arreglo2 = new double[20];
        this.arreglo1 = arreglo1;
        this.arreglo2 = arreglo2;
    }
    
    public double[] getArreglo1() {
        return this.arreglo1;
    }
    
    public void setArreglo1(final double[] arreglo1) {
        this.arreglo1 = arreglo1;
    }
    
    public double[] getArreglo2() {
        return this.arreglo2;
    }
    
    public void setArreglo2(final double[] arreglo2) {
        this.arreglo2 = arreglo2;
    }
}
