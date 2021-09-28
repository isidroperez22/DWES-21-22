package factoria1;

public class FactoryPizzas{
	public static Pizza devuelvePizza(String tipo) {
		if(tipo.equals("Tropical")) {
			return new Tropical(tipo);
		} else if (tipo.equals("Barbacoa")) {
			return new Barbacoa(tipo);
		} else if (tipo.equals("Carbonara")){
		return new Carbonara(tipo);
		}
		return null;
	}

	@Override
	public String toString() {
		return "FactoryPizzas []";
	}
	
}
