package entidades.Hoteles;
/*El precio de una habitación debe calcularse de acuerdo con la siguiente fórmula:
PrecioHabitación = $50 + ($1 x capacidad del hotel) + (valor agregado por restaurante) + (valor
agregado por gimnasio) + (valor agregado por limosinas).
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
public class Hotel3 extends Hotel2{
    private Integer salonesConferencia, suites, limosinas;

    public Hotel3(Double cantHabitaciones, Double cantCamas, Double cantPisos, Double precioHabitaciones,
            Double capacidadPersonas, Integer estrellas, Boolean gimnasio, String restaurant,
            Integer capacidadRestaurant, Integer salonesConferencia, Integer suites, Integer limosinas) {
        super(cantHabitaciones, cantCamas, cantPisos, precioHabitaciones, capacidadPersonas, estrellas, gimnasio,
                restaurant, capacidadRestaurant);
        this.salonesConferencia = salonesConferencia;
        this.suites = suites;
        this.limosinas = limosinas;
    }

    public Hotel3(String nombre, String direccion, String localidad, String gerente, Double cantHabitaciones,
            Double cantCamas, Double cantPisos, Double precioHabitaciones, Double capacidadPersonas, Integer estrellas,
            Boolean gimnasio, String restaurant, Integer capacidadRestaurant, Integer salonesConferencia,
            Integer suites, Integer limosinas) {
        super(nombre, direccion, localidad, gerente, cantHabitaciones, cantCamas, cantPisos, precioHabitaciones,
                capacidadPersonas, estrellas, gimnasio, restaurant, capacidadRestaurant);
        this.salonesConferencia = salonesConferencia;
        this.suites = suites;
        this.limosinas = limosinas;
    }

    
} 