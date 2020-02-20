package com.elite.test06;

public abstract class Plane {
	
	private String planeName;
	private int fuelSize;
	
	public Plane() {
		super();
	}

	public Plane(String planeName, int fuelSize) {
		super();
		this.planeName = planeName;
		this.fuelSize = fuelSize;
	}
	
	public void refuel(int fuel){
		/*
		 * ���� ���� ���� ����, ���� ����������
		 */
		setFuelSize(getFuelSize()+fuel);
	}
	public void flight(int distance) {
		/*
		 * ���� �Ÿ� ��ŭ ����, ���� ���� �߻� �Լ� ���� ��ü���� �ݵ�� �����ؾ� ��
		 */
	}

	public String getPlaneName() {
		return planeName;
	}

	public void setPlaneName(String planeName) {
		this.planeName = planeName;
	}

	public int getFuelSize() {
		return fuelSize;
	}

	public void setFuelSize(int fuelSize) {
		this.fuelSize = fuelSize;
	}
	
}
