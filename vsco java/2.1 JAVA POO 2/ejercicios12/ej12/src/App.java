import entidades.Persona;
import servicio.Servicio;
public class App {
    public static void main(String[] args) throws Exception {
        
        Servicio s = new Servicio();

        //EN VEZ DE ESTO
        //Persona p = new Persona();

        Persona p = s.crearPersona();

        //en los siguiente metodos paso por parametro p

        s.calcularEdad(p);
        s.mostrarPersona(p);
        //s.menorQue(int p.getEdad());
    }
}
