package classTest;

public class AccountEx {

	public static void main(String[] args) {
		// È«±æµ¿ °èÁÂ
		Account account1 = new Account();
		account1.accountNo="122-01-12222";
		account1.balance=10000;
		account1.name="È«±æµ¿";
		
		//ÀÔ±İ
		account1.deposit(50000);
		
		//Ãâ±İ
		System.out.println("ÇöÀç ÀÜ¾× : "+account1.withdraw(30000));

	}

}
