package lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class forEachEx2 {
	public static void main(String[] args) {
		List<Student> stuList = new ArrayList<Student>();
		stuList.add(new Student("ȫ�浿", 40));
		stuList.add(new Student("��浿", 90));
		stuList.add(new Student("�ڱ浿", 50));
		stuList.add(new Student("�̱浿", 80));
		
		for(Student student : stuList) {
			System.out.println(student.getName() + " : " + student.getJumsu());
		}
		
		stuList.forEach(student -> System.out.println(student.getName() + " : " + student.getJumsu()));
		
	}
}
