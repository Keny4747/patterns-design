package cjava.daos.impl;

import cjava.daos.AlumnoDao;
import cjava.daos.CursoDao;
import cjava.util.Tipo;

public class DaoFactory {
    public static DaoFactory instance = new DaoFactory();

    private DaoFactory() {

    }

    public static DaoFactory getInstance() {
        return instance;
    }


    public CursoDao getCursoDao(Tipo tipo) {
        switch (tipo) {
            case MEMORY:
                return new CursoDaoImpMemory();
            case FILE:
                return new CursoDaoImplFile();
            case  DATABASE:
                return new CursoDaoImplDataBase();
            default:
                return null;
        }
    }

    public AlumnoDao getAlumnoDao(Tipo tipo) {
        switch (tipo) {
            case MEMORY:
                return new AlumnoDaoImpMemory();
            case FILE:
                return new AlumnoDaoImplFile();
            case  DATABASE:
                return new AlumnoDaoImplDataBase();
            default:
                return null;
        }
    }

}

