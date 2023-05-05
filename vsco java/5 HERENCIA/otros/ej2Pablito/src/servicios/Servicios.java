package servicios;

//import entidades.Electrodomestico;
import entidades.Lavadora;
import entidades.Televisor;

public class Servicios {
    Lavadora lavadora = new Lavadora();
    Televisor televisor = new Televisor();

    public void crearElectrodomesticos() {
        lavadora.crearLavadora();
        televisor.crearTelevisor();
    }

    public void verPrecios() {
        System.out.println(lavadora.precioFinal());
        System.out.println(televisor.precioFinal());
    }
}
