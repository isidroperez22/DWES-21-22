
public class Maquinista {
	private String nombre;
	private String apellidos;
	private String direccion;
	
	public Maquinista(String Nombre, String Apellidos, String Direccion) {
		this.nombre = Nombre;
		this.apellidos = Apellidos;
		this.direccion = Direccion;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	@Override
	public String toString() {
		return "Maquinista [nombre=" + nombre + ", apellidos=" + apellidos + ", direccion=" + direccion + "]";
	}
	
}
