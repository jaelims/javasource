package com.hyundai.project;

import java.util.Scanner;

// 같은 패키지가 아닌 클래스를 불러올 때 필요
import com.samsung.project.Account;

public class AccountEx {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Account acc1 = new Account("122-01-12222", 5000, "가나다");
//		acc1.accountNum = "122-01-12222";
//		acc1.name = "가나다";
//		acc1.money = 5000;

		// 입금
		acc1.add(50000);

		// 출금
		int money = acc1.subtrack(10000);
		System.out.printf("현재잔액 : %d원\n", money);
	}
}
