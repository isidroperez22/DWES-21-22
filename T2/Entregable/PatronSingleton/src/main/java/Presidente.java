
public class Presidente {
	private String nombre;
	private String apellidos;
	private int anio_eleccion;
	
	
	private Presidente(String nombre, String apellidos,  int anio) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.anio_eleccion =  anio;
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

	public int getAnio_eleccion() {
		return anio_eleccion;
	}

	public void setAnio_eleccion(int anio_eleccion) {
		this.anio_eleccion = anio_eleccion;
	}


	private static Presidente presi;
	 
	public static Presidente getPresi(String nombre, String apellidos, int anio_eleccion) {
		if (presi == null) {
			presi = new Presidente(nombre , apellidos, anio_eleccion);
		}
		return presi;
	}


	@Override
	public String toString() {
		return "Presidente [nombre=" + nombre + ", apellidos=" + apellidos + ", anio_eleccion=" + anio_eleccion + "]";
	}
	
}
