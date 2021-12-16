import java.util.Scanner;

public class BimanCheckMain {
	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);

		System.out.println("비만도 검사-----");

		System.out.print("이름 : ");
		String name = k.next();

		System.out.print("키 : ");
		double height = k.nextDouble();

		System.out.print("몸무게 : ");
		double weight = k.nextDouble();

		System.out.println("-----");
		double stdWeight = (height - 100) * 0.9;
		double bimando = (weight / stdWeight) * 100;
		String result = (bimando > 120) ? "비만" : "정상";
		
		System.out.printf("표준체중 : %.2fkg\n", stdWeight);
		System.out.printf("비만도 : %.2fkg\n", bimando);
		System.out.printf("%s씨는 %s\n", name, result);

		System.out.println("끄고싶으면 뭐라도 쳐요");
		String t = k.next();
	}
}


