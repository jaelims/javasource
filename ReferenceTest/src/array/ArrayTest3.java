package array;

public class ArrayTest3 {
	public static void main(String[] args) {
		// int 타입의 배열 5개 생성
		// 0 10 20 30 40
		int score[]= {0, 10, 20, 30, 40};
//		for (int i = 0; i < score.length; i++) {
//			System.out.print(score[i]+"\t");
//		}
		
		for(int idx:score) {
			System.out.print(idx+"\t");
		}
		
		System.out.println();
		
		// String 타입의 배열 5 개 생성
		// 과일이름 초기화
		
		String fruit[] = {"사과", "포도", "수박", "딸기", "복숭아"};
//		for (int i = 0; i < fruit.length; i++) {
//			System.out.print(fruit[i]+" ");
//		}
		
		//향상된 for문
		for (String f:fruit) {
			System.out.print(f+" ");
		}
	}
}
