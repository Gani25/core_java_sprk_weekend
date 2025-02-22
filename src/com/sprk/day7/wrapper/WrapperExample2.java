package com.sprk.day7.wrapper;

//Unboxing / Auto Unboxing
public class WrapperExample2 {
	
	public static void main(String[] args) {
//		Wrapper to primitive is Unboxing
		
		Integer wrapInt = 125;
		
		// Unboxing
		int primitiveInt = wrapInt.intValue();
		
		System.out.println("Wrap int: "+wrapInt);
		System.out.println("Primitive int with Unboxing: "+primitiveInt);
	
		// Auto Unboxing
		int primitiveAutoInt = wrapInt;
		System.out.println("Primitive int with Auto Unboxing: "+primitiveAutoInt);
	}

}
