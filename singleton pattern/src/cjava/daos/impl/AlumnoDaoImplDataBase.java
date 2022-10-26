package cjava.daos.impl;
import cjava.daos.AlumnoDao;
import cjava.entidades.Alumno;

import java.util.List;
public class AlumnoDaoImplDataBase implements AlumnoDao {
    @Override
    public void insert(Alumno alumno) {
        System.out.println("insertAlumno");
    }

    @Override
    public Alumno findById(int id) {
        System.out.println("findAlumnoById");
        return null;
    }

    @Override
    public List<Alumno> findAll() {
        System.out.println("findAllAlumnos");
        return null;
    }

    @Override
    public void updateAlumno(Alumno alumno) {
        System.out.println("updateAlumno");
    }

    @Override
    public void deleteAlumno(int id) {
        System.out.println("deleteAlumno");
    }
}

