package entidades;

public class Cadena {
    private int n;
    private String[] arrayFrase = new String[n];
    private String caracteres;
    
    public Cadena(){
    } 

    public Cadena(int n, String[] arrayFrase) {
        this.n = n;
        this.arrayFrase = arrayFrase;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }
    
    public String getCaracteres() {
        return caracteres;
    }

    public void setCaracteres(String caracteres) {
        this.caracteres = caracteres;
    }

    public String[] getArrayFrase() {
            return arrayFrase;
        }

    public void setArrayFrase(String[] arrayFrase) {
        this.arrayFrase = arrayFrase;
    }
}
