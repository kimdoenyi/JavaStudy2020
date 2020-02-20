package work3;

import java.util.ArrayList;

public class StudentTest {

	public static void main(String[] args) {
		Student st = new Student("민들래", 15, 170, 55);
		Student st1 = new Student("진달래", 22, 165, 53);
		Student st2 = new Student("개나리", 20, 155, 46);
		
		
		System.out.println("이름"+"\t"+"나이"+"\t"+"신장"+"\t"+"몸무게"+"\t");
		System.out.println("----------------------------");
		
		// 민들래 객체 출력
		StudentView sv = new StudentView();
		sv.viewStudent(st);
		System.out.println();
//		sv.viewStudent(st1);
//		sv.viewStudent(st2);

		ArrayList<Student> al = new ArrayList<>();
		al.add(st);
		al.add(st1);
		al.add(st2);
		sv.viewStudentList(al);
		
	}

}
