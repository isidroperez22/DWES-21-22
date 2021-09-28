package factoria;

public class Perro extends Animal{
	@Override
	public void saluda() {
		System.out.println("guau");
	}
	
	public Perro(String nombre) {
		super(nombre);
	}
}
