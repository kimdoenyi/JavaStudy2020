package workshop06;

public class Test02 {

	public static void main(String[] args) {
		Calc c = new Calc();
		
		int num = Integer.parseInt(args[0]);
		
		System.out.print("Â¦¼ö : ");
		for(int i=1; i<=num; i++) {
			if(i%2 == 0)
				System.out.print(i+" ");
		}
		System.out.println();
		System.out.println("°á°ú : "+c.calculate(num));
	}

}
