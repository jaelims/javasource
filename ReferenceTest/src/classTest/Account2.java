package classTest;

import java.util.Set;

public class Account2 {
	// 속성 : 계좌번호(122-01-12222), 잔액, 이름
	private String accountNum;
	private int money;
	private String name;
	
	
	// 생성자 작성
	// [마우스오른쪽] - [source] - [Generate Constructor using Fields...] => 일반생성자
	// [마우스오른쪽] - [source] - [Generate Constructor using Super class...] => default
	// 기본생성자
	public Account2() {
		super();
	}
	public Account2(String accountNum, int money, String name) {
		super();
		this.accountNum = accountNum;
		this.money = money;
		this.name = name;
	}
	public Account2(String accountNum, String name) {
		super();
		this.accountNum = accountNum;
		this.name = name;
	}
	
	// 외부로부터 값을 받아서 멤버변수의 값을 변경하는 작업시
	// set~으로 메소드를 작성한다.
	
	
	// 멤버변수 : 계좌번호를 변경하고 싶다면?
	public void setAccountNum(String accountNum) {
		this.accountNum = accountNum;
	}
	
	// 이름을 변경하고 싶다면?
	public void setName(String name) {
		this.name = name;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	
	// 멤버 변수의 값을 리턴하고 싶다면?
	// get~~
	public int getMoney() {
		return money;
	}
	
	
	
	
	// 기능 : 입금한다.(입력값 : 입금액, 반환값 : 없음) => 현재잔액 += 입금액
	// 		출금한다.(입력값 : 출금액, 반환값 : 현재잔액) = > 현재잔액 -=출금액
	void add(int amount) {
		money += amount;
	}
	int subtrack(int amount) {
		if (money > amount) {
			money -= amount;
		}
		return money;
	}
}
