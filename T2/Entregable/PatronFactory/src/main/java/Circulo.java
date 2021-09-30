
public class Circulo extends Figura {

	public Circulo(String color) {
		super(color);
	}

	@Override
	public String DibujarFigura() {
		return "He dibujado un Circulo " + getColor();
	}
	

}
