import servicios.Servicios;
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Servicios s = new Servicios();
        s.crearElectrodomesticos();
        s.verPrecios();
    }
}
