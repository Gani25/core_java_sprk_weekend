package com.sprk.day6.compile_poly;

public class Calculator {
	
	void addition(int a, int b) {
		System.out.printf("Addition of 2 integer numbers: %d + %d = %d\n",a,b,(a+b));
	}
	
	void addition(int a, int b, int c) {
		
		System.out.printf("Addition of 3 integer numbers: %d + %d + %d = %d\n", a, b, c,(a+b+c));
	}
	
	void addition(double a, double b) {
		double result = a + b;
		System.out.println("Addition of 2 decimal numbers: "+a + " + "+ b + " = " + result);
	}

}
