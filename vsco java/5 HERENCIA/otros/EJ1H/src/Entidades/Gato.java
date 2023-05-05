package Entidades;

public class Gato extends Animal {

    public Gato(String nombre, String alimento, int edad, String raza) {
        super(nombre, alimento, edad, raza);
    }

    public void alimentarse() {
        System.out.println("El gato " +nombre +" se alimenta de "+ alimento + ", tiene una edad de " + edad+ " y su raza es: " +raza );
    }
}
