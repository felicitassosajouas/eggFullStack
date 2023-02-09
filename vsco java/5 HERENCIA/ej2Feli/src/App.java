//import entidades.Electrodomesticos;
import entidades.Lavadora;
import entidades.Televisor;

public class App {
    public static void main(String[] args) throws Exception {
        Lavadora l = new Lavadora();
        l.crearLavadora();
        l.precio();

        Televisor t = new Televisor();
        t.crearTelevisor();
        t.precio();
    }
}