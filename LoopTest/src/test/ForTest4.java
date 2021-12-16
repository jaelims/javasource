package test;

import java.util.Scanner;

public class ForTest4 {
	public static void main(String[] args) {
		// 사용자한테 구구단의 단수를 입력받기
		Scanner sc = new Scanner(System.in);
		System.out.print("구구단 단 수 입력 : ");
		int num = sc.nextInt(); //5, 6,...

		for(int i=1;i<10;i++) {
		//	System.out.println(num+" * "+i+" = "+(num*i));
			System.out.printf("%d * %d = %d\t",num,i,(num*i));
		}
		
	}
}


