package Enums;

public enum Departamento {
    MATEMATICAS("Matematicas"), LENGUAJES("Lenguajes"), ARQUITECTURA("Arquitectura"), CIENCIAS("Ciencias"), DERECHO("Derecho"), PROGRAMACION("Programacion");

    public String departamento;

    Departamento(String departamento) {
        this.departamento = departamento;
    }
}
