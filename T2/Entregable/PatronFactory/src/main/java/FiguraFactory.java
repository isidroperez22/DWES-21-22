
public class FiguraFactory {
	public static Figura creaFigura(String figura, String color ) {
		if(figura.equals("triangulo")) {
			return new Triangulo(color);
		} else if (figura.equals("rectangulo")) {
			return new Rectangulo(color);
		} else if (figura.equals("circulo")) {
			return new Circulo(color);
		} else if(figura.equals("cuadrado")){
			return new Cuadrado(color);
		} else {
			return null;
		}
	}
}
