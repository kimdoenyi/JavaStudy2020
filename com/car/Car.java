package com.car;

public abstract class Car implements Temp{
	private String name;
	private String engine;
	private int oilTank;	// 주유 가능 사이즈
	private int oilSize;	// 현재 주유된 oil 양
	private int distance = 0;	// 주행 거리
	
	public Car() {
		super();
	}

	public Car(String name, String engine, int oilTank, int oilSize, int distance) {
		super();
		this.name = name;
		this.engine = engine;
		this.oilTank = oilTank;
		this.oilSize = oilSize;
		this.distance = distance;
	}
	
	public void go(int distance) {
		this.distance = distance;
	}
	public void setOil(int oilSize) {
		this.oilSize = oilSize;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEngine() {
		return engine;
	}

	public void setEngine(String engine) {
		this.engine = engine;
	}

	public int getOilTank() {
		return oilTank;
	}

	public void setOilTank(int oilTank) {
		this.oilTank = oilTank;
	}

	public int getOilSize() {
		return oilSize;
	}

	public void setOilSize(int oilSize) {
		this.oilSize = oilSize;
	}

	public int getDistance() {
		return distance;
	}

	public void setDistance(int distance) {
		this.distance = distance;
	}
	@Override
	public int getTempGage() {
		return 0;
	}

	
	
}
