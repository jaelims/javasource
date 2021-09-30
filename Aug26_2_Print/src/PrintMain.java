// 버전 1.8.0-302
// 1 : major
// 8.0-302 : minor
//	뒷자리가 바뀔수록 조금
//	major버전이 바뀜 : 다른 프로그램

// 외우지 마시길 -> 하도 작업해대서 외움을 당하시면

public class PrintMain {
	// 모든 코드는 이 영역에

	public static void main(String[] args) {
		// 여기다 쓴것만 실행

		// 콘솔창에 출력
		System.out.print("에어콘 리모콘이 어디 있을텐데");
		// 콘솔창에 출력하고 나서 줄 바꿈
		System.out.println("좀 찾아보시죠 종용씨");
		// 형식을 지정하면서 콘솔창에 출력
		System.out.printf("%.1f", 45.124564563);
		System.out.println();
		///////////////////////////
		// 특수문자
		//		\n - new line(줄만 바꿈)
		//		\r - carriage return(커서 맨앞으로)
		//		\r\n - 완성된 줄바꿈
		//			\n만 있어도 알아서 줄바꿈이 완성되는 프로그램도 존재
		//		\t - tab
		//		\\ - \
		//		\" - "
		System.out.println("지하철 3호선"); // 학원올때 뭐 타고 왔는지 출력
		System.out.println("\\2000"); // 교통비 얼마 \2000
		System.out.println("ㅋ\nㅎ");
		System.out.println("집 :\t분당");
		System.out.println("직업 :\t강사");
		System.out.println("\""); // "
	}
}



