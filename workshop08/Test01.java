package workshop08;

public class Test01 {

	public static void main(String[] args) {
		
		try {
			double a = Double.parseDouble(args[0]);
			double b = Double.parseDouble(args[1]);
			double c = Double.parseDouble(args[2]);
			double d = Double.parseDouble(args[3]);
			double e = Double.parseDouble(args[4]);
			
			for(int i=0; i<args.length; i++) {
				if(Double.parseDouble(args[i]) < 10 || Double.parseDouble(args[i]) > 99) {
					System.out.println("다시 입력하세요");
					System.exit(0);
				}
					
			}
			
			double res = ((a+b)/2)*0.6+((c+d)/2)*0.2+e*0.2;
			System.out.println("평가점수 : "+res+"점");
			switch((int)res/10) {
			case 10 :
			case 9 :
				System.out.println("Class : Gold Class");
				break;
			case 8 :
				System.out.println("Class : Silver Class");
				break;
			case 7:
				System.out.println("Class : Bronze Class");
				break;
				default :
					System.out.println("Class : Normal Class");
					break;
			}
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("다시 입력하세요");
			}
		} 
		
}


