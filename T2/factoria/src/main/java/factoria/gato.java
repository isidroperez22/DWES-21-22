package factoria;

public class gato extends Animal {
	
	
	@Override
	public void saluda() {
		System.out.println("Miau");
	}
	
	public gato(String nombre) {
		super(nombre);
	}
}
