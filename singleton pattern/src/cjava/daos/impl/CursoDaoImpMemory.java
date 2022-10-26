package cjava.daos.impl;

import cjava.daos.CursoDao;
import cjava.entidades.Curso;

import java.util.ArrayList;
import java.util.List;

public class CursoDaoImpMemory implements CursoDao {

    private List<Curso> cursos;

    public CursoDaoImpMemory() {
        cursos = new ArrayList<>();
    }
    @Override
    public void insert(Curso curso) {
        if(findById(curso.getId()) == null) {
            cursos.add(curso);
        }
    }

    @Override
    public Curso findById(int id) {
        for(Curso c: cursos) {
            if(c.getId() == id) {
                return c;
            }
        }
        return null;
    }

    @Override
    public List<Curso> findAll() {
        return cursos;
    }

    @Override
    public void update(Curso curso) {
        Curso c = findById(curso.getId());
        if(c != null) {
            c.setNombre(curso.getNombre());
            c.setCreditos(curso.getCreditos());
        }

    }

    @Override
    public void delete(int id) {
        for (Curso c: cursos) {
            if(c.getId() == id) {
                cursos.remove(c);
                break;
            }
        }

    }

}

