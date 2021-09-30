import java.util.Scanner;

// 대부분 2항연산
//		a > 2
//		1 + 2
//
//	1항(단항) 연산
//		!d

// 3항연산
//		조건식 ? 0때값 : x때값

public class OperatorMain {
	public static void main(String[] args) {

	Scanner k = new Scanner(System.in);

	System.out.print("이름 : ");
	String name = k.next();
	
	System.out.print("나이 : ");
	int age = k.nextInt();
	
	// 이름이 홍길동이면 어? 야!!!, 아니면 어서오세요
	// 연산자라는것들은 stack영역이 대상
	// String say2 = (name == "홍길동") ? "어? 야!!!" : "어서오세요";
	String say2 = (name.equals("홍길동")) ? "어? 야!!!" : "어서오세요";
	System.out.println(say2);
	
	// 20살 이상이면 안녕하세요, 아니면 나가
	String say = (age >= 20) ? "안녕하세요" : "나가";
	System.out.println(say);
	
	// 나이가 짝수면 짝, 홀수면 홀
	String oe = (age % 2 == 0) ? "짝" : "홀";
	System.out.println(oe);
	
	}
}
