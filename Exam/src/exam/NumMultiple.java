package exam;

public class NumMultiple {

	public static void main(String[] args) {
		// 변수 num의 값보다 크면서도 가장 가까운 10의 배수에서 변수 num
		// 의 값을 뺀 나머지를 구하시오
		// ex) num 이 24라면 크면서도 가장 가까운 10의 배수는 30 임
		int num = 81;
		System.out.println((num / 10 + 1) * 10 - num);

	}

}
