import java.util.Scanner;

// ���� : 
// �� �� :
// -----------
// �Ž����� : 
// 1���� :
// 5õ�� :
// 1õ�� :
// 5��� :
	
public class MoneyMain {
	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);
			
		System.out.print("���� : ");
		int price = k.nextInt();

		System.out.print("�� �� : ");
		int a = k.nextInt();
		
		System.out.println("----------");
		int b = a - price;
		System.out.printf("�Ž����� : %d\n" , b);
		
		if (b >= 10000) {
			int mil = b / 10000;
			System.out.printf("1���� : %d��\n", mil);
			b -= mil * 10000;
		}
		if (b >= 5000) {
			int fth = b / 5000;
			System.out.printf("5õ�� : %d��\n", fth);
			b -= fth * 5000;
		}
		if (b >= 1000) {
			int tho = b / 1000;
			System.out.printf("1õ�� : %d��\n", tho);
			b -= tho * 1000;
		}
		if (b >= 500) {
			int fhe = b / 500;
			System.out.printf("5��� : %d��\n", fhe);
			b -= fhe * 500;
		}
		if (b >= 100) {
			int hen = b / 100;
			System.out.printf("1��� : %d��\n", hen);
			b -= hen * 100;
		}
		if (b >= 50) {
			int fif = b / 50;
			System.out.printf("5�ʿ� : %d��\n", fif);
			b -= fif * 50;
		}
		if (b >= 10) {
			int ten = b / 10;
			System.out.printf("1�ʿ� : %d��\n", ten);
		}
	}
}
