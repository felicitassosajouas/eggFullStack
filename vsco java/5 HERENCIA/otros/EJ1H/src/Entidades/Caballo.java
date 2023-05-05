package Entidades;

public class Caballo extends Animal {
    public Caballo(String nombre, String alimento, int edad, String raza) {
        super(nombre, alimento, edad, raza);
    }

    @Override
    public void alimentarse() {
        System.out.println("El caballo " +nombre +" se alimenta de "+ alimento + ", tiene una edad de " + edad+ " y su raza es: " +raza );
    }
}
