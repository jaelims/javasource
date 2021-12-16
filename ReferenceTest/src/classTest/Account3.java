package classTest;

public class Account3 {
	//속성 : 계좌번호(122-01-12222),잔액,이름
	private String accountNo; 
	private int balance;
	private String name;
	
	
	//생성자 작성
	// [마우스오른쪽] - [source] - [Generate Constructor using Fields..] => 일반생성자
	// [마우스오른쪽] - [source] - [Generate Constructor using Super class..] => default
	
	
	//기본생성자
	public Account3() {
		super();
	}	
	public Account3(String accountNo, String name) {
		super();
		this.accountNo = accountNo;
		this.name = name;
	}
	public Account3(String accountNo, int balance, String name) {
//		super();
//		this.accountNo = accountNo;
//		this.name = name;
		this(accountNo,name); //this() : 다른 생성자 호출
		this.balance = balance;
	}	

	//외부로부터 값을 받아서 멤버변수의 값을 변경하는 작업시
	// set~ 으로 메소드를 작성한다.
	
	
	
	
	
	
	
	// 멤버변수 : 계좌번호를 변경하고 싶다면?
	
	
	
	// 이름을 변경하고 싶다면?
	
	
	// 멤버 변수의 값을 리턴하고 싶다면?
	// get~~
	public int getBalance() {
		return balance;
	}
	
	public String getAccountNo() {
		return accountNo;
	}
	
	public String getName() {
		return name;
	}
	

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public void setName(String name) {
		this.name = name;
	}


	//기능 : 입금한다.(입력값 : 입금액, 반환값:없음) => 현재잔액 += 입금액
	void deposit(int amount) {
		balance += amount;
	}
	//       출금한다.(입력값 : 출금액, 반환값:현재잔액) => 현재잔액 -= 출금액
	int withdraw(int amount) {
		if(balance > amount) {
			balance -= amount;			
		}
		return balance;
	}
}








