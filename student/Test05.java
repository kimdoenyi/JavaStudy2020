package student;

public class Test05 {

	public static void main(String[] args) {
		Student s = new Student("Kim", 100, 90, 95, 89);
		Student s2 = new Student("Lee", 60, 70, 99, 98);
		Student s3 = new Student("Park", 68, 86, 60, 40);
		
		System.out.println(s.getName()+" ���: "+s.getAvg()+" ����: "+s.getGrade());
		System.out.println(s2.getName()+" ���: "+s2.getAvg()+" ����: "+s2.getGrade());
		System.out.println(s3.getName()+" ���: "+s3.getAvg()+" ����: "+s3.getGrade());
	}

}
