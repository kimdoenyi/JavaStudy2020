package com.car;

public class CarTest {

	public static void main(String[] args) {
		Car t[] = new Car[2];
		t[0] = new L3("L3", "1500", 50, 25, 0);
		t[1] = new L5("L5", "2000", 70, 35, 0);
	
		System.out.println("vehicleName\tengineSize\toilTank\t\toilSize\t\tdistance\ttemprature");
		System.out.println("-------------------------------------------------------------------------------------------------");
		
		for(int i=0; i<t.length; i++) {
			System.out.println(t[i].getName()+"\t\t"+t[i].getEngine()+"\t\t"+t[i].getOilTank()+"\t\t"
								+t[i].getOilSize()+"\t\t"+t[i].getDistance()+"\t\t"+t[i].getTempGage());
			
		}

		System.out.println("\n25주유");
		System.out.println("vehicleName\tengineSize\toilTank\t\toilSize\t\tdistance\ttemprature");
		System.out.println("-------------------------------------------------------------------------------------------------");
		t[0].setOil(25); t[1].setOil(25);
		for(int i=0; i<t.length; i++) {
			System.out.println(t[i].getName()+"\t\t"+t[i].getEngine()+"\t\t"+t[i].getOilTank()+"\t\t"
								+t[i].getOilSize()+"\t\t"+t[i].getDistance()+"\t\t"+t[i].getTempGage());
			
		}
		
		System.out.println("\n80주행");
		System.out.println("vehicleName\tengineSize\toilTank\t\toilSize\t\tdistance\ttemprature");
		System.out.println("-------------------------------------------------------------------------------------------------");
		t[0].go(80); t[1].go(80);
		for(int i=0; i<t.length; i++) {
			System.out.println(t[i].getName()+"\t\t"+t[i].getEngine()+"\t\t"+t[i].getOilTank()+"\t\t"
								+t[i].getOilSize()+"\t\t"+t[i].getDistance()+"\t\t"+t[i].getTempGage());
			
		}
		
	}

}
