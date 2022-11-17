package decorator;

public abstract class CuentaDecorador implements ICuentaBancaria{
	
	protected ICuentaBancaria cuentaDecorada;
	
	public CuentaDecorador(ICuentaBancaria cuentaDecorada) {
		this.cuentaDecorada=cuentaDecorada;
	}

	@Override
	public void abrirCuenta(Cuenta cuenta) {
		this.cuentaDecorada.abrirCuenta(cuenta);
		
	}

}
