package test25;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test42 extends Height{
	
	// cm -> inch로 변환하는 메소드 오버라이딩
	public double getInch(double cm) {
		double in = cm / inch;
		return in;
	}
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		Test42 ts = new Test42();
		
		double cm;
		System.out.print("입력(cm) : ");
		cm = Double.parseDouble(br.readLine());
		
		System.out.println("결과 : "+(int)ts.getInch(cm)+"인치");
		
	}

}
