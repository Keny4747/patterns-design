package cjava.pruebas;

import cjava.entidades.Alumno;
import cjava.entidades.Curso;
import cjava.service.AlumnoService;
import cjava.service.impl.AlumnoServiceImpl;

public class Prueba06 {
    public static void main(String[] args) {
        //TODO insertar dos alumnos y mostrarles en la consola

        Alumno alumno01 = new Alumno();
        alumno01.setNombre("Carlos");
        alumno01.setPromedio(11.5);
        alumno01.setGenero(true);

        Alumno alumno02 = new Alumno();
        alumno02.setNombre("Jaime");
        alumno02.setPromedio(15.0);
        alumno02.setGenero(true);

        AlumnoService service = new AlumnoServiceImpl();
        service.registrar(alumno01);
        service.registrar(alumno02);

        for (Alumno a : service.listar()){
            System.out.println(a.getId()+"-"+a.getNombre()+"-"+a.getPromedio()+"-"+a.getEstado() );
        }
    }
}
