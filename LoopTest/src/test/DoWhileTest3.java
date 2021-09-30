package test;

import java.util.Scanner;

public class DoWhileTest3 {
	public static void main(String[] args) {
		// 컴퓨터가 1~100 사이의 정수를 임의로 선정
		// 사용자는 컴퓨터가 가지고 있는 숫자가 무엇인지 알아맞추기
		Scanner sc = new Scanner(System.in);
		
		int answer = (int)(Math.random()*100)+1;
		int input = 0;
		do {
			
			System.out.print("예측한 숫자를 입력해 주세요 >>");
			input = sc.nextInt();
			
			if (input < answer) {
				System.out.println("좀 더 큰수를 입력해 주세요");
			} else {
				System.out.println("좀 더 작은수를 입력해 주세요");
			}
		}while(input!=answer);
		System.out.printf("당첨!!! 컴퓨터의 숫자 : %d\n", answer);
	}
}
