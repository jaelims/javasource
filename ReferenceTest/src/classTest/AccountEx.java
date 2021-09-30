package classTest;

public class AccountEx {
	public static void main(String[] args) {
		
		Account acc1 = new Account();
		acc1.accountNum = "122-01-12222";
		acc1.name = "가나다";
		acc1.money = 5000;
		
		//입금
		acc1.add(50000);
		
		//출금
		int money = acc1.subtrack(10000);
		System.out.printf("%s님의 현재잔액 : %d원\n", acc1.name, money);
	}
}
