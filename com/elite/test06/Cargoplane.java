package com.elite.test06;

public class Cargoplane extends Plane{

	public Cargoplane() {
		super();
	}
	
	public Cargoplane(String planName, int fuelSize) {
		super(planName, fuelSize);
	}
	
	public void flight(int distance) {
		setFuelSize(getFuelSize()-distance*5);
	}
}
