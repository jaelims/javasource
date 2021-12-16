package test;

public class WhileTest1 {
	public static void main(String[] args) {
//		for(int i=0;i<10;i++) {
//			//반복해야할 작업
//			System.out.println("안녕하세요");
//		}
		
		int i=0;
		while(i<10) {
			//반복해야할 작업
			System.out.println("안녕하세요");
			i++;
		}
		
		System.out.println();
		
		i=1;
		while(i<11) {
			System.out.print(i+"\t");
			i++;
		}

		
		// 0~10까지 짝수만 출력
//		for(int i=0;i<11;i+=2) {
//			System.out.print(i+"\t");
//		}
		System.out.println();
		
		
		i=0;
		while(i<11) {
			System.out.print(i+"\t");
			i+=2;
		}
		
		System.out.println();
		
		// 3 6 9 12... 3 의 배수만 출력
//		for(int i=3;i<100;i+=3) {
//			System.out.print(i+"  ");
//		}
		
		i=3;
		while(i<101) {
			System.out.print(i+"  ");
			i+=3;
		}
		
	}
}












