package cjava.service;

import cjava.entidades.Curso;

import java.util.List;

public interface CursoService {
  public void registrar(Curso curso);
  public void actualizar(Curso curso);
  public void eliminar(Curso curso);
  public Curso buscarPorId(int id);
  public List<Curso> listar();
}
