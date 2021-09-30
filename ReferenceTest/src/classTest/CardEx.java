package classTest;

public class CardEx {
	public static void main(String[] args) {
		Card card1 = new Card("spade", 7);
		cardPrint(card1);
		// The static field Card.width should be accessed in a static way
//		card1.width = 8;
//		card1.height = 4;

		Card card2 = new Card("heart", 2);
		cardPrint(card2);
	}

	static void cardPrint(Card card) {
		System.out.println("숫자 : " + card.getNumber());
		System.out.println("모양 : " + card.getKind());
		System.out.printf("카드 크기(%d, %d)\n", Card.width, Card.height);
		System.out.println();
	}
}
