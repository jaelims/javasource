import java.util.Scanner;

// 가격 : 
// 낸 돈 :
// -----------
// 거스름돈 : 
// 1만원 :
// 5천원 :
// 1천원 :
// 5백원 :
	
public class MoneyMain {
	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);
			
		System.out.print("가격 : ");
		int price = k.nextInt();

		System.out.print("낸 돈 : ");
		int a = k.nextInt();
		
		System.out.println("----------");
		int b = a - price;
		System.out.printf("거스름돈 : %d\n" , b);
		
		if (b >= 10000) {
			int mil = b / 10000;
			System.out.printf("1만원 : %d장\n", mil);
			b -= mil * 10000;
		}
		if (b >= 5000) {
			int fth = b / 5000;
			System.out.printf("5천원 : %d장\n", fth);
			b -= fth * 5000;
		}
		if (b >= 1000) {
			int tho = b / 1000;
			System.out.printf("1천원 : %d장\n", tho);
			b -= tho * 1000;
		}
		if (b >= 500) {
			int fhe = b / 500;
			System.out.printf("5백원 : %d개\n", fhe);
			b -= fhe * 500;
		}
		if (b >= 100) {
			int hen = b / 100;
			System.out.printf("1백원 : %d개\n", hen);
			b -= hen * 100;
		}
		if (b >= 50) {
			int fif = b / 50;
			System.out.printf("5십원 : %d개\n", fif);
			b -= fif * 50;
		}
		if (b >= 10) {
			int ten = b / 10;
			System.out.printf("1십원 : %d개\n", ten);
		}
	}
}
