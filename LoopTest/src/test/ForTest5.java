package test;

public class ForTest5 {
	public static void main(String[] args) {
		// **********
		// **********
		// **********
		// **********
		// **********

		// 이중 for 실행 순서
		// 1. int i=0;
		// 2. i<3;
		// 3. 안쪽 for 문의 int j=0;
		// 4. j<3;
		// 5. System.out.print("*"); *
		// 6. j++ => j=1
		// 7. j<3;
		// 8. System.out.print("*"); **
		// 9. j++ => j=2
		// 10. j<3;
		// 11. System.out.print("*"); ***
		// 12. j++ => j=3
		// 13. j<3; => 안쪽 for 문 종료
		// 14. System.out.println();

		// 15. i++ => i=1
		// 16. i<3;
		// 17. 안쪽 for 문의 int j=0; ~14까지 실행
		// ***
		// ***

		// 18. i++ => i=2
		// 19. i<3;
		// 20. 안쪽 for 문의 int j=0; ~14까지 실행
		// ***
		// ***
		// ***

		// 21. i++ => i=3
		// 22. i<3; => 바깥 for 문 종료

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 10; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
//		for (int j = 1; j <= 1; j++) {
//			System.out.print("*");
//		}
//		System.out.println();
//		for (int j = 1; j <= 2; j++) {
//			System.out.print("*");
//		}
//		System.out.println();
//		for (int j = 1; j <= 3; j++) {
//			System.out.print("*");
//		}
//		System.out.println();
//		for (int j = 1; j <= 4; j++) {
//			System.out.print("*");
//		}
//		System.out.println();
//		for (int j = 1; j <= 5; j++) {
//			System.out.print("*");
//		}
//		System.out.println();
		
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}