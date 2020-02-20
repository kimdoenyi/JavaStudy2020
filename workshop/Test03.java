package workshop;

public class Test03 {

	public static void main(String[] args) {
		int[][] arr2 = {
				{ 5, 5, 5, 5, 5},
				{10,10,10,10,10},
				{20,20,20,20,20},
				{30,30,30,30,30}
				};
		
		int sum = 0;
		double avg = 0.0;
		double cnt = 0.0;
		
		for(int i=0; i<arr2.length; i++) {
			for(int j=0; j<arr2[i].length; j++) {
				sum = sum + arr2[i][j];
				++cnt;
			}
		}
		avg = sum / cnt;
		System.out.println("total="+sum);
		System.out.println("average="+avg);
	}

}
