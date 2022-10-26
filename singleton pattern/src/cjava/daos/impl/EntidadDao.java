package cjava.daos.impl;

import cjava.entidades.Curso;

import java.util.List;

public interface EntidadDao<T> {
    public void insert(T t);
    public T findById(int id);
    public List<T> findAll();
    public void updateCurso(T t);
    public void deleteCurso(int id);
}
