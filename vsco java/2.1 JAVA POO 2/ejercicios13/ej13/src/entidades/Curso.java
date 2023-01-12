package entidades;

public class Curso {
    private String nombreCurso;
    private double cantHorasDia;
    private double cantHorasSem;
    private String turno;
    private double precio;
    private String[] alumnos = new String[5];

    
    public Curso() {
    }

    public Curso(String nombreCurso, double cantHorasDia, double cantHorasSem, String turno, double precio,
            String[] alumnos) {
        this.nombreCurso = nombreCurso;
        this.cantHorasDia = cantHorasDia;
        this.cantHorasSem = cantHorasSem;
        this.turno = turno;
        this.precio = precio;
        this.alumnos = alumnos;
    }

    public String getNombreCurso() {
        return nombreCurso;
    }

    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    public double getCantHorasDia() {
        return cantHorasDia;
    }

    public void setCantHorasDia(double cantHorasDia) {
        this.cantHorasDia = cantHorasDia;
    }

    public double getCantHorasSem() {
        return cantHorasSem;
    }

    public void setCantHorasSem(double cantHorasSem) {
        this.cantHorasSem = cantHorasSem;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String[] getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(String[] alumnos) {
        this.alumnos = alumnos;
    }
}
