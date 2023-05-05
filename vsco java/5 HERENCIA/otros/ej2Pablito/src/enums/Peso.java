package enums;

public enum Peso {
    P1(19d, 100d), P2(49d, 500d), P3(79d, 800d), P4(3000d, 1000d);

    public Double peso, precio;

    Peso(Double peso, Double precio) {
        this.peso = peso;
        this.precio = precio;
    }
}
