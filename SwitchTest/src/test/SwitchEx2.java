package test;

public class SwitchEx2 {
	public static void main(String[] args) {
		char grade='b';
		
		// A or a => 우수회원
		// B or b => 일반회원
		// 아무것도 없음 => 손님
		
		switch (grade) {
		case 'A':
		case 'a':	
			System.out.println("우수회원");
			break;
		case 'B':
		case 'b':	
			System.out.println("일반회원");
			break;
		default:
			System.out.println("손님");
			break; //생략 가능
		}
		
		System.out.println();
		
		//if~elseif~else 변경
		if (grade == 'A' || grade == 'a') {
			System.out.println("우수회원");
		} else if (grade == 'B' || grade == 'b') {
			System.out.println("일반회원");
		} else {
			System.out.println("손님");
		}
	}
}
