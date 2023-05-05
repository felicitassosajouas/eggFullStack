package Enums;

public enum Seccion {
    BIBLIOTECA("Biblioteca"), DECANATO("Decanato"), SECRETARIA("Secretaria"), CAFETERIA("Cafeteria"), SEGURIDAD("Seguridad");
    public String seccion;

    Seccion(String seccion) {
        this.seccion = seccion;
    }
}
