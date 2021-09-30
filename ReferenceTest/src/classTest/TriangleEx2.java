package classTest;

public class TriangleEx2 {
	public static void main(String[] args) {
		Triangle2 triangel1 = new Triangle2(150, 11);
//		triangel1.baseLine = 151;
//		triangel1.height = 11;
		System.out.println("넓이 : "+triangel1.getArea());
		
		
		Triangle2 triangel2 = new Triangle2(80,25);
//		triangel2.baseLine = 80;
//		triangel2.height = 25;
		System.out.println("넓이 : "+triangel2.getArea());
	}
}
