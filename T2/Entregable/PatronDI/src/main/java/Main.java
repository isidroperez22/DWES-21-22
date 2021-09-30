
public class Main {

	public static void main(String[] args) {
		Pared p1 = new Pared(4);
		Pared p2 = new Pared(4);
		Pared p3 = new Pared(4);
		Pared p4 = new Pared(4);
		Tejado t1 = new Tejado();
		Pared p5 = new Pared(3);
		Pared p6 = new Pared(3);
		Pared p7 = new Pared(3);
		Pared p8 = new Pared(3);
		Tejado t2 = new Tejado();
		Casa c1 = new Casa(120, p1, p2, p3, p4 , t1 );
		Casa c2 = new Casa(100, p5, p6, p7, p8, t2);
		
		System.out.println(c1.toString());
		System.out.println(c2.toString());
	}

}
