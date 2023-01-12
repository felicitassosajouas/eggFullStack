public class Rectangulo {
    private double base;
    private double altura;
    
    public void setBase(double base) {
        this.base = base;
    }
    public double getBase() {
        System.out.println("Base: "+base);
        return base;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getAltura() {
        System.out.println("Altura: "+altura);
        return altura;
    }


    public void crearRec(){
        System.out.println("Dimensiones del triángulo");
        getAltura();
        getBase();
    }

    public void superficie(double base, double altura){
        double superficie = base*altura;
        
        System.out.println("Superficie: " + superficie);
    }

    public void perimetro(){
        double perimetro = (base+altura)*2;
        System.out.println("Perimetro: " + perimetro);
    }

    public void constructorRectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

}
