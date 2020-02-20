package com.elite.test05;

import java.util.HashMap;

public class HashMapTest {

	public static void main(String[] args) {
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		double sum=0.0;
		
		// hashmap�� 1~100������ ������ �����ϰ� 10�� ����
		for(int i=0; i<10; i++) { 
			int num = (int)(Math.random()*101+1);
			map.put(i, num);
		}
		
		// hashmap ���
		for(Integer key : map.keySet()) {
			System.out.print(map.get(key)+" ");
		}
		
		for(Integer key : map.keySet()) {
			sum = sum + map.get(key);
		}
		System.out.println();
		System.out.println("�հ� : "+sum);
		System.out.println("��� : "+sum/map.size());
	}

}
