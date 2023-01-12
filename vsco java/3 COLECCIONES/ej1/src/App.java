import metodos.Metodos;
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("RAZAS DE PERROS");

        Metodos m = new Metodos();
        m.pedirRaza();

        m.mostrarRazas();

        m.consultarPerro();
    }
}
