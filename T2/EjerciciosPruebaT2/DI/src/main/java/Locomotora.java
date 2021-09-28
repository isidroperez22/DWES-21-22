
public class Locomotora {
	private String modelo;
	private int potencia;
	private double longitud;
	
	public Locomotora(String modelo, int potencia, double longitud) {
		this.modelo = modelo;
		this.potencia = potencia;
		this.longitud = longitud;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getPotencia() {
		return potencia;
	}

	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}

	public double getLongitud() {
		return longitud;
	}

	public void setLongitud(double longitud) {
		this.longitud = longitud;
	}

	@Override
	public String toString() {
		return "Locomotora [modelo=" + modelo + ", potencia=" + potencia + ", longitud=" + longitud + "]";
	}
	
	

}
