package 자바문제3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex4 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int []month={31,28,31,30,31,30,31,31,30,31,30,31};
		
		System.out.print("원하는 month를 입력하시오 : ");
		int m = Integer.parseInt(br.readLine());
		
		for(int i=0; i<month.length; i++) {
			if(m == i+1) {
				System.out.println(m+"월은 "+month[i]+"일입니다.");
			}
			
		}

		
	}

}
