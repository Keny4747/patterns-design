package cjava.daos.impl;

import cjava.daos.AlumnoDao;
import cjava.entidades.Alumno;

import java.util.ArrayList;
import java.util.List;

public class AlumnoDaoImpMemory implements AlumnoDao {
    private List<Alumno> alumnos;

    public AlumnoDaoImpMemory(){
        alumnos = new ArrayList<>();
    }

    @Override
    public void insert(Alumno alumno) {

        if(findById(alumno.getId()) == null) {
            alumnos.add(alumno);
        }
    }

    @Override
    public Alumno findById(int id) {
        for(Alumno a: alumnos) {
            if(a.getId() == id) {
                return a;
            }
        }
        return null;
    }

    @Override
    public List<Alumno> findAll() {

        return alumnos;
    }

    @Override
    public void updateAlumno(Alumno alumno) {
        Alumno a = findById(alumno.getId());
        if(a != null) {
            a.setNombre(alumno.getNombre());
            a.setPromedio(alumno.getPromedio());
            a.setGenero(alumno.isGenero());

        }
    }

    @Override
    public void deleteAlumno(int id) {
        for (Alumno a: alumnos) {
            if(a.getId() == id) {
                alumnos.remove(a);
                break;
            }
        }
    }
}

