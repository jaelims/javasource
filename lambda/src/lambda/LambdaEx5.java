package lambda;

public class LambdaEx5 {
	
	// �Ű������� �����ϴ� ���ٽ�
	public static void execute(LambdaTest5 lambda) {
		lambda.run();		
	}
	
	// ��ȯ ������ ���̴� ���ٽ�
	public static LambdaTest5 getRun() {
		LambdaTest5 obj1 = () -> System.out.println("�Լ��� �������̽� ����");
		return obj1;
	}
	
	public static void main(String[] args) {
		// ���ٽ�
		LambdaTest5 lambda = () -> System.out.println("Lambda!!!! run");
		lambda.run();
		
		System.out.println("----------------");
		execute(getRun());
		System.out.println("----------------");
	}
}
