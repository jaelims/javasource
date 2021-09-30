package test;

/* 2 * 1 = 2
 * 2 * 2 = 4
 *  ......
 * 3 * 1 = 3
 * 3 * 2 = 6
 *  ......
 *  ...... 
 *  9 * 1 = 9
 */

public class ForTest6 {
	public static void main(String[] args) {

		for (int i = 2; i < 10; i++) {
			for (int j = 1; j < 10; j++) {
				System.out.printf("%d * %d = %2d ", i, j, i * j);
			}
			System.out.println();
		}
	}
}
