package classTest;

public class TriangleEx {
	public static void main(String[] args) {
		Triangle triangel1 = new Triangle();
		triangel1.baseLine = 151;
		triangel1.height = 11;
		System.out.println("넓이 : "+triangel1.volume());
		
		
		Triangle triangel2 = new Triangle();
		triangel2.baseLine = 80;
		triangel2.height = 25;
		System.out.println("넓이 : "+triangel2.volume());
	}
}
