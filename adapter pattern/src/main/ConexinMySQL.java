package main;

public class ConexinMySQL implements IConexcionSQL {

	@Override
	public void conexion() {
		System.out.println("Conexión con MYSQL");
		
	}

	@Override
	public String runQuery() {
		
		return "Consulta MYSQL";
	}
	
	

}
