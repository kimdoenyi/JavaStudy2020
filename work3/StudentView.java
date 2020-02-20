package work3;

import java.util.ArrayList;

public class StudentView {
	
	public void viewStudent(Student st) {
		System.out.println(st.getName()+"\t"+st.getAge()+"\t"+st.getHeight()+
				"\t"+st.getWeight());
	}
	
	public void viewStudentList(ArrayList<Student> list) {
		for(Student s : list)
			System.out.println(s.getName()+"\t"+s.getAge()+"\t"+s.getHeight()+
					"\t"+s.getWeight());
	}
}
