import java.util.Scanner;

// �񸸵� �˻�
//
// �̸� : 
// Ű : 
// ������ : 
// ----------------
// ǥ��ü��: xx.xxkg
// �񸸵� 	: yy.yy%
// zzz���� ��
//
// ǥ��ü�� = (Ű - 100) * 0.9
// �񸸵� = (������/ǥ��ü��) * 100
// �񸸵� 120�ʰ��ϸ� ��, �ƴϸ� ����

public class bimanCheckMain {
	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);
		
		System.out.println("�񸸵� �˻�");

		System.out.print("�̸� : ");
		String name = k.next();
		
		System.out.print("Ű : ");
		double h = k.nextDouble();
		
		System.out.print("������ : ");
		double w = k.nextDouble();
		
		System.out.println("-------------");
		double x = (h - 100) * 0.9;
		System.out.printf("ǥ��ü�� : %.2fkg\n", x);
		
		double y = (w/x) * 100;
		System.out.printf("�񸸵� : %.2f%%\n", y);
		
		String z = (y > 120) ? "��" : "����";
		System.out.printf("%s���� %s\n", name, z);
		
		System.out.println("��������� �ƹ��ų� �Է�");
		String t = k.next();
	}
}
