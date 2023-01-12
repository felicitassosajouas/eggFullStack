package servicios;

import java.util.Scanner;
import entidades.Cadena;

public class Servicios{
    
    Scanner leer = new Scanner(System.in);
    Cadena c = new Cadena();


    public void longitudCadena(){
        System.out.println("Ingrese el contenido de la cadena");
        c.setCaracteres(leer.nextLine());
        System.out.println("Cadena: "+ c.getCaracteres());


        //convierto a int para que de la longitud del array
        c.setN(c.getCaracteres().length());
        System.out.println("Longitud de la cadena: "+ c.getN());
        
    }


    public void mostrarVocales(){
        System.out.println("");
        int cantVocales = 0; 
        for (int i = 0; i < c.getN(); i++) { 
                if (c.getCaracteres().substring(i, i + 1).equalsIgnoreCase("a")) {
                    cantVocales = cantVocales +1;
                } else if (c.getCaracteres().substring(i, i + 1).equalsIgnoreCase("e")) {
                    cantVocales = cantVocales +1;
                } else if (c.getCaracteres().substring(i, i + 1).equalsIgnoreCase("i")) {
                    cantVocales = cantVocales +1;
                } else if (c.getCaracteres().substring(i, i + 1).equalsIgnoreCase("o")) {
                    cantVocales = cantVocales +1;
                } else if (c.getCaracteres().substring(i, i + 1).equalsIgnoreCase("u")) {
                    cantVocales = cantVocales +1;
                }    
            }
            System.out.println("Cant vocales: "+cantVocales);
    }


    public void invertirFrase(){
        System.out.println("");
        System.out.print("Frase invertida: ");
        for ( int i = c.getN() -1;  i >= 0; i--) {
            System.out.print( c.getCaracteres().substring(i,i+1));
        }
    }

    public void repeticiones(){
        System.out.println("");
        System.out.println("Consulta de repeticiones de un caracter: ");
        String repeticion = leer.next();
        int cantRepeticiones = 0;

        for (int i = 0; i < c.getCaracteres().length(); i++) {
            if (repeticion.equals(c.getCaracteres().substring(i,i+1))) {
                cantRepeticiones = cantRepeticiones +1;
            }
        }
        System.out.println(repeticion + " se repite " + cantRepeticiones + " veces");
        
    }


    public void compararLong(){
        System.out.println("");
        System.out.println("Ingrese nueva frase para comparar longitudes de cadenas con la frase anterior");
        String nuevaFrase = leer.nextLine();
        System.out.println("Longitud de segunda frase: "+ nuevaFrase.length());
        System.out.println("Longitud de primer frase: "+ c.getCaracteres().length());
    }


    public void concatenar(){
        System.out.println("Ingrese frase para concatenar con la primera ingresada");
        String concatenar = leer.nextLine();
        System.out.println(c.getCaracteres()+concatenar);
    }


    /*public void reemplazar(){
        System.out.println("Letra que quiere poner en reemplazo de las 'A'");
        String remplazo = leer.nextLine();
        String frase = c.getCaracteres();
        for (int i = 0; i < c.getN(); i++) {
            if ((c.getCaracteres().substring(i,i+1)).equalsIgnoreCase("a")) {
                
                frase = frase.substring(0,i).concat(frase);
                frase = frase+c.getCaracteres().substring(i+1, c.getN());
            }
        }
    }*/


    public void contiene(){
        
        System.out.println("Consultar si contiene algún caracter");
        String letra = leer.next();
        
        for(int i = 0; i < c.getCaracteres().length(); i++){
            System.out.println(c.getCaracteres().charAt(i));

            if(c.getCaracteres().substring(i,i+1).equals(letra)){
                System.out.println("La letra "+ letra +" si está");
            }
        }
        
    }
}