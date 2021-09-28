package singleton;

public class Main {

	public static void main(String[] args) {
		Cubo c1 = new Cubo(5);
		Cubo c2 = new Cubo(6);
		Cubo c3 = new Cubo(9);
		
		c1.vaciar();
		c2.vaciar();
		
		System.out.println(Deposito.getCantidad());
	}

}
