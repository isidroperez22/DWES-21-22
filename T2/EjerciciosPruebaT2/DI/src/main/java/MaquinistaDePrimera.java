
public class MaquinistaDePrimera extends Maquinista{
	private int antiguedad;
	
	public MaquinistaDePrimera(String nombre, String apellidos, String direccion, int antiguedad) {
		super(nombre , apellidos, direccion);
		this.antiguedad = antiguedad;
		
	}

	public int getAntiguedad() {
		return antiguedad;
	}

	public void setAntiguedad(int antiguedad) {
		this.antiguedad = antiguedad;
	}

	@Override
	public String toString() {
		return "MaquinistaDePrimera [antiguedad=" + antiguedad + "]";
	}

}
