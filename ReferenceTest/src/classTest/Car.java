package classTest;

public class Car {
	//속성 : 제조회사(현대, 기아...),모델명(스포티지...),색상(red,black),최대속도(200).....
	String company;
	String model;
	String color;
	int maxSpeed;
	
	//Car(){} => 기본생성자(default)
	//클래스 내에 선언된 생성자가 하나도 없으면
	//컴파일러가 자동으로 기본 생성자를 만들어줌
		
	
	//동작 : 전진하다,후진하다
	void forward() {
		System.out.println("전진하다");
	}
	void backword() {
		System.out.println("후진하다");
	}
}
