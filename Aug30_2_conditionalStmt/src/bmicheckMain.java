import java.util.Scanner;

// �� �� : 35 �̻�
// ��(��)�� �� (2�ܰ� ��) : 30 - 34.9
// �浵 �� (1�ܰ� ��) : 25 - 29.9
// ��ü�� : 23 - 24.9
// ���� : 18.5 - 22.9
// ��ü�� : 18.5 �̸�

public class bmicheckMain {
	public static void main(String[] args) throws InterruptedException {
		Scanner k = new Scanner(System.in);

		System.out.print("�̸� : ");
		String name = k.next();

		System.out.print("Ű : ");
		double height = k.nextDouble();

		if (height >= 3) { 
			height /= 100;
		}

		System.out.print("������ : ");
		double weight = k.nextDouble();

		System.out.println("---------");

		double bmi = weight / (height * height);
		System.out.printf("bmi : %.1f\n", bmi);

		// if (bmi >= 35) {
		//		System.out.printf("%s���� �� ���Դϴ�.\n", name);
		// } else if (bmi >= 30) {
		//		System.out.printf("%s���� �ߵ� ���Դϴ�.\n", name);
		// } else if (bmi >= 25) {
		//		System.out.printf("%s���� �浵 ���Դϴ�.\n", name);
		// } else if (bmi >= 23) {
		//		System.out.printf("%s���� ��ü���Դϴ�.\n", name);
		// } else if (bmi >= 18.5) {
		//		System.out.printf("%s���� �����Դϴ�.\n", name);
		// } else {
		//		System.out.printf("%s���� ��ü���Դϴ�.\n", name);
		// }
		String result = "��ü��";
		if (bmi >= 35) {
			result = "�� ��";
		} else if (bmi >= 30) {
			result = "�ߵ� ��";
		} else if (bmi >= 25) {
			result = "�浵 ��";
		} else if (bmi >= 23) {
			result = "��ü��";
		} else if (bmi >= 18.5) {
			result = "����";
		}
		System.out.printf("%s���� %s�Դϴ�.\n", name, result);
		Thread.sleep(5000);
	}
}
