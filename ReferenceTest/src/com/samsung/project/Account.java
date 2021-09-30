package com.samsung.project;

public class Account {
	// 속성 : 계좌번호(122-01-12222), 잔액, 이름
	private String accountNum;
	private int money;
	private String name;
	
	// 기본생성자
	public Account(String accountNum, int money, String name) {
		super();
		this.accountNum = accountNum;
		this.money = money;
		this.name = name;
	}
	
	
	// 기능 : 입금한다.(입력값 : 입금액, 반환값 : 없음) => 현재잔액 += 입금액
	// 		출금한다.(입력값 : 출금액, 반환값 : 현재잔액) = > 현재잔액 -=출금액
	public void add(int amount) {
		money += amount;
	}
	public int subtrack(int amount) {
		if (money > amount) {
			money -= amount;
		}
		return money;
	}
}
