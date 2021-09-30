package classTest;

public class AccountEx2 {
	public static void main(String[] args) {
		//홍길동 계좌
		Account2 acc1 = new Account2();
//		acc1.accountNum = "122-01-12222";
//		acc1.name = "홍길동";
//		acc1.money = 5000;

		//생성자를 사용하지 않고 멤버변수 값 초기화
		acc1.setMoney(5000);
		// 계좌번호
		acc1.setAccountNum("122-01-12222");
		// 이름
		acc1.setName("홍길동");
		
		
		//입금
		acc1.add(50000);
		
		//출금
		int money = acc1.subtrack(10000);
		System.out.println("입금 후 잔액 : "+ acc1.getMoney());
		
		//성춘향 계좌
		Account2 acc2 = new Account2("122-01-13333", "성춘향");
		System.out.println("입금 후 잔액 : "+ acc2.getMoney());
		
		//박보검 계좌
		Account2 acc3 = new Account2("122-01-13333", 1000000, "박보검");
		System.out.println("입금 후 잔액 : "+ acc3.getMoney());
		
				
	}
}
