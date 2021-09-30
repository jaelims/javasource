package abstractTest;

public class AICar extends Car {

	public AICar(String color) {
		super(color);
	}

	@Override
	void drive() {
		System.out.println("자율주행");
	}

	@Override
	void stop() {
		System.out.println("자동으로 멈춤");
	}

}
