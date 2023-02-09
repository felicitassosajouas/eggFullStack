package entidades;

public class Gatoo extends Animal{
    
    public Gatoo(String name, Integer edad, String raza, String alimento) {
        super(name, edad, raza, alimento);
    }
    //protected String alimento;
    public void alimentarse(){
        System.out.println(name + " se alimenta con " + alimento);
    }
}
