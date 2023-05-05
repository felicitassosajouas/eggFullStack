package herencia4;

public class Circulo implements calculosFormas{
    protected double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }
    

@Override
public double calcularArea(){
    return PI*Math.pow(radio, 2);
}
    
@Override
public double calcularPerimetro(){
return radio*PI*2;
}
}