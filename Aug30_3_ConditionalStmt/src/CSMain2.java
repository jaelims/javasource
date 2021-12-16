import java.util.Scanner;

public class CSMain2 {
	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);

		System.out.print("중간고사 : ");
		int mid = k.nextInt();
		System.out.print("기말고사 : ");
		int _final = k.nextInt();

		System.out.println("-----");

		double avg = (mid + _final) / 2.0;
		System.out.printf("평균 : %.1f\n", avg);

		// System.out.println((avg >= 90) ? "수" : "야!");
		// 평균이 90점 이상이면 수라고 출력, 아니면 야!라고 출력
		// 야!는 했지만, 80점 이상이면 다음에는 잘해라	
		
		// if (A) {
		//		A 만족시켰으면
		// } else if (B) {
		//		A는 땡, B를 만족시켰으면
		// } else if (C) {
		//		A는 땡, B도 땡, C를 만족시켰으면
		// } ...
		// } else {
		// 		위에 하나도 맞는거 없으면
		// }

		if (avg >= 90) {
			System.out.println("수");
		} else if (avg >= 80) {
			System.out.println("우");
		} else if (avg >= 70) {
			System.out.println("미");
		} else if (avg >= 60) {
			System.out.println("양");
		} else {
			System.out.println("가");
		}

		if (avg >= 90) {
			System.out.println("수");
		} else {
			if (avg >= 80) {
				System.out.println("우");
			} else {
				if (avg >= 70) {
					System.out.println("미");
				}
			}
		}

	}
}
