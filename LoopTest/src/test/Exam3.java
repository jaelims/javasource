package test;

import java.util.Scanner;

public class Exam3 {
	public static void main(String[] args) {
		boolean run = true;

		// 잔액
		int balance = 0;

		Scanner sc = new Scanner(System.in);

		while (run) {
			System.out.println("*************************");
			System.out.println("1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료");
			System.out.println("*************************");
			System.out.print("선택 >>> ");

			// 1 선택 : 사용자한테 예금액 입력받기 => balance 추가
			// 2 선택 : 사용자한테 출금액 입력받기 => balance 차감
			// 3 선택 : balance 출력
			// 4 선택 : run = false 변경 후 프로그램 종료

			int menu = sc.nextInt();

			if (menu == 1) {
				System.out.print("예금액 입력 : ");
				balance += sc.nextInt();
			} else if (menu == 2) {
				System.out.print("출금액 입력 : ");
				balance -= sc.nextInt();
			} else if (menu == 3) {
				System.out.printf("잔액 : %d원\n", balance);
			} else if (menu == 4) {
				run = false;
			} else {
				System.out.println("다시 입력");
			}
		}
		System.out.println("프로그램 종료");
	}
}
