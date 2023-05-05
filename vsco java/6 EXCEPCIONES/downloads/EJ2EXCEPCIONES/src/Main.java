public class Main {
    public static void main(String[] args) {
        Integer[] array = {1,2,3,4,5};
        System.out.println(array[2]);
        try{
            System.out.println(array[8]);
        }catch(ArrayIndexOutOfBoundsException A){
            System.out.println("Indice fuera de rango");
        }
        System.out.println("Ha terminado el ejercicio");
    }
}