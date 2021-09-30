package abstractTest;

/* 추상 클래스 : 
 * 추상 : 구체적인 내용을
 */



public abstract class Car {
	
	private String color;
	
	public Car(String color) {
		super();
		this.color = color;
	}

	public void start() {
		System.out.println("자동차 출발");
	}
	
	abstract void drive();
	abstract void stop();
	
}
