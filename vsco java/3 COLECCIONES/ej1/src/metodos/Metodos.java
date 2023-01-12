package metodos;
import java.util.ArrayList;
import java.util.Scanner;
import entidades.Perros;
/*
Lea y guarde razas de perros en un ArrayList de tipo String. El
programa pedirá una raza de perro en un bucle, el mismo se guardará en la lista y
después se le preguntará al usuario si quiere guardar otro perro o si quiere salir. Si decide
salir, se mostrará todos los perros guardados en el ArrayList
*/
public class Metodos {
    ArrayList <String> razas = new ArrayList<>();
    Scanner leer = new Scanner(System.in);


    public void pedirRaza(){
        boolean salir = true;
        Perros p = new Perros();
        do {
            System.out.println("Ingrese nombre del perro");
            p.setNombre(leer.next());
            System.out.println("Ingrese raza del perro");
            p.setRaza(leer.next());

            razas.add(p.getRaza());

            System.out.println("Desea agregar otra raza? s/n");
            String rta = leer.next();

                if (rta.equals("s")) {
                    salir = true;
                }else{
                    salir = false;
                }
    }while (salir);
}

    public void mostrarRazas(){

        System.out.println("Razas ingresadas: "+ razas.toString());
    }

    /* FORMA SIMPLE
    public void consultarPerro(){
        System.out.println("Ingrese perro que desee eliminar");
        String consulta = leer.next();
        for (int i = 0; i < razas.size(); i++) {
            if (consulta.equals(razas.get(i))) {
            razas.remove(i);
        }
        }
        System.out.println(razas);
    }
    */

    //MEJOR FORMA 
    public void consultarPerro(){
        System.out.println("Ingrese perro que desee eliminar");
        String eliminar = leer.next();
        eliminar = eliminar.substring(0, 1).toUpperCase() + eliminar.substring(1).toLowerCase();

        if (razas.contains(eliminar)) {
            razas.remove(eliminar);
            System.out.println("Razas luego de remover "+eliminar+ ": " +razas.toString());
        } else {
            System.out.println("No se encontró la raza que ingresaste");
            System.out.println("Razas: " +razas.toString());
        }

    }
}
