package com.elite.test03;
/**
 * 
 * StringTokenizer ����ϱ�
 */
import java.util.StringTokenizer;

public class StringTest {

	public static void main(String[] args) {
		String str = "1.22,4.12,5.93,8.71,9.34";
		double data []= new double[5];
		double sum = 0;
		
		
		StringTokenizer st = new StringTokenizer(str, ",");
		
		for(int i=0; i<data.length; i++) {
			data[i] = Double.parseDouble(st.nextToken());
		}
		
		for(int i=0; i<data.length; i++) {
			sum = sum + data[i];
		}
		
		System.out.println("�հ� : "+(Math.round(sum*1000)/1000.0));
		System.out.println("��� : "+(Math.round((sum/data.length)*1000)/1000.0));
	}

}
