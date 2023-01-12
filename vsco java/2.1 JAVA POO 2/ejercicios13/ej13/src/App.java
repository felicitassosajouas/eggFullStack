import metodos.Metodos;
import entidades.Curso;
public class App {
    public static void main(String[] args) throws Exception {
        Metodos m = new Metodos();
        Curso c = new Curso();

        m.crearCurso(c);
        m.calcularGananciaSemanal(c);
    }
}
