package afterschool;

public class Exam11 {
	public static void main(String[] args) {
		// 배열 => 힙(new)
		
		// 배열 선언과 생성, 초기화
		int arr[]= {100,25,73,54,65,67,79,81,90,10};
		
		// 사용
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");			
		}
		System.out.println();
		
		
		for(int j:arr) {
			System.out.print(j+" ");			
		}
		
	}
}















