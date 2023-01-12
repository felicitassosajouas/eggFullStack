package entidades;

public class Arreglo {
    private double[] arregloA = new double [50] ;
    private double[] arregloB = new double [20];
    
    public Arreglo() {
    }

    public Arreglo(double[] arregloA, double[] arregloB) {
        this.arregloA = arregloA;
        this.arregloB = arregloB;
    }

    public double[] getArregloA() {
        return arregloA;
    }

    public void setArregloA(double[] arregloA) {
        this.arregloA = arregloA;
    }

    public double[] getArregloB() {
        return arregloB;
    }

    public void setArregloB(double[] arregloB) {
        this.arregloB = arregloB;
    }

    
}
