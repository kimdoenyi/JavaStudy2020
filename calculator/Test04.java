package calculator;

public class Test04 {

	public static void main(String[] args) {
		
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int c = Integer.parseInt(args[2]);
		int d = Integer.parseInt(args[3]);
		
		Calc ca = new Calc();
		
		
		double avg = ca.calcSum(a, b, c, d) / 4.0;
		char grade;
		
		if(avg>=90 && avg<=100)
			grade = 'A';
		else if(avg>=70 && avg<90)
			grade = 'B';
		else if(avg>=50 && avg<70)
			grade = 'C';
		else if(avg>=30 && avg<50)
			grade = 'D';
		else
			grade = 'F';
		
		System.out.println("Sum:"+ca.calcSum(a,b,c,d));
		System.out.println("Avg:"+avg);
		System.out.println(grade+"ÇÐÁ¡");
		
	}

}
