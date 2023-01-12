package metodos;
import java.util.ArrayList;
import java.util.Scanner;

import entidades.Alumnos;
/*
el servicio de Alumno: Método notaFinal(): 
se ingresa nombre p/ calcular nota final 
se lo busca en la lista de Alumnos. Si está, se llama al método. 
Dentro del método se usará la lista notas para calcular el promedio final de alumno. Siendo este
promedio final, devuelto por el método y mostrado en el main.
 */
public class Metodos {
    Scanner leer = new Scanner(System.in);
    ArrayList <String> alumnosList = new ArrayList<>();
    Alumnos a = new Alumnos();

    public void crearAlumno(){    
        String opcion;
        do {
            System.out.println("Ingresar nombre del alumno");
            a.setNombre(leer.next());

            alumnosList.add(a.getNombre());

            System.out.println("Ingresar otro alumno? S/N");
            opcion = leer.next();
        } while (!opcion.equalsIgnoreCase("n"));
        
        System.out.println("Alumnos ingresados: " + alumnosList.toString());
    }


    public void notaFinal(){
        int nota = 0;
        ArrayList <Integer> lista = new ArrayList<>();
        
        for (String var : alumnosList) {
            System.out.println("Notas del alumno: " + var);
            
            for (int index = 0; index < 3; index++) {
                System.out.println("Nota " + (index+1) + "// SIN DECIMALES");
                nota = leer.nextInt();
                a.getNotas().add(nota);
                lista.add(nota);
            }

            //Forma de sumar los números
            int sum = lista.stream().mapToInt(i -> i).sum();
            
            int notaFinal = sum/3;
            System.out.println("Nota final de " +var + " :" +notaFinal);
        }
    }

    //SUMAR
    public void sumar(){
        ArrayList <Integer> num = new ArrayList<>();
        String opcion;
        do {
            System.out.println("Ingresar un nro");
            int n = leer.nextInt();

            num.add(n);

            System.out.println("Ingresar otro nro? S/N");
            opcion = leer.next();
        } while (!opcion.equalsIgnoreCase("n"));
        
        int suma =0;
        for (int var : num) {    
            suma = suma + var;
        }
        System.out.println(suma);
        
    }
}
