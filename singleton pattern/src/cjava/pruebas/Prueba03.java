package cjava.pruebas;

import cjava.entidades.Alumno;

public class Prueba03 {
    public static void main(String[] args) {
        Alumno a01 = new Alumno("Juan", 15, false);
        Alumno a02 = new Alumno("Carlos", 5, false);
        Alumno a03 = new Alumno("Jose", 12, false);
        Alumno a04 = new Alumno("Rosa", 18, true);

        Alumno[] alumnos = {a01, a02, a03, a04};
        for (Alumno alumno : alumnos) {
            System.out.println(alumno.getId() + " - " + alumno.getNombre() + " - " + alumno.getPromedio() + " - " + alumno.getEstado());
        }
    }
}
