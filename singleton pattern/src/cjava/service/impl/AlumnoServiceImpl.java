package cjava.service.impl;

import cjava.daos.AlumnoDao;
import cjava.daos.impl.DaoFactory;
import cjava.entidades.Alumno;
import cjava.service.AlumnoService;
import cjava.util.Tipo;

import java.util.List;

public class AlumnoServiceImpl implements AlumnoService {

    private AlumnoDao alumnoDao;

    public AlumnoServiceImpl() {

        alumnoDao = DaoFactory.getInstance().getAlumnoDao(Tipo.MEMORY);
    }
    @Override
    public void registrar(Alumno alumno) {
        alumnoDao.insert(alumno);
    }

    @Override
    public void actualizar(Alumno alumno) {
        alumnoDao.updateAlumno(alumno);
    }

    @Override
    public void eliminar(Alumno alumno) {
        alumnoDao.deleteAlumno(alumno.getId());
    }

    @Override
    public Alumno buscarPorId(int id) {
        return alumnoDao.findById(id);
    }

    @Override
    public List<Alumno> listar() {
        return alumnoDao.findAll();
    }
}
