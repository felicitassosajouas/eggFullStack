package metodos;

import java.util.Arrays;    
import java.util.Scanner;
import entidades.Curso;

public class Metodos {
    Scanner leer = new Scanner(System.in);
    
    public void cargarAlumnos(){
        Curso c = new Curso();
        String[] vector = new String[5];
        
        for (int index = 0; index < c.getAlumnos().length; index++) {
            System.out.println("Ingrese nombre del alumno");
            vector[index]=leer.nextLine();
            if (vector[index].equals("")) {
                System.out.println("No ingresó ningún nombre, intente nuevamente");
                vector[index]=leer.nextLine();
            }
        }
        leer.nextLine();
        c.setAlumnos(vector);
        System.out.println("Alumnos: "+ Arrays.toString(c.getAlumnos()));            
    }


    public void crearCurso(Curso curso){
        System.out.println("INGRESE LA SIGUIENTE INFORMACIÓN SOBRE EL CURSO");


        System.out.println("Nombre del curso:");
        curso.setNombreCurso(leer.nextLine());

        System.out.println("Cantidad de horas que dura al día:");
        curso.setCantHorasDia(leer.nextDouble());

        System.out.println("Cantidad de horas que dura a la semana:");
        curso.setCantHorasSem(leer.nextDouble());

        System.out.println("Precio del curso:");
        curso.setPrecio(leer.nextDouble());
        
        System.out.println("Turno: mañana, tarde o noche");
        curso.setTurno(leer.nextLine());
        leer.nextLine();
        
        System.out.println("INGRESE LOS ALUMNOS QUE ASISTEN AL CURSO: " + curso.getNombreCurso());
        cargarAlumnos();
    }

/*
 Método calcularGananciaSemanal(): este método se encarga de calcular la ganancia
en una semana por curso. Para ello, se deben multiplicar la cantidad de horas por
día, el precio por hora, la cantidad de alumnos y la cantidad de días a la semana que
se repite el encuentro.
 */

    public void calcularGananciaSemanal(Curso curso){
        double ganancia = (curso.getCantHorasDia() * curso.getAlumnos().length * curso.getPrecio() * curso.getCantHorasSem());
        System.out.println("Ganancia semanal: " + ganancia);
    }
}
