package lambda;

public class LambdaEx2 {
	public static void main(String[] args) {
		LambdaTest2 obj = x -> System.out.println(x);
		obj.method1(10);
		
		obj = x -> System.out.println(x*x);
		obj.method1(5);
	}
}
