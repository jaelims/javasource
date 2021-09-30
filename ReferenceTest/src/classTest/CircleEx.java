package classTest;

public class CircleEx {
	public static void main(String[] args) {
		Circle cir1 = new Circle();
		cir1.radius = 12;
		System.out.printf("면적 : %.2f\n", cir1.volume());
		
		
		Circle cir2 = new Circle();
		cir2.radius = 3.3;
		System.out.printf("면적 : %.2f\n", cir2.volume());
	}
}
