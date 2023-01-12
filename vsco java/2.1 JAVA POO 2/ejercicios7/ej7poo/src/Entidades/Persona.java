package Entidades;

public class Persona {
    private String nombre;
    private int edad;
    private String sexo;
    private int peso;
    private double altura;

    private boolean mayorDeEdad;

    private String IMC;

    public Persona() {
    }

    public Persona(String nombre, int edad, String sexo, int peso, double altura, boolean mayorDeEdad, String IMC) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
        this.mayorDeEdad = mayorDeEdad;
        this.IMC = IMC;
    }

    public boolean isMayorDeEdad() {
        return mayorDeEdad;
    }

    public void setMayorDeEdad(boolean mayorDeEdad) {
        this.mayorDeEdad = mayorDeEdad;
    }

    public String getIMC() {
        return IMC;
    }

    public void setIMC(String IMC) {
        this.IMC = IMC;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre: '" + nombre + '\'' +
                ", edad: " + edad +
                ", sexo: '" + sexo + '\'' +
                ", peso: " + peso +
                ", altura: " + altura +
                '}';
    }
}
