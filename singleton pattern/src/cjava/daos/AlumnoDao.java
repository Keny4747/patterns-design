package cjava.daos;

import cjava.entidades.Alumno;

import java.util.List;

public interface AlumnoDao {
    public void insert(Alumno alumno);
    public Alumno findById(int id);
    public List<Alumno> findAll();
    public void updateAlumno(Alumno alumno);
    public void deleteAlumno(int id);

}
