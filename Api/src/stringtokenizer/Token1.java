package stringtokenizer;

import java.util.StringTokenizer;

public class Token1 {
	public static void main(String[] args) {
		String text = "홍길동/성춘향/박연수/이수홍";
		
		String[] names = text.split("/");
		for (String s:names) {
			System.out.println(s);
		}
		System.out.println();
		
		String text1 = "홍길동 성춘향 박연수 이수홍";
		
		names = text1.split(" ");
		for (String s:names) {
			System.out.println(s);
		}
		System.out.println();
		
		
		
		StringTokenizer st = new StringTokenizer(text, "/");
		while (st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
	}
}
