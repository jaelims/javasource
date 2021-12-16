package classTest;

public class TriangleEx {
	public static void main(String[] args) {
		Triangle triangel1 = new Triangle();
		triangel1.baseLine = 10;
		triangel1.height = 15;
		System.out.println("≥–¿Ã : "+triangel1.getArea());
		
		
		Triangle triangel2 = new Triangle();
		triangel1.baseLine = 15;
		triangel1.height = 25;
		System.out.println("≥–¿Ã : "+triangel2.getArea());
	}
}
