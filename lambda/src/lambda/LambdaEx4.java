package lambda;

public class LambdaEx4 {
	public static void main(String[] args) {
		LambdaTest4 obj = s -> System.out.println(s+"!!");
		obj.showString("Hello");
		
		showmyString(obj);
	}
	
	public static void showmyString(LambdaTest4 lambda) {
		lambda.showString("Hello lambda");
	}
}
