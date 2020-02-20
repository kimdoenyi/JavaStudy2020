package com.elite.test06;

public class PlaneTest {

	public static void main(String[] args) {
		System.out.println("Plane\t\tfuelSize");
		System.out.println("--------------------------");
		
		Airplane ap = new Airplane("L747", 1000);
		System.out.println(ap.getPlaneName()+"\t\t"+ap.getFuelSize());
		
		Cargoplane cp = new Cargoplane("C40", 1000);
		System.out.println(cp.getPlaneName()+"\t\t"+cp.getFuelSize());
		
		ap.flight(100);
		cp.flight(100);
		System.out.println("\n100운항");
		System.out.println("Plane\t\tfuelSize");
		System.out.println("--------------------------");
		System.out.println(ap.getPlaneName()+"\t\t"+ap.getFuelSize());
		System.out.println(cp.getPlaneName()+"\t\t"+cp.getFuelSize());
		
		ap.refuel(200);
		cp.refuel(200);
		System.out.println("\n200주유");
		System.out.println("Plane\t\tfuelSize");
		System.out.println("--------------------------");
		System.out.println(ap.getPlaneName()+"\t\t"+ap.getFuelSize());
		System.out.println(cp.getPlaneName()+"\t\t"+cp.getFuelSize());
	}

}
