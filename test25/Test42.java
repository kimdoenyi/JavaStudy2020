package test25;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test42 extends Height{
	
	// cm -> inch�� ��ȯ�ϴ� �޼ҵ� �������̵�
	public double getInch(double cm) {
		double in = cm / inch;
		return in;
	}
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		Test42 ts = new Test42();
		
		double cm;
		System.out.print("�Է�(cm) : ");
		cm = Double.parseDouble(br.readLine());
		
		System.out.println("��� : "+(int)ts.getInch(cm)+"��ġ");
		
	}

}
