// 본인이 판단하기에 xx가 필요하다면 그 때 쓰는거
// CPU - 연산장치 => 좋으면 빠름 - x

// RAM - 저장장치 => 좋으면 많이 저장(변수를 많이 만들 수)
//		변수형태, 임시저장(자동삭제(재부팅하거나...))
//			static - ????
//			stack - 프로그램 종료시 자동 반납 -> 수동 반납 불가능
//			heap - 자동 반납되지 않음 -> 개발자 수동으로 반납처리해야
//				Java에는 GarbageCollection기능이
//					heap영역 자동정리 시스템

// 16GB - 15.9GB남았음
//		다 썼으면 그 공간 반납해야

// SSD/HDD - 저장장치 => 좋으면 많이 저장
//		파일형태, 영구저장 -> 발전 -> DB
// GPU - 그래픽 표현하는데 필요한(CPU+RAM+HDD) - x

// 변수(Variable)
//		데이터 담는 그릇
//		프로그램 진행 중에 만들어진 데이터를 임시로 저장할 때

// 문법
//		그릇종류  			그릇이름;
//		어떤데이터저장		그릇이름;
//		자료형(data type)	변수명;

// 자료형
//		기본형
//			정수 - byte, short, int-주력, long
//			실수 - float, double-주력
//			한글자 - char
//			논리 - boolean
//			없다 - void
//		참조형
//			여러글자 - String
//			기타등등...

// 변수명
//		마음대로
//			숫자로 시작불가
//			특수문자 불가(_$는 괜찮음)
//			자바문법 불가

//			소문자로 시작
//			영어+숫자 조합으로
//			뜻을 알기 좋게 
//				-> 근데 띄어쓰기는 못쓰니
//					korScore : 낙타체
//					kor_score : 뱀체

// = 같다x
//   오른쪽에 있는거 왼쪽에 넣어라

// 기본자료형
//		아무 처리도 안하고 값만 있으면 뭘로 인식

// 형변환(casting)
//		(자료형) 값
public class VariableMain {
	public static void main(String[] args) {
		// 국어점수가 80점인거를 임시로 저장할 수 있게
		int kor; // 변수 만들기
		kor = 80; // 변수에 값 저장
		System.out.println("korScore");
		System.out.println(kor); // kor변수에 들어있는 값 출력
		System.out.println(kor);
		
		// 기온이 24.38도인거를 임시로 저장할 수 있게
		float temp;
		temp = (float) 24.38;
		System.out.println(temp);
		
		// ㅋ라는 글자를 임시로 저장할 수 있게
		char laugh;
		laugh = 'ㅋ';
		System.out.println(laugh);
		
		// ㅋㅋ라는 글자를 임시로 저장할 수 있게
		String laugh2;
		laugh2 = "ㅋㅋ";
		System.out.println(laugh2);
		
		// 배고픈가를 임시로 저장할 수 있게
		boolean isHungry;
		isHungry = false;
		System.out.println(isHungry);

		// Java에서	지역변수를 만들고 값을 안넣으면 사용이 불가능
//		int age; 
//		System.out.println(age);
		
		int age = 35;
		System.out.println(age);
		
	}
}








