package entidades;

public abstract class Edificio{
    protected Double alto, ancho, largo;
    
    protected Edificio(Double alto, Double ancho, Double largo) {
        this.alto = alto;
        this.ancho = ancho;
        this.largo = largo;
    }


    protected Edificio() {
    }


    public abstract void calcularSuperficie();
    public abstract void calcularVolumen();

}