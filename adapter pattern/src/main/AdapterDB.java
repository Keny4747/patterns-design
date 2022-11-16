package main;

public class AdapterDB implements IConexcionSQL{


	private IConexionNoSQL noSQL;
	
	public AdapterDB(IConexionNoSQL noSQL) {
		this.noSQL=noSQL;
	}
	
	@Override
	public void conexion() {
		this.noSQL.conexion();
	}

	@Override
	public String runQuery() {
		
		return this.noSQL.executeSentence();
	}
	

}
