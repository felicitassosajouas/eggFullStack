import entidades.Persona;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Persona p1 = new Persona();

        p1.setNombre("feli");
        p1.getNombre();
    }
}
