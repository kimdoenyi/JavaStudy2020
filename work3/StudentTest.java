package work3;

import java.util.ArrayList;

public class StudentTest {

	public static void main(String[] args) {
		Student st = new Student("�ε鷡", 15, 170, 55);
		Student st1 = new Student("���޷�", 22, 165, 53);
		Student st2 = new Student("������", 20, 155, 46);
		
		
		System.out.println("�̸�"+"\t"+"����"+"\t"+"����"+"\t"+"������"+"\t");
		System.out.println("----------------------------");
		
		// �ε鷡 ��ü ���
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
