import java.util.Scanner;

// ��κ� 2�׿���
//		a > 2
//		1 + 2
//
//	1��(����) ����
//		!d

// 3�׿���
//		���ǽ� ? 0���� : x����

public class OperatorMain {
	public static void main(String[] args) {

	Scanner k = new Scanner(System.in);

	System.out.print("�̸� : ");
	String name = k.next();
	
	System.out.print("���� : ");
	int age = k.nextInt();
	
	// �̸��� ȫ�浿�̸� ��? ��!!!, �ƴϸ� �������
	// �����ڶ�°͵��� stack������ ���
	// String say2 = (name == "ȫ�浿") ? "��? ��!!!" : "�������";
	String say2 = (name.equals("ȫ�浿")) ? "��? ��!!!" : "�������";
	System.out.println(say2);
	
	// 20�� �̻��̸� �ȳ��ϼ���, �ƴϸ� ����
	String say = (age >= 20) ? "�ȳ��ϼ���" : "����";
	System.out.println(say);
	
	// ���̰� ¦���� ¦, Ȧ���� Ȧ
	String oe = (age % 2 == 0) ? "¦" : "Ȧ";
	System.out.println(oe);
	
	}
}
