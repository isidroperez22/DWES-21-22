package singleton;

public class Cubo {
	
	private int cantidad;
	
	public Cubo(int cantidad) {
		this.cantidad = cantidad;
	}
	
	public void vaciar () {
		Deposito.getDeposito();
		Deposito.llenar(this.cantidad);
		this.cantidad = 0;
	}
	
	public void llenar () {
		Deposito.getDeposito();
		Deposito.vaciar(this.cantidad);
	}

}
