package factoria;

public abstract class Animal {
	private String nombre;
	
	public abstract void saluda();
	public Animal(String nombre) {
		super();
		this.nombre = nombre;
		
	}
	
}
