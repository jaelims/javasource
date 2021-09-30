package inheritance;

// Account2
// CheckingAccount

public class TrafficCardAccount extends CheckingAccount {
	// CheckingAccount => 계좌번호, 계좌주, 잔액, 카드번호
	// CheckingAccount => 입금하다, 출금하다, 체크카드 결제

	// 교통카드 기능여부
	private boolean hasTrafficCard;

	public TrafficCardAccount(String accountNum, int money, String name, 
			String cardNo, Boolean hasTrafficCard) {
		super(accountNum, money, name, cardNo);
		this.hasTrafficCard = hasTrafficCard;
	}

	
	// 교통카드 기능이 있다면 교통비 지불한다.
	// 입력값 : 카드번호, 교통비 사용액
	// 반환값 : 정수
	
	int payTraffic(String cardNo, int traffic){
		if (!hasTrafficCard) { // hasTrafficCard != true
			System.out.println("교통기능확인");
			return 0;
		}
		
		return payCard(cardNo, traffic);
	}
	
	
}
