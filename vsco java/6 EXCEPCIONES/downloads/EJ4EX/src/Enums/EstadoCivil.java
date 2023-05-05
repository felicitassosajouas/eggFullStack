package Enums;

public enum EstadoCivil {
    SOLTERO("Soltero"), UNION_LIBRE("Union libre"), CASADO("Casado"), VIUDO("Viudo"), DIVORCIADO("Divorciado");
    public String estado;

    EstadoCivil(String estado) {
        this.estado = estado;
    }
}
