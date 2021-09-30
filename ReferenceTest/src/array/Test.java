package array;

public class Test {
	public static void main(String[] args) {
		int a = 45;
		int b = 78;

		int temp = a; // 45
		a = b;
		b = temp;

		System.out.println(a + " " + b);
	}
}
