package lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class forEachEx2 {
	public static void main(String[] args) {
		List<Student> stuList = new ArrayList<Student>();
		stuList.add(new Student("홍길동", 40));
		stuList.add(new Student("김길동", 90));
		stuList.add(new Student("박길동", 50));
		stuList.add(new Student("이길동", 80));
		
		for(Student student : stuList) {
			System.out.println(student.getName() + " : " + student.getJumsu());
		}
		
		stuList.forEach(student -> System.out.println(student.getName() + " : " + student.getJumsu()));
		
	}
}
