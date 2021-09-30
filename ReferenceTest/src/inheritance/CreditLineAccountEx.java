package inheritance;

public class CreditLineAccountEx {
	public static void main(String[] args) {
		CreditLineAccount creditLine = new CreditLineAccount("122-12", 50000, "홍길동", 1000000);
		
		// System.out.println(creditLine.withdraw(1500000)); // 사용금액 한도 초과
		System.out.println(creditLine.withdraw(800000));
	}
}
