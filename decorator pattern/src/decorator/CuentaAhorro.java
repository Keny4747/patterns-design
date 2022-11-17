package decorator;

public class CuentaAhorro implements ICuentaBancaria{

	@Override
	public void abrirCuenta(Cuenta cuenta) {
		System.out.println("------------------------");
		System.out.println("Se abrió una cuenta de ahorros");
		System.out.println("Cliente: "+cuenta.getCliente());
		
	}

}
