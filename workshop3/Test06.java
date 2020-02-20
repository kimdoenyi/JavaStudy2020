package workshop3;

public class Test06 {

	public static void main(String[] args) {
		
		int num = Integer.parseInt(args[0]);
		int res = 0;
		
		for(int i=num; i<=100; i++) {
			if(i % num == 0) {
				res = res + i;
//				System.out.println(i);
				System.out.print(i);
				if(i == 100)
					break;
				System.out.print("+");
			}
			
		}
		System.out.println("="+res);
	}

}
