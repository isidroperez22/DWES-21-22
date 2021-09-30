
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Figura figura = FiguraFactory.creaFigura("circulo", "verde");
		Figura figura2 = FiguraFactory.creaFigura("triangulo", "azul");
		Figura f3 = FiguraFactory.creaFigura("cuadrado", "blanco");
		Figura f4 = FiguraFactory.creaFigura("rectangulo", "amarillo");
		
		System.out.println(figura.DibujarFigura());
		System.out.println(figura2.DibujarFigura());
		System.out.println(f3.DibujarFigura());
		System.out.println(f4.DibujarFigura());
	}

}
