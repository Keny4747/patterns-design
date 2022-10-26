package cjava.pruebas;

import cjava.entidades.Curso;
import cjava.service.CursoService;
import cjava.service.impl.CursoServiceImpl;

public class Prueba05 {
  public static void main(String[] args) {
      Curso curso = new Curso();
      curso.setId(1);
      curso.setNombre("Java");
      curso.setCreditos(5);
      Curso curso2 = new Curso(2, "C#", 5);

      CursoService servicio = new CursoServiceImpl();
      servicio.registrar(curso);
      servicio.registrar(curso2);

        for(Curso c: servicio.listar()){
            System.out.println(c.getId() + " - " + c.getNombre() + " - " + c.getCreditos());
        }
  }

}
