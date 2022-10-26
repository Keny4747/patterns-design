package cjava.daos;

import cjava.entidades.Curso;

import java.util.List;

public interface CursoDao {
    public void insert(Curso curso);
    public Curso findById(int id);
    public List<Curso> findAll();
    public void update(Curso curso);
    public void delete(int id);

}
