package metodos;
import java.util.Arrays;
import java.util.Scanner;

import entidades.Movil;

public class Metodos {
    Scanner leer = new Scanner(System.in);
    Movil m = new Movil();

    public void ingCodigo(){
        int[] codigo = new int[7];
        for (int i = 0; i < codigo.length; i++) {
            System.out.println("Ingrese dígito por dígito");
            codigo[i] = leer.nextInt();
        }
        m.setCodigo(codigo);
        System.out.println("Código: " + Arrays.toString(m.getCodigo()));
    }

    public void cargarCelular(Movil m){
        System.out.println("Marca");
        m.setMarca(leer.nextLine());

        System.out.println("Precio");
        m.setPrecio(leer.nextDouble());

        System.out.println("Modelo");
        m.setModelo(leer.nextLine());
        leer.nextLine();
        
        System.out.println("Memoria RAM");
        m.setMemoriaRam(leer.nextLine());

        System.out.println("Almacenamiento");
        m.setAlmacenamiento(leer.nextDouble());
    
        ingCodigo();

        System.out.println("Ingresar Cantidad de unidades de " + m.getMarca() + "" + m.getModelo());
        m.setCantUnidades(leer.nextInt());

        
    }
}
