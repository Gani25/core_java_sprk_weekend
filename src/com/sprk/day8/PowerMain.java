package com.sprk.day8;

public class PowerMain {
	
	public static void main(String[] args) {
		// We can directly override Functional Interface Method.
//		Power power = (a,b)->{
//			
//			return Math.pow(a, b);
//		};
//		
//		System.out.println(power.calculatePower(5, 3));

		// Whenever we have single line of code
		// we can directly write without braces{}
		// and if its return statement we can skip
		// return keyword by default it will return
		
		Power power = (a,b)-> Math.pow(a, b);

		System.out.println(power.calculatePower(5, 3));
		
	}

}
