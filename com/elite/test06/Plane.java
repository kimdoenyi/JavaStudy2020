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
		 * 일정 양의 연료 주입, 기존 연료증가됨
		 */
		setFuelSize(getFuelSize()+fuel);
	}
	public void flight(int distance) {
		/*
		 * 일정 거리 만큼 운항, 연료 감소 추상 함수 하위 객체에서 반드시 구현해야 함
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
