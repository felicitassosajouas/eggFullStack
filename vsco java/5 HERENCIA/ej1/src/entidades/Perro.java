package entidades;

public class Perro extends Animal{

    public Perro(String name, Integer edad, String raza, String alimento) {
        super(name, edad, raza, alimento);
    }
    
    public void alimentarse(){
        System.out.println(name + " se alimenta con " + alimento);
    }
}
