package main;

public class Main {
	
	public static void main(String[] args) {
		
		
		//IConexcionSQL conexion = new ConexinMySQL();
		
		//IConexionNoSQL conexion = new ConexcionMongoDB();
		IConexcionSQL conexion = new AdapterDB(new ConexcionMongoDB());
		
		///////////////////////////////////////////////////////
		
		conexion.conexion();
		
		String resultado = conexion.runQuery();
		
		System.out.println(resultado);
	}
}
