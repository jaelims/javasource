package test;

public class ForTest3 {
	public static void main(String[] args) {

		for (int i = 1; i < 10; i++) {
			// System.out.println("2 * " + i + " = " + (2 * i));
			System.out.printf("2 * %d = %02d\n", i, (2 * i));
		}
	}
}
