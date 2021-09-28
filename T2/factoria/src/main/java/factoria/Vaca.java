package factoria;

public class Vaca extends Animal{
	
	@Override
	public void saluda() {
		System.out.println("Muuuuu");
	}
	
	public Vaca(String nombre) {
		super(nombre);
	}

}
