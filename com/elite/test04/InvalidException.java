package com.elite.test04;

public class InvalidException extends Exception{
	
	private static final long serialVersionUID = 1L;

	public InvalidException() {
		System.out.println("입력값에 오류가 있습니다");
	}
	
}
