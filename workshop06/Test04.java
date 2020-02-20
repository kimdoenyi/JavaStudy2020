package workshop06;

public class Test04 {

	public static void main(String[] args) {
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		
		int array[][] = new int[a][b];
		
		if(args.length < 2 || args.length >2) {
			System.out.println("다시 입력하세요");
			return;
		}
			
		if(Integer.parseInt(args[0])<1 || Integer.parseInt(args[0])>5
				&& Integer.parseInt(args[1])<1 || Integer.parseInt(args[1])>5) {
			System.out.println("숫자를 확인하세요");
			return;
		}
		
		for(int i=0; i<array.length; i++) {
			for(int j=0; j<array[i].length; j++) {
				array[i][j] = (int)(Math.random()*5+1);
				System.out.print(array[i][j]+" ");
			}
			System.out.println();
		}
		
		double sum = 0;
		double avg = 0;
		for(int i=0; i<array.length; i++) {
			for(int j=0; j<array[i].length; j++) {
				sum = sum + array[i][j];
			}
			avg = sum / (array[i].length+array.length);
		}
		
		System.out.println("sum="+sum);
		System.out.println("avg="+avg);
		
	}

}
