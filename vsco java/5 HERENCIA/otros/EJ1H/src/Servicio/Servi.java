package Servicio;


import Entidades.Caballo;
import Entidades.Gato;
import Entidades.Perro;

public class Servi {

    public void mostrarDatos() {
        Caballo caballo = new Caballo("Pepe", "Manzanas", 10, "fino");
        caballo.alimentarse();

        Perro perro = new Perro("Fernando Chiquito", "Croquetas", 5, "Beagle");
        perro.alimentarse();

        Gato gato = new Gato("Filomena", "Croquetas de Gato", 2, "maine coon");
        gato.alimentarse();

    }
}
