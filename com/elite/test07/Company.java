package com.elite.test07;

import java.util.*;


public class Company {

	public static void main(String[] args) {
		HashMap<Integer, Employee> map = new HashMap<Integer, Employee>();
		
		Secretary sc = new Secretary("Hilery", 1, "secretary", 800);
		Sales s = new Sales("Clinten", 2, "sales", 1200);
		// 해시맵에 객체 추가
		map.put(1, sc);
		map.put(2, s);
		
		System.out.println("name\tdepartment\tsalary");
		System.out.println("----------------------------------");
		System.out.println();
		
		Set<Integer> keySet = map.keySet();
		Iterator<Integer> keyIterator = keySet.iterator();
		while(keyIterator.hasNext()) {
			Integer key = keyIterator.next();
			Employee value = map.get(key);
			System.out.println(value.getName()+"\t"+value.getDepartment()+"\t\t"+value.getSalary());
								
		}
		System.out.println();
		System.out.println("인센티브 100 지급");
		// 인센티브 100씩 지금
		sc.incentive(100);
		s.incentive(100);
		System.out.println("name\tdepartment\tsalary\ttax");
		System.out.println("----------------------------------");
		Set<Integer> keySet1 = map.keySet();
		Iterator<Integer> keyIterator1 = keySet1.iterator();
		while(keyIterator1.hasNext()) {
			Integer key = keyIterator1.next();
			Employee value = map.get(key);
			System.out.println(value.getName()+"\t"+value.getDepartment()+"\t"
							+value.getSalary()+"\t"+value.tax());
								
		}
		
	}

}
