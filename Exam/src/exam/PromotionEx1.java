package exam;

public class PromotionEx1 {
	public static void main(String[] args) {
		// 변수 선언
		// 정수타입 => byte(1) < short(2) < int(4) < long(8)
		// 실수타입 => float(4) < double(8)
		
		byte byteValue = 10;
		
		// 자동 형변환(Promotion)
		int intValue = byteValue;
		System.out.println(intValue);
		
		intValue = 500;
		long longValue = intValue;
		
		char charValue = 'A';
		char charValue2 = 1;
		
		// 아스키코드 A : 65
		// 아스키코드 a : 97
		
		int charValue3 = charValue+charValue2; // 'A' + 1
		
		System.out.println(charValue3); // 66
		
		// 강제 형변환(casting)
		System.out.println((char)charValue3); // B
		
		
	}
}
