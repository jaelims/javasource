import java.util.Scanner;

public class ConsoleInputMain {
	public static void main(String[] args) {
		// 키보드 입력받을 준비해서 k에 저장함
		Scanner k = new Scanner(System.in);

		System.out.print("식당 이름 : ");
		String name = k.next(); // 콘솔에 입력한 정보를 name에 저장

		System.out.print("식당 크기 : ");
		double size = k.nextDouble();
		
		System.out.print("테이블 수 : ");
		int table = k.nextInt();
		
		System.out.print("영업중인가 : ");
		boolean isOpen = k.nextBoolean();
		
		k.close();
		
		System.out.println("********");
		System.out.println(name);
		System.out.println(size);
		System.out.println(table);
		System.out.println(isOpen);
		System.out.println("********");
		
	}
}
