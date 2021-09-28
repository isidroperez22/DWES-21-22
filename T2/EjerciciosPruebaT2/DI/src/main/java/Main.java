public class Main {

	public static void main(String[] args) {
		Locomotora l1 = new Locomotora("Loco", 500, 10);
		Maquinista m1 = new Maquinista("Manolo", "Lama", "Alli");
		MaquinistaDePrimera mp = new MaquinistaDePrimera("Manolo", "Lama", "Alli", 5);
		Tren t1 = new Tren("Carga", m1, l1);
		
	}
}