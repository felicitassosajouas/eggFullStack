package servicios;
//import entidades.Carta;
public class Servicios {
    //private Carta c = new Carta();
    public void crearBaraja(){
        Integer numeros = 1;    
        String carta;
        for (int i = 1; i <= 40; i++) {
            if (i < 11) {
                carta = (numeros++) + " de oro";
                System.out.println(carta); 
            }else if (i<21){
                carta = (numeros++) + " de espada";
                System.out.println(carta);
            }else if (i<31){
                carta = (numeros++) + " de basto";
                System.out.println(carta);
            }else if (i<41){
                carta = (numeros++) + " de copa";
                System.out.println(carta);
            }
        }
    }
}