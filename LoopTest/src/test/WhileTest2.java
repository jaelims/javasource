package test;

public class WhileTest2 {
	public static void main(String[] args) {
		//1~100까지 합
//		sum = 0;
//		for(int i=1;i<101;i++) {
//			sum = sum+i;
//		}
//		System.out.println("1 ~ 100 까지 합 "+sum);
		
		
		int sum=0, i=1;
		while(i<101) {
			sum = sum+i;
			i++;
		}
		System.out.println("1 ~ 100 까지 합 "+sum);
		
		System.out.println();
		
		
//		for(int i=1;i<10;i++) {
//			//System.out.println("2 * "+i+" = "+(2*i));
//			System.out.printf("2 * %d = %d\t",i,(2*i));
//		}		
	
		
		i = 1;
		while(i<10) {
			System.out.printf("2 * %d = %d\t",i,(2*i));
			i++;
		}	
		
	}
}








