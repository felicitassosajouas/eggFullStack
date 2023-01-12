import metodos.Metodos;
import entidades.Movil;
public class App {
    public static void main(String[] args) throws Exception {
        Metodos m = new Metodos();

        Movil movil = new Movil();

        m.cargarCelular(movil);
    }
}
