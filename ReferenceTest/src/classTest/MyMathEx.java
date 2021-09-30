package classTest;

public class MyMathEx {
	public static void main(String[] args) {
		// static 메소드(클래스 메소드) 호출 => 객체 생성 없이 호출
		System.out.println(MyMath.add(200l, 100l));
		System.out.println(MyMath.subtract(200l, 100l));
		System.out.println(MyMath.multiply(200l, 100l));
		System.out.println(MyMath.divide(200.0, 100.0));
		
		System.out.println();
		
		// 멤버 메소드 호출
		MyMath math = new MyMath();
		
		math.x = 200l;
		math.y = 100l;
		
		System.out.println(math.add());
		System.out.println(math.subtract());
		System.out.println(math.multiply());
		System.out.println(math.divide());
			
		
		
	}
}
