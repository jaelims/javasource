package lambda;

public class LambdaEx3 {
	public static void main(String[] args) {
		String s1 = "Hello";
		String s2 = "World";
		
		LambdaTest3 obj = (s, v) -> System.out.println(s+v);
		obj.makeString(s1, s2);
	}
}
