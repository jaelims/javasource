package classTest;

public class CircleEx {

	public static void main(String[] args) {
		Circle circle = new Circle();
		circle.radius = 5;
		System.out.println("원의 면적 : "+circle.getArea());
		
		
		Circle circle2 = new Circle();
		circle2.radius = 4.5;
		System.out.println("원의 면적 : "+circle2.getArea());

	}

}
