package com.elite.test02;

public class Student extends Human{
	private String number;
	private String major;
	
	public Student() {
		super();
	}

	public Student(String name, int age, int height, int weight, String number, String major) {
		super(name, age, height,weight);
		this.number = number;
		this.major = major;
	}
	// Student 정보를 리턴
	@Override
	public String printInformation() {
		return super.printInformation()+"\t"+number+"\t"+major;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}
	
	
}
