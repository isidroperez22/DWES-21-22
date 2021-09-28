package factoria1;

public class Main {

	public static void main(String[] args) {
		Pizza pizza = FactoryPizzas.devuelvePizza("Carbonara");
		System.out.println(pizza);
	}

}
