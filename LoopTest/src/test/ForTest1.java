package test;

public class ForTest1 {
	public static void main(String[] args) {
		// ;

		// for 실행순서
		// 1. int i = 0;
		// 2. i < 10;
		// 3. 반복해야 할 작업 실행 => System.out.println("안녕하세요");
		// 4. i++ (i = i + 1) => i = 1
		// 5. i < 10;
		// 6. 반복해야 할 작업 실행 => System.out.println("안녕하세요");
		// 7. i++ (i = i + 1) => i = 2
		// 8. i < 10;
		// 9. 반복해야 할 작업 실행 => System.out.println("안녕하세요");
		// 반복...
		// i = 9
		// i < 10;
		// 반복해야 할 작업 실행 => System.out.println("안녕하세요");
		// i = 10
		// i < 10; 조건 불만족 => for 루프를 빠져나감 => for 종료

		for (int i = 0; i < 10; i++) {
			// 반복해야할 작업
			System.out.println("안녕하세요");
		}

		System.out.println();

		// 1 ~ 10까지 출력
		// 1. int i = 1;
		// 2. i < 11;
		// 3. System.out.println(i);
		// 4. i++ => i = 2
		// 5. i < 11;
		// 6. System.out.println(i);
		for (int i = 1; i < 11; i++) {
			System.out.println(i);
		}

		System.out.println();

		// i=i+1; => i++;
		// i=i+2; => i+=2;
		// 0~10까지 짝수만 출력
		for (int i = 0; i < 11; i += 2) {
			System.out.print(i + "\t");
		}

		System.out.println();

		// 3 6 9 12... 3의 배수만 출력
		for (int i = 3; i < 100; i += 3) {
			System.out.print(i + " ");
		}
		System.out.println();

		// 3 6 9 12... 3의 배수만 출력
		for (int i = 1; i < 100; i++) {
			if (i % 3 == 0) {
				System.out.print(i + " ");
			}
		}
		System.out.println();

		// 1~100 까지 정수 중에서 3의 배수만을 더하는 프로그램 작성
		// 단, 9의 배수는 더하지 않기
		int sum = 0;
		for (int i = 1; i < 100; i++) {
			if (i % 3 == 0 && i % 9 != 0) {
				sum += i;
			}
		}
		System.out.println("3의 배수이고 9의 배수는 아닌 합 : " + sum);

		System.out.println();

		//1~100까지 정수 중에서 3의 배수이거나, 5의 배수인 수의 합
		sum = 0;
		for (int i = 1; i < 101; i++) {
			if (i % 3 == 0 || i % 5 == 0) {
				sum += i;
			}
		}
		System.out.println("3의 배수이거나 5의 배수인 수의 합 : " + sum);
	}
}
