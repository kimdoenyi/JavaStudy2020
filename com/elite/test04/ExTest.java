package com.elite.test04;
/**
 * 
 * @author admin
 * ����ó�� !!!
 */
public class ExTest {

	public static void main(String[] args) throws InvalidException{
		Calc c = new Calc();
		
		int num = Integer.parseInt(args[0]);
		
		if(num<1 || num>5) {
			throw new InvalidException();
		}
		System.out.println("��� �� : "+c.getSum(num));
	}

}
