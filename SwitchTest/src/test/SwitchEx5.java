package test;

import java.util.Scanner;

public class SwitchEx5 {
	public static void main(String[] args) {
		// 사용자한테 숫자 2개 입력 받기
		// 연산자 입력받기(+,-,*,/,%)

		// switch(연산자)
		// 연산 후 계산 결과 출력

		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 1번 : ");
		int num1 = sc.nextInt();

		System.out.print("숫자 2번 : ");
		int num2 = sc.nextInt();

		System.out.print("연산자(+,-,*,/,%) : ");
		String asd = sc.next();

		System.out.println("--------");

		int result = 0;
		switch (asd) {
		case "+":
			result = num1 + num2;
			//System.out.println(num1 + asd + num2 + "=" + (num1 + num2));
			break;
		case "-":
			result = num1 - num2;
			//System.out.println(num1 + asd + num2 + "=" + (num1 - num2));
			break;
		case "*":
			result = num1 * num2;
			//System.out.println(num1 + asd + num2 + "=" + (num1 * num2));
			break;
		case "/":
			result = num1 / num2;
			//System.out.println(num1 + asd + num2 + "=" + (num1 / num2));
			break;
		case "%":
			result = num1 % num2;
			//System.out.println(num1 + asd + num2 + "=" + (num1 % num2));
			break;
		default:
			System.out.println("연산자를 확인해 주세요");
			break;
		}
		System.out.printf("%d %s %d = %d", num1, asd, num2, result);
	}
}
