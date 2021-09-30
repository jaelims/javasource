package test;

public class TypeTest1 {
	public static void main(String[] args) {
		// 타입 - 1) 기본타입 2) 참조타입
		// 변수의 메모리 사용되는 방식이 달라짐

		// 기본타입
		int age = 25;
		double price = 200.3;
		//int time = null;

		// 참조타입 => Heap 에 생성 / null 초기화 /
		// 문자열 String name = new String("java")
		String name = "java";
		String name2 = new String("java");
		String hobby = null; // 아직 힙 역역이 할당되지 않은 것

		// 값 비교 ==, !=
		// equals()
		System.out.println(name == name2 ? "동일함" : "다름");
		System.out.println(name.equals(name2) ? "동일함" : "다름");

		System.out.println(hobby);
		// java.lang.NullPointerException
		System.out.println(hobby.length());
	}
}







