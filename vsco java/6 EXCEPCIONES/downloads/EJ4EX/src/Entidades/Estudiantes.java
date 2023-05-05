package Entidades;

import Enums.Cursos;
import Enums.EstadoCivil;

import java.util.ArrayList;

public final class Estudiantes extends Facultad {
    protected ArrayList<String> cursos = new ArrayList<>();

    public Estudiantes(String nombre, String documento, String apellido, String estadoCivil, ArrayList<String> cursos) {
        super(nombre, documento, apellido, estadoCivil);
        this.cursos = cursos;
    }

    public Estudiantes() {
        rellenarDatos();
    }

    public ArrayList<String> getCursos() {
        return cursos;
    }

    public void setCursos(ArrayList<String> cursos) {
        this.cursos = cursos;
    }

    String curso;

    @Override
    public void rellenarDatos() {

        super.rellenarDatos();
        mostrarCursos();
        curso = leer.next();
        validarCurso();
        cursos.add(curso);
        personas.add(this);
    }

    public void matricularCurso() {

        System.out.println("Usted desea matricularse en un nuevo curso? S/N");
        if (super.validarS()) {
            System.out.println("Ingrese el curso al que desea matricularse: ");
            mostrarCursos();
            curso = leer.next();
            validarCurso();
            if (cursos.contains(curso)) {
                System.out.println("Ingrese un curso diferente en el que ya está");
                curso = leer.next();
            }
            cursos.add(curso);
        }
    }


    public void documentoEstudiante() {
        System.out.println("Ingrese su DNI");
        documento = leer.next();
        if (super.documento.equalsIgnoreCase(documento)) {

        }
    }


    public void mostrarCursos() {
        System.out.println("Elija una materia");
        for (Cursos aux : Cursos.values()) {
            System.out.println("-" + aux.materia);
        }
    }

    public void validarCurso() {
        boolean encontrado = false;
        ;
        do {
            for (Cursos aux : Cursos.values()) {
                if (curso.equalsIgnoreCase(aux.materia)) {
                    encontrado = true;
                }
            }
            if (!encontrado) {
                System.out.println("Ingrese un valor válido");
                curso = leer.next();
            }
        } while (!encontrado);


    }

    @Override
    public String toString() {
        return super.toString() +
                "cursos=" + cursos;
    }
}
