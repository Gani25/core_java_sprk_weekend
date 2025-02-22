package com.sprk.day7.wrapper;

public class WrapperExample {
	
	public static void main(String[] args) {
		int primitiveNum =  55;
		
		// I want to wrap int to Integer Object
		// Boxing : Convert primitive to Wrapper Class Object
		
		Integer wrapInt = Integer.valueOf(primitiveNum);
		
		System.out.println("primitive type: "+primitiveNum);
		System.out.println("Wrap with boxing: "+wrapInt);
		
		// Auto Boxing : Automatically Convert primitive to Wrapper Class Object
		
		Integer wrapAutoInt = primitiveNum;
		System.out.println("Wrap with auto boxing: "+wrapAutoInt);
		
		
	}

}
