import java.util.Scanner;

// 중간고사 : 
// 기말고사 :
// --------
// 평균 : 
// 평균은 소수점 한자리만
public class CSMain2 {
	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);
		System.out.print("중간고사 : ");
		int mid = k.nextInt();
		System.out.print("기말고사 : ");
		int _final = k.nextInt();
		System.out.println("---------");
		double aver = (mid + _final) / 2.0;
		System.out.printf("평균 : %.1f\n", aver);

		// System.out.println((aver >= 90) ? "수" : "야!");
		// 평균이 90점 이상이면 수라고 출력, 아니면 야!라고 출력
		// 야!는 했지만, 80점 이상이면 다음에는 잘해라

		// 점수 >= 90 : 수
		// 80 <= 점수 < 90 : 우
		// 70 <= 점수 < 80 : 미
		// 60 <= 점수 < 70 : 양
		// 점수 < 60 : 가

		if (aver >= 90) {
			System.out.println("수");
		} else if (aver >= 80) {
			System.out.println("우");
		} else if (aver >= 70) {
			System.out.println("미");
		} else if (aver >= 60) {
			System.out.println("양");
		} else {
			System.out.println("가");
		}
	}
}
