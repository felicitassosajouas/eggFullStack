import Entidades.Empleados.Empleado;
import Entidades.Empleados.PersonalDeServicio;
import Entidades.Empleados.Profesores;
import Entidades.Estudiantes;
import Entidades.Facultad;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static ArrayList<Facultad> personas = new ArrayList<>();

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int op1, op2, op3;
        Facultad objeto = new Facultad();
        System.out.println("-----------INTERFAZ ADMINISTRADOR-----------");
        System.out.println("Ingrese la cantidad de estudiantes que desea registrar: ");
        op1 = leer.nextInt();
        System.out.println("Ingrese la cantidad de profesores que desea registrar: ");
        op2 = leer.nextInt();
        System.out.println("Ingrese la cantidad de empleados de servivio que desea registar");
        op3 = leer.nextInt();

        for (int i = 0; i < op1; i++) {
            System.out.println("-------Registrando estudiantes-------");
            personas.add(new Estudiantes());
        }
        for (int i = 0; i < op2; i++) {
            System.out.println("-------Registrando profesores-------");
            personas.add(new Profesores());
        }
        for (int i = 0; i < op3; i++) {
            System.out.println("-------Registrando empleados de servicios-------");
            personas.add(new PersonalDeServicio());
        }

        int opcion;
        int cont = 0;

        for (Facultad aux : personas) {

            System.out.println("-----------INTERFAZ USUARIO-----------");
            System.out.println("Hola " + aux.getNombre() + " !");
            System.out.println("Elija una opción");
            System.out.println("1. Cambiar estado cívil");
            System.out.println("2. Reasignacióm de despacho");
            System.out.println("3. Matriculación de un estudiante en un nuevo curso.");
            System.out.println("4. Cambio de departamento de un profesor.");
            System.out.println("5. Traslado de sección de un empleado del personal de servicio.");
            System.out.println("6. Salir");
            opcion = leer.nextInt();
            while (opcion < 0 || opcion > 6) {
                System.out.println("Ingrese una opción correcta");
                opcion = leer.nextInt();
            }
            switch (opcion) {
                case 1:
                    validarDocumento(cont);
                        aux.cambiarEstado();
                        System.out.println(aux.toString());

                    break;
                case 2:
                    if (aux instanceof Estudiantes) {
                        System.out.println("Usted no es un empleado");
                    } else if (validarDocumento(cont)) {
                        ((Empleado) aux).cambiarDespacho();
                        System.out.println(aux.toString());
                    }
                    break;
                case 3:
                    if (aux instanceof Estudiantes) {
                        if (validarDocumento(cont)) {
                            ((Estudiantes) aux).matricularCurso();
                            System.out.println(aux.toString());
                        }
                    } else {
                        System.out.println("Usted no es un estudiante");
                    }
                    break;
                case 4:
                    if (aux instanceof Profesores) {
                        if (validarDocumento(cont)) {
                            ((Profesores) aux).cambiarDepartamento();
                            System.out.println(aux.toString());
                        }
                    } else {
                        System.out.println("Usted no es un profesor");
                    }
                    break;
                case 5:
                    if (aux instanceof PersonalDeServicio) {
                        if (validarDocumento(cont)) {
                            ((PersonalDeServicio) aux).cambiarSeccion();
                            System.out.println(aux.toString());
                        }
                    } else {
                        System.out.println("Usted no hace parte del personal de servicio");
                    }
                    break;
                case 6:
                    System.out.println("Usted ha salido con éxito");
                    break;
            }
            if (opcion == 6) {
                break;
            }
            cont++;
        }
    }


    public static boolean validarDocumento(int i) {
        Scanner leer = new Scanner(System.in);
        String dni;
        System.out.println("Ingrese su DNI ");
        dni = leer.next();
        while (!personas.get(i).getDocumento().equalsIgnoreCase(dni)) {
            System.out.println("El DNI no corresponde a la persona: " + personas.get(i).getNombre());
            dni = leer.next();
        }
        return true;

    }
}




