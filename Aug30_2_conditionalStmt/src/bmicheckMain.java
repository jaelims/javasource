import java.util.Scanner;

// 고도 비만 : 35 이상
// 중(重)도 비만 (2단계 비만) : 30 - 34.9
// 경도 비만 (1단계 비만) : 25 - 29.9
// 과체중 : 23 - 24.9
// 정상 : 18.5 - 22.9
// 저체중 : 18.5 미만

public class bmicheckMain {
	public static void main(String[] args) throws InterruptedException {
		Scanner k = new Scanner(System.in);

		System.out.print("이름 : ");
		String name = k.next();

		System.out.print("키 : ");
		double height = k.nextDouble();

		if (height >= 3) { 
			height /= 100;
		}

		System.out.print("몸무게 : ");
		double weight = k.nextDouble();

		System.out.println("---------");

		double bmi = weight / (height * height);
		System.out.printf("bmi : %.1f\n", bmi);

		// if (bmi >= 35) {
		//		System.out.printf("%s씨는 고도 비만입니다.\n", name);
		// } else if (bmi >= 30) {
		//		System.out.printf("%s씨는 중도 비만입니다.\n", name);
		// } else if (bmi >= 25) {
		//		System.out.printf("%s씨는 경도 비만입니다.\n", name);
		// } else if (bmi >= 23) {
		//		System.out.printf("%s씨는 과체중입니다.\n", name);
		// } else if (bmi >= 18.5) {
		//		System.out.printf("%s씨는 정상입니다.\n", name);
		// } else {
		//		System.out.printf("%s씨는 저체중입니다.\n", name);
		// }
		String result = "저체중";
		if (bmi >= 35) {
			result = "고도 비만";
		} else if (bmi >= 30) {
			result = "중도 비만";
		} else if (bmi >= 25) {
			result = "경도 비만";
		} else if (bmi >= 23) {
			result = "과체중";
		} else if (bmi >= 18.5) {
			result = "정상";
		}
		System.out.printf("%s씨는 %s입니다.\n", name, result);
		Thread.sleep(5000);
	}
}
