package io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Arrays;

public class BufferedReaderEx2 {
	public static void main(String[] args) {
		// BufferedInputStreamEx5 파일을 읽어서 화면에 줄번호와 함께 출력
		// FileReader("src/io/BufferedInputStreamEx5.java")
		try(FileReader fr = new FileReader("src/io/BufferedInputStreamEx5.java");
			BufferedReader br = new BufferedReader(fr)) {
			
//			char cbuf[] = new char[100];
//			int i=1;
//			while (fr.read(cbuf)!=-1) {
//				System.out.println(i+" "+Arrays.toString(cbuf));
//				i++;
//			}
			
			String line = "";
			int i=1;
			while ((line = br.readLine())!=null) {
				System.out.println(i+" "+line);
				i++;
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
