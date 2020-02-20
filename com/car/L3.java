package com.car;

public class L3 extends Car implements Temp{
	public L3() {
		super();
	}
	public L3(String name, String engine, int oilTank, int oilSize, int distance) {
		super(name, engine, oilTank, oilSize, distance);
	}
	// 10����� ������ 1 ����
	@Override
	public void go(int distance) {
		setDistance(distance);
		setOilSize(getOilSize()-(distance/10));
	}
	// Oil ����
	@Override
	public void setOil(int oilSize) {
		setOilSize(getOilSize()+oilSize);
	}
	// �����µ�����
	@Override
	public int getTempGage() {
		// 10����� �����µ� 1����
		int temp = super.getTempGage()+(getDistance()/10);
		return temp;
	}
	
}
