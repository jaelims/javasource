import java.util.Scanner;

// �߰���� : 
// �⸻��� :
// --------
// ��� : 
// ����� �Ҽ��� ���ڸ���
public class CSMain2 {
	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);
		System.out.print("�߰���� : ");
		int mid = k.nextInt();
		System.out.print("�⸻��� : ");
		int _final = k.nextInt();
		System.out.println("---------");
		double aver = (mid + _final) / 2.0;
		System.out.printf("��� : %.1f\n", aver);

		// System.out.println((aver >= 90) ? "��" : "��!");
		// ����� 90�� �̻��̸� ����� ���, �ƴϸ� ��!��� ���
		// ��!�� ������, 80�� �̻��̸� �������� ���ض�

		// ���� >= 90 : ��
		// 80 <= ���� < 90 : ��
		// 70 <= ���� < 80 : ��
		// 60 <= ���� < 70 : ��
		// ���� < 60 : ��

		if (aver >= 90) {
			System.out.println("��");
		} else if (aver >= 80) {
			System.out.println("��");
		} else if (aver >= 70) {
			System.out.println("��");
		} else if (aver >= 60) {
			System.out.println("��");
		} else {
			System.out.println("��");
		}
	}
}
