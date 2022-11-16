package main;

public class ConexcionMongoDB implements IConexionNoSQL {

	@Override
	public void conexion() {
		System.out.println("Conexion con MongoDB");
		
	}

	@Override
	public String executeSentence() {
		
		return "Consulta MongoDB";
	}

}
