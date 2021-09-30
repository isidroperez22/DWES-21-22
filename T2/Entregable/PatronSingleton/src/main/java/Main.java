
public class Main {

	public static void main(String[] args) {
		Presidente p1 =  Presidente.getPresi("Manolo", "Lama", 2016);
		Presidente p2 = Presidente.getPresi("Rolando", "Nazairo", 2020);
		
		System.out.println(p1.toString());
		System.out.println(p2.toString());
		
	}

}
