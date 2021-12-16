package lambda;

public class LambdaEx1 {
	public static void main(String[] args) {
		// �������̽��� �͸������� ���
//		LambdaTest1 obj1 = new LambdaTest1() {
//			@Override
//			public void method1() {
//				System.out.println("�Լ��� �������̽�");
//				int i = 10;
//				System.out.println(i * i);
//			}
//		};
//		obj1.method1();
		
		
		LambdaTest1 obj = () -> System.out.println("�Լ��� �������̽�");
		obj.method1();
		
		obj = () -> {
			int i = 10;
			System.out.println(i * i);
		};
		obj.method1();
	}
}
