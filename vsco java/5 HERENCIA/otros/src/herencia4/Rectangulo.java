package herencia4;

public class Rectangulo implements calculosFormas {

    protected double base, altura;

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

@Override
public double calcularArea(){
    return base*altura;
}
    
@Override
public double calcularPerimetro(){
    return (base+altura)*2;
}
}