import java.util.Scanner;

// 비만도 검사
//
// 이름 : 
// 키 : 
// 몸무게 : 
// ----------------
// 표준체중: xx.xxkg
// 비만도 	: yy.yy%
// zzz씨는 비만
//
// 표준체중 = (키 - 100) * 0.9
// 비만도 = (몸무게/표준체중) * 100
// 비만도 120초과하면 비만, 아니면 정상

public class bimanCheckMain {
	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);
		
		System.out.println("비만도 검사");

		System.out.print("이름 : ");
		String name = k.next();
		
		System.out.print("키 : ");
		double h = k.nextDouble();
		
		System.out.print("몸무게 : ");
		double w = k.nextDouble();
		
		System.out.println("-------------");
		double x = (h - 100) * 0.9;
		System.out.printf("표준체중 : %.2fkg\n", x);
		
		double y = (w/x) * 100;
		System.out.printf("비만도 : %.2f%%\n", y);
		
		String z = (y > 120) ? "비만" : "정상";
		System.out.printf("%s씨는 %s\n", name, z);
		
		System.out.println("끄고싶으면 아무거나 입력");
		String t = k.next();
	}
}
