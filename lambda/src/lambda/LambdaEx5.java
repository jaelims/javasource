package lambda;

public class LambdaEx5 {
	
	// 매개변수로 전달하는 람다식
	public static void execute(LambdaTest5 lambda) {
		lambda.run();		
	}
	
	// 반환 값으로 쓰이는 람다식
	public static LambdaTest5 getRun() {
		LambdaTest5 obj1 = () -> System.out.println("함수형 인터페이스 리턴");
		return obj1;
	}
	
	public static void main(String[] args) {
		// 람다식
		LambdaTest5 lambda = () -> System.out.println("Lambda!!!! run");
		lambda.run();
		
		System.out.println("----------------");
		execute(getRun());
		System.out.println("----------------");
	}
}
