
public class Rectangulo extends Figura{

	public Rectangulo(String color) {
		super(color);
	
	}

	@Override
	public String DibujarFigura() {
		// TODO Auto-generated method stub
		return "He dibujado un rectangulo " + getColor();
	}

}
