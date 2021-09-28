
public class Tren {
	private String modelo;
	private Maquinista maquinista;
	private Locomotora locomotora;
	
	public Tren(String modelo, Maquinista maquinista, Locomotora locomotora) {
		this.modelo = modelo;
		this.locomotora = locomotora;
		this.maquinista = maquinista;		
	}
	

	public void setMaquinista(Maquinista maquinista) {
		this.maquinista = maquinista;
	}


	public void setLocomotora(Locomotora locomotora) {
		this.locomotora = locomotora;
	}


	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}


	@Override
	public String toString() {
		return "Tren [modelo=" + modelo + ", maquinista=" + maquinista + ", locomotora=" + locomotora + "]";
	}
	

}
