package Entidades;

public class Perro extends Animal{
    public Perro(String nombre, String alimento, int edad, String raza) {
        super(nombre, alimento, edad, raza);
    }

    public void alimentarse() {
        System.out.println("El perro " +nombre +" se alimenta de "+ alimento + ", tiene una edad de " + edad+ " y su raza es: " +raza );
    }
}
