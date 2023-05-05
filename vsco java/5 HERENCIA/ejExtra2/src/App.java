import entidades.Oficina;
import entidades.Poli;
import entidades.Edificio;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
Por último, en el main vamos a crear un ArrayList de tipo Edificio, debe contener
dos polideportivos y dos edificios de oficinas. Luego, recorrer este array y ejecutar los
métodos calcularSuperficie y calcularVolumen en cada Edificio. Se deberá mostrar la
superficie y el volumen de cada edificio.
 */

public class App {
    public static void main(String[] args) throws Exception {
        try (Scanner leer = new Scanner(System.in)) {
            Integer opcion;

            List <Edificio> edificios = new ArrayList<>();

            Poli poli1 = new Poli(5,80,60,"Poli1","t");
            Poli poli2 =  new Poli(2,100,200,"Poli2","d");
            Oficina ofi1 = new Oficina(20,70,50,10,100,10);
            Oficina ofi2 =  new Oficina(12,50,40,6,60,6);
            edificios.add(poli1);
            edificios.add(poli2);
            edificios.add(ofi1);
            edificios.add(ofi2);
    
            do{
                System.out.println("____________ MENÚ ____________");
                System.out.println("Ingrese opcion deseada");
                System.out.println("");

                System.out.println("1) Crear Edificio de Oficionas");
                System.out.println("2) Crear Terreno de Polideportivo");
                System.out.println("3) Ver edificios creados");
                System.out.println("4) Ver medidas de todos los edificios creados");
                System.out.println("5) Salir");
                opcion = leer.nextInt();
                
                switch (opcion) {
                    case 1:
                        Oficina e = new Oficina();
                        e.personas();
                        e.medidas();
                        e.mostrar();

                        edificios.add(e);
                        break;
                
                    case 2: 
                        Poli p = new Poli();

                        p.crearPoli();
                        p.medidas();
                        p.poli();

                        edificios.add(p);
                        break;

                    case 3:
                        System.out.println(edificios);
                        //terminar
                        break;

                    case 4:
                        System.out.println("Medidas de los terrenos");
                        for (Edificio aux : edificios) {
                            System.out.println("aux");
                            aux.calcularSuperficie();
                            aux.calcularVolumen();
                        }
                        break;
                    default:
                        System.out.println("Caracter ingresado inválido");
                        System.out.println("1)Crear Oficina // 2) Crear Polideportivo");
                        break;
                }
            }while(opcion != 5);
        }

    }
}
