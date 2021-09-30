import java.util.Scanner;

// 대입연산자 
//		= 
//			우항에 있는거 좌항에 넣어라
//	 		모든 연산자 중 가장 늦게 발동

// 산술연산자
//		+
//			String + ? => 붙여서 String으로
//		-
//		*
//		/
//			int / int => 나눠서 int로
//			둘 중에 하나라도 실수형이어야 => 나눠서 실수형으로
//		%	나눈 나머지

// 결합형연산자(산술연산자+대입연산자)
//		+=
//		-=
//		*=
//		/=
//		%=

// 증감연산자
//		++
//		--
public class OperatorMain {
	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);

		System.out.print("x : ");
		int xx = k.nextInt();
		System.out.print("y : ");
		int yy = k.nextInt();
		System.out.println("-----");
		System.out.printf("x는 %d, y는 %d\n", xx, yy);

		String laugh = "ㅋ";
		
		int a = xx + yy;
		String aa = xx + laugh;
		
		int b = xx-yy;
		int c = xx * yy;
		
		int d = xx / yy;
		double dd = xx / yy;
		double ddd = xx / (double) yy;
		
		int e = xx % yy;
		
		System.out.println(a);
		System.out.println(aa);
		System.out.println("차는 " + b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(dd);
		System.out.println(ddd);
		System.out.println(e);
		System.out.println("-----");
	
		// xx = xx + 5;
		xx += 5;
		System.out.println(xx);
		
		// yy = yy - 3;
		yy -= 3;
		System.out.println(yy);
		
		xx *= 2;
		System.out.println(xx);
		
		yy /= 2;
		System.out.println(yy);
		
		xx %= 3;
		System.out.println(xx);
		System.out.println("-----");
		// xx = xx + 1;
		// xx += 1;
		xx++;
		System.out.println(xx);
	}
}










