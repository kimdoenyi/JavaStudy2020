package com.car;

public class L5 extends Car implements Temp{
	public L5() {
		super();
	}
	public L5(String name, String engine, int oilTank, int oilSize, int distance) {
		super(name, engine, oilTank, oilSize, distance);
	}
	// 8주행시 주유량 1 감소
	@Override
	public void go(int distance) {
		setDistance(distance);
		setOilSize(getOilSize()-(distance/8));
	}
	// Oil 충전
	@Override
	public void setOil(int oilSize) {
		setOilSize(getOilSize()+oilSize);
	}
	// 엔진온도측정
	@Override
	public int getTempGage() {
		// 5주행시 엔진온도 1증가
		int temp = super.getTempGage()+(getDistance()/5);
		return temp;
	}
	
}
