package classTest;

public class TriangleEx3 {
	public static void main(String[] args) {
		//길이가 서로 다른 삼각형 5개를 가지고 있다.
		//넓이 구하기
				
		Triangle3 triArr[] = new Triangle3[5];
		triArr[0] = new Triangle3(5, 18);
		triArr[1] = new Triangle3(10, 17);
		triArr[2] = new Triangle3(15, 16);
		triArr[3] = new Triangle3(20, 15);
		triArr[4] = new Triangle3(25, 14);
		
		triArr(triArr);

	}
	
	static void triArr(Triangle3 triArr[]) {
		//면적 구하기
		for (int i = 0; i < triArr.length; i++) {
			System.out.println("삼각형 면적 : " + triArr[i].getArea());
		}
	}
}
