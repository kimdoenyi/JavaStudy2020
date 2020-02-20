package com.elite.test04;

public class Calc {
	
	public double getSum(int data){
		double result = 0;
		
		for(int i=1; i<=data; i++) {
			result = result + i;
		}
		return result;
	}
}
