package com.car;

public class L5 extends Car implements Temp{
	public L5() {
		super();
	}
	public L5(String name, String engine, int oilTank, int oilSize, int distance) {
		super(name, engine, oilTank, oilSize, distance);
	}
	// 8����� ������ 1 ����
	@Override
	public void go(int distance) {
		setDistance(distance);
		setOilSize(getOilSize()-(distance/8));
	}
	// Oil ����
	@Override
	public void setOil(int oilSize) {
		setOilSize(getOilSize()+oilSize);
	}
	// �����µ�����
	@Override
	public int getTempGage() {
		// 5����� �����µ� 1����
		int temp = super.getTempGage()+(getDistance()/5);
		return temp;
	}
	
}
