package �ڹٹ���3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex3 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String item;
		int qty;
		int price;
		
		System.out.print("ǰ���� �Է��Ͻÿ� : ");
		item = br.readLine();
		
		System.out.print("������ �Է��Ͻÿ� : ");
		qty = Integer.parseInt(br.readLine());
		
		System.out.print("�ܰ��� �Է��Ͻÿ� : ");
		price = Integer.parseInt(br.readLine());
		
		compute(item,qty,price);
		
	}
	public static void compute(String item, int qty, int price) {
		System.out.println();
		System.out.println("ǰ�� : "+item);
		System.out.println("�ݾ� : "+(qty*price)+"��");
	}

}
