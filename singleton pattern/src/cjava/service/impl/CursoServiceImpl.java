package cjava.service.impl;

import cjava.daos.CursoDao;
import cjava.daos.impl.DaoFactory;
import cjava.entidades.Curso;
import cjava.service.CursoService;
import cjava.util.Tipo;

import java.util.List;

public class CursoServiceImpl implements CursoService {

    private CursoDao cursoDao;

    public CursoServiceImpl() {

      cursoDao = DaoFactory.getInstance().getCursoDao(Tipo.MEMORY);
    }

    @Override
    public void registrar(Curso curso) {

      cursoDao.insert(curso);
    }

    @Override
    public void actualizar(Curso curso) {
        cursoDao.update(curso);
    }

    @Override
    public void eliminar(Curso curso) {
        cursoDao.delete(curso.getId());
    }

    @Override
    public Curso buscarPorId(int id) {

      return cursoDao.findById(id);
    }

    @Override
    public List<Curso> listar() {
        return cursoDao.findAll();
    }

}
