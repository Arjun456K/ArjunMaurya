package com.ritroorkee;

public class Main {
	public static void main(String[] args) {
		//2+3-4+(5*6)
		Calculator cal=new Calculator();
		int res=cal.add(2, 3);
		System.out.println(res);
		res=cal.substract(res, 4);
		System.out.println(res);
		 res=cal.multiply(5, 6);
		System.out.println(res);
		
		//4*7-8+9-2+21
		int m1=cal.multiply(4, 7);
		System.out.println(m1);
		m1=cal.substract(m1, 8);
		System.out.println(m1);
		m1=cal.add(m1, 9);
		System.out.println(m1);
		m1=cal.substract(m1, 2);
		System.out.println(m1);
		m1=cal.add(m1,21);
		System.out.println(m1);
		//3+4+5+8-7-2-1
		int m2=cal.add(3, 4);
		System.out.println(m2);
		m2=cal.add(5, 8);
		System.out.println(m2);
		m2=cal.substract(7, 2);
		System.out.println(m2);
		m2=cal.substract(m2, 1);
		System.out.println(m2);
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	

}
