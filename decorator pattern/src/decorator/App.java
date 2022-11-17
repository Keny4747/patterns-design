package decorator;

public class App {
	
	public static void main(String[] args) {
		Cuenta c = new Cuenta(1,"Carlos");
		
		ICuentaBancaria cuenta = new CuentaAhorro();
		ICuentaBancaria cuentaBlindada = new BlindajeDecorador(cuenta);
		
		cuentaBlindada.abrirCuenta(c);
	}

}
