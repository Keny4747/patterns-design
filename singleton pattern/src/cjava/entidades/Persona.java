package cjava.entidades;

import static cjava.util.Util.MENSAJE_NO_DEFINIDO;
import static cjava.util.Util.generarId;

public class Persona {
    private int id;
    private String nombre;
    private boolean genero;

    public Persona() {
        this.id = generarId();
    }

    public Persona(String nombre, boolean genero) {
        this.id = generarId();
        this.nombre = nombre;
        this.genero = genero;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if(nombre != null)
            this.nombre = nombre;
        else
            this.nombre = MENSAJE_NO_DEFINIDO;
    }

    public boolean isGenero() {
        return genero;
    }

    public void setGenero(boolean genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", genero=" + genero +
                '}';
    }
}
