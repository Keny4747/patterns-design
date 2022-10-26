package cjava.entidades;

import static cjava.util.Util.MENSAJE_APROBADO;
import static cjava.util.Util.MENSAJE_DESAPROBADO;
import static cjava.util.Util.PROMEDIO;

public class Alumno extends Persona {

    private String estado;
    private double promedio;

    public Alumno() {
        super();
    }

    public Alumno( String nombre, double promedio, boolean genero) {
        super(nombre, genero);
        this.promedio = promedio;
    }

    public String getEstado() {
        if(promedio >= PROMEDIO)
            estado = MENSAJE_APROBADO;
        else
            estado = MENSAJE_DESAPROBADO;
        return estado;
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        if(promedio>=0 && promedio<=20)
            this.promedio = promedio;
        else
            this.promedio = 0;
        this.promedio = promedio;
    }

    @Override
    public String toString() {
        return "Alumno{" +super.toString()+
                "estado='" + getEstado() + '\'' +
                ", promedio=" + promedio +
                '}';
    }
}
