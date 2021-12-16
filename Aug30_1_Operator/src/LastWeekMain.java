import java.util.Scanner;

// 논리결합연산자
//	&& &		|| |		!			^
//	고/and		거나/or		반대/not	xor

// XOR(eXclusive OR) - 배타적 or
//
//	2개짜리 : 중단되는 버전 - v
//		&& - 더 확률 낮은거를 앞으로 배치
//		|| - 더 확률 높은거를 앞으로 배치
//	1개짜리 : 끝까지 가는 버전

public class LastWeekMain {
	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);

		System.out.print("가로 : ");
		int x = k.nextInt();
		System.out.print("세로 : ");
		double y = k.nextDouble();
		System.out.print("높이 : ");
		double z = k.nextDouble();
		System.out.print("무게 : ");
		double w = k.nextDouble();

		System.out.println("-----");

		double v = x * y * z;
		System.out.printf("부피 : %.1f㎤\n", v);
		System.out.printf("무게 : %.1fkg\n", w);
		
		// 부피 : ㎤
		// 무게 : kg
		
		// 부피가 10이상이고, 무게가 1000이상이면
		boolean a = (w >= 1000) && (v >= 10) ;
		//boolean a = (v >= 10) && (w >= 1000);
		System.out.println(a);
		
		// o o -> o
		// o x -> o
		// x o -> o
		// x x -> x
		// 부피가 10미만이거나, 무게가 1000미만이면
		boolean b = (w < 1000) || (v < 10) ;
		//boolean b = (v < 10) || (w < 1000);
		System.out.println(b);
		
		// o o -> x
		// o x -> o
		// x o -> o
		// x x -> x
		// 부피가 10미만이든지, 무게가 1000미만이든지 하나만
		boolean d = (v < 10) ^ (w < 1000);
		System.out.println(d);
		
		// 무게가 20이상이고, 무게가 30이상이면
		boolean c = (w >= 30); 
		//boolean c = (w >= 20) && (w >= 30); 
		System.out.println(c);
		
		
	}
}


