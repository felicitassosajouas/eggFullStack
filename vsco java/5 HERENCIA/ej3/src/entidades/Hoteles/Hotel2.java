package entidades.Hoteles;

public class Hotel2 extends Hotel1{
    private Boolean gimnasio; //a = true, b = false
    private String restaurant;
    private Integer capacidadRestaurant;

    public Hotel2(Double cantHabitaciones, Double cantCamas, Double cantPisos, Double precioHabitaciones,
            Double capacidadPersonas, Integer estrellas, Boolean gimnasio, String restaurant,
            Integer capacidadRestaurant) {
        super(cantHabitaciones, cantCamas, cantPisos, precioHabitaciones, capacidadPersonas, estrellas);
        this.gimnasio = gimnasio;
        this.restaurant = restaurant;
        this.capacidadRestaurant = capacidadRestaurant;
    }
    public Hotel2(String nombre, String direccion, String localidad, String gerente, Double cantHabitaciones,
            Double cantCamas, Double cantPisos, Double precioHabitaciones, Double capacidadPersonas, Integer estrellas,
            Boolean gimnasio, String restaurant, Integer capacidadRestaurant) {
        super(nombre, direccion, localidad, gerente, cantHabitaciones, cantCamas, cantPisos, precioHabitaciones,
                capacidadPersonas, estrellas);
        this.gimnasio = gimnasio;
        this.restaurant = restaurant;
        this.capacidadRestaurant = capacidadRestaurant;
    }
    
    public void crearHotel2(){
        gimnasio = true;
        restaurant = "Restaurant 1";
        capacidadRestaurant = 60;
    }
/*El precio de una habitación debe calcularse de acuerdo con la siguiente fórmula:
PrecioHabitación = $50 + ($1 x capacidad del hotel) + 
(valor agregado por restaurante) + (
valor agregado por gimnasio) + 
(valor agregado por limosinas).
Donde:
Valor agregado por el restaurante:
• $10 si la capacidad del restaurante es de menos de 30 personas.
• $30 si está entre 30 y 50 personas.
• $50 si es mayor de 50.
Valor agregado por el gimnasio:
• $50 si el tipo del gimnasio es A.
• $30 si el tipo del gimnasio es B.
Valor agregado por las limosinas:
• $15 por la cantidad de limosinas del hotel.*/
    
    public Double precioHabitacionHotel2(){
        double r = 0 ;
        if (capacidadRestaurant<30) {
            r = 10;
        } else if (capacidadRestaurant>=30 && capacidadRestaurant<=50){
            r = 30;
        } else if(capacidadRestaurant>50){
            r = 50;
        }

        double g = 0;
        if (gimnasio == true) {
            g = 50;
        } else {
            g = 30;
        }
    }
} 