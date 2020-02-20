package com.car;

public class L3 extends Car implements Temp{
	public L3() {
		super();
	}
	public L3(String name, String engine, int oilTank, int oilSize, int distance) {
		super(name, engine, oilTank, oilSize, distance);
	}
	// 10주행시 주유량 1 감소
	@Override
	public void go(int distance) {
		setDistance(distance);
		setOilSize(getOilSize()-(distance/10));
	}
	// Oil 충전
	@Override
	public void setOil(int oilSize) {
		setOilSize(getOilSize()+oilSize);
	}
	// 엔진온도측정
	@Override
	public int getTempGage() {
		// 10주행시 엔진온도 1증가
		int temp = super.getTempGage()+(getDistance()/10);
		return temp;
	}
	
}
