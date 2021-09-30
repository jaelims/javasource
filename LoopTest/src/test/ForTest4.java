package test;

import java.util.Scanner;

public class ForTest4 {
	public static void main(String[] args) {
		// 사용자한테 구구단의 단수를 입력받기
		Scanner sc = new Scanner(System.in);
		System.out.print("구구단의 단수 입력 : ");
		int num = sc.nextInt();
		
		for (int i = 1; i < 10; i++) {
			// System.out.println("2 * " + i + " = " + (2 * i));
			System.out.printf("%d * %d = %02d\n",num, i, (num * i));
		}
	}
}
