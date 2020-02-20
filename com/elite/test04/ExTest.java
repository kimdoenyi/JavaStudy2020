package com.elite.test04;
/**
 * 
 * @author admin
 * 오류처리 !!!
 */
public class ExTest {

	public static void main(String[] args) throws InvalidException{
		Calc c = new Calc();
		
		int num = Integer.parseInt(args[0]);
		
		if(num<1 || num>5) {
			throw new InvalidException();
		}
		System.out.println("결과 값 : "+c.getSum(num));
	}

}
