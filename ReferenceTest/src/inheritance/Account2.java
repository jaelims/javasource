package inheritance;

import java.util.Set;

public class Account2 {
	private String accountNum;
	private int money;
	private String name;
	
//	public Account2() {
//		super();
//	}
	public Account2(String accountNum, int money, String name) {
		super();
		this.accountNum = accountNum;
		this.money = money;
		this.name = name;
	}
//	public Account2(String accountNum, String name) {
//		super();
//		this.accountNum = accountNum;
//		this.name = name;
//	}
//	
//	public void setAccountNum(String accountNum) {
//		this.accountNum = accountNum;
//	}
//	
	public void setName(String name) {
		this.name = name;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	
	public int getMoney() {
		return money;
	}
	
	void deposit(int amount) {
		money += amount;
	}
	int withdraw(int amount) {
		if (money > amount) {
			money -= amount;
		}
		return money;
	}
}
