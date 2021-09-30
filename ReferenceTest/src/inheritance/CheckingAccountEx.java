package inheritance;

public class CheckingAccountEx {
	public static void main(String[] args) {
		CheckingAccount checkingAccount = new CheckingAccount("122-12", 200000, "홍길동", "122-12-133");

		// 카드 번호 안맞는 경우
		// System.out.println(checkingAccount.payCard("122-12", 50000));

		// 카드 번호 맞는 경우
		System.out.println("현재 잔액 " + checkingAccount.payCard("122-12-133", 50000));

	}
}
