package cjava.service;

import cjava.entidades.Alumno;
import cjava.entidades.Curso;

import java.util.List;

public interface AlumnoService {
    public void registrar(Alumno alumno);
    public void actualizar(Alumno alumno);
    public void eliminar(Alumno alumno);
    public Alumno buscarPorId(int id);
    public List<Alumno> listar();
}
