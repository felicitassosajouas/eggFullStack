package entidades;

public abstract class Animal {
    protected String name;
    protected Integer edad;
    protected String raza;
    protected String alimento;

    protected Animal(String name, Integer edad, String raza, String alimento) {
        this.name = name;
        this.edad = edad;
        this.raza = raza;
        this.alimento = alimento;
    }

    public  void alimentarse(){
        System.out.println(name + " se alimenta con " + alimento);
    }
}
