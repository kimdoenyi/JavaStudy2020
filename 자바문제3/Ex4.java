package �ڹٹ���3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex4 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int []month={31,28,31,30,31,30,31,31,30,31,30,31};
		
		System.out.print("���ϴ� month�� �Է��Ͻÿ� : ");
		int m = Integer.parseInt(br.readLine());
		
		for(int i=0; i<month.length; i++) {
			if(m == i+1) {
				System.out.println(m+"���� "+month[i]+"���Դϴ�.");
			}
			
		}

		
	}

}
