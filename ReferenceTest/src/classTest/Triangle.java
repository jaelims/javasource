package classTest;

public class Triangle {
	// 삼각형 넓이 구하기
	// 밑변 * 높이 / 2

	// 속성 : 밑변, 높이
	int baseLine;
	int height;
	
	// 생성자는 기본 생성자
	// Triangle(){}
	
	// 기능(메소드) : 밑변 * 높이 / 2 결과 리턴
	int volume() {
		return baseLine * height / 2;
	}
}
