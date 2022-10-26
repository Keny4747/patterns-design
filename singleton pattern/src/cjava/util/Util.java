package cjava.util;

public class Util {

    public static final int PROMEDIO =13;
    public static final String MENSAJE_APROBADO= "Aprobado";
    public static final String MENSAJE_DESAPROBADO= "Desaprobado";
    public static final String MENSAJE_NO_DEFINIDO= "No Definido";

    //variable de Clase
    public static int id = 1;
    //metodo de Clase
    public static int generarId(){
        return id++;
    }
    //metodo de instancia
    public int calcularImpuesto(double monto){
        return (int)(monto * 0.18);
    }
}
