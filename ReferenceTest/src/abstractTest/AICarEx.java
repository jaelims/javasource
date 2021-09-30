package abstractTest;

public class AICarEx {
	public static void main(String[] args) {
		AICar ai = new AICar("black");
		
		ai.start();
		ai.drive();
		ai.stop();
		
		// Cannot instantiate the type Car
		// 추상클래스는 객체 생성 불가
		// Car car = new Car();
		Car car = new AICar("White");
		car.start();
		car.drive();
		car.stop();
	}
}
