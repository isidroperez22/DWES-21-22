package singleton;

public class Deposito {
	private static int cantidad = 0;
	private static Deposito deposito = null;
	
	public static int getCantidad() {
		return Deposito.cantidad;
	}
	
	private Deposito() {
		System.out.println("Soy un deposito");
	}
	
	public static Deposito getDeposito() {
		if (deposito == null) {
			deposito = new Deposito();
		}
		return deposito;
	}
	public static int llenar (int numlitros) {
		Deposito.cantidad += numlitros;
		System.out.println("Se ha llenado el deposito");
		return numlitros;
	}
	public static int vaciar (int numlitros) {
		Deposito.cantidad -= numlitros;
		System.out.println("Se ha vaciado el deposito");
		return numlitros;
	}

}
