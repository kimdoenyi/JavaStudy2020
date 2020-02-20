package student;

public class Test05 {

	public static void main(String[] args) {
		Student s = new Student("Kim", 100, 90, 95, 89);
		Student s2 = new Student("Lee", 60, 70, 99, 98);
		Student s3 = new Student("Park", 68, 86, 60, 40);
		
		System.out.println(s.getName()+" Æò±Õ: "+s.getAvg()+" ÇÐÁ¡: "+s.getGrade());
		System.out.println(s2.getName()+" Æò±Õ: "+s2.getAvg()+" ÇÐÁ¡: "+s2.getGrade());
		System.out.println(s3.getName()+" Æò±Õ: "+s3.getAvg()+" ÇÐÁ¡: "+s3.getGrade());
	}

}
