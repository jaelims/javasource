package afterschool;

import java.util.Scanner;

public class Exam10 {
	public static void main(String[] args) {
		//int 타입을 5개 저장하는 배열 생성
		int arr[]=new int[5];
		
		//배열의 초기화를 위해 사용자로부터 입력 받기
		Scanner sc = new Scanner(System.in);
		
		System.out.println("5명의 점수를 입력하세요");
		
//		System.out.print("첫번째 점수 입력 ");
//		arr[0] = sc.nextInt();
//		
//		
//		System.out.print("두번째 점수 입력 ");
//		arr[1] = sc.nextInt();
//		
//		
//		System.out.print("다섯번째 점수 입력 ");
//		arr[4] = sc.nextInt();
		//int sum = arr[0]+arr[1]+arr[2]+arr[3]+arr[4];
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			System.out.print((i+1)+"번째 점수 입력 ");
			arr[i] = sc.nextInt();
			sum+=arr[i];
			
		}		
		
		System.out.println();
		
		//입력받은 값 출력
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");			
		}	
		
		System.out.printf("전체 합 : %d, 평균 : %.1f",sum,(double)sum/arr.length);
		
	}
}













