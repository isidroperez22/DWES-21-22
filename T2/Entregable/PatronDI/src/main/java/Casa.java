
public class Casa {
	private Pared pared1;
	private Pared pared2;
	private Pared pared3;
	private Pared pared4;
	private Tejado tejado;
	private double area;
	
	public Casa(double area, Pared pared1, Pared pared2, Pared pared3, Pared pared4, Tejado tejado) {
		this.area = area;
		this.pared1 = pared1;
		this.pared2 = pared2;
		this.pared3 = pared3;
		this.pared4 = pared4;
		this.tejado = tejado;
		
	}

	@Override
	public String toString() {
		return "Casa [pared1=" + pared1 + ", pared2=" + pared2 + ", pared3=" + pared3 + ", pared4=" + pared4
				+ ", tejado=" + tejado + ", area=" + area + "]";
	}
	
}
