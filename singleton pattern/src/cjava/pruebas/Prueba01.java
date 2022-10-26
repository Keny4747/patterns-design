package cjava.pruebas;

import cjava.entidades.Alumno;

public class Prueba01 {

        public static void main(String[] args) {
            Alumno a01 = new Alumno();
            Alumno a02 = new Alumno();
            Alumno a03 = new Alumno();
            Alumno a04 = new Alumno();
            Alumno a05 = new Alumno("Juan", 20, true);
            System.out.println("a01:"+a01.getId());
            System.out.println("a02:"+a02.getId());
            System.out.println("a03:"+a03.getId());
            System.out.println("a04:"+a04.getId());
            System.out.println("a05:"+a05.getId());

        }

}
