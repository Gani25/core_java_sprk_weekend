package com.sprk.day4;

public class ArrayEx1 {
	
	public static void main(String[] args) {
		// Array is an object
		// marks of 5 students
		// Declare empty array
		double[] marks = new double[5]; // empty array
		// Initialize empty array
		marks[0]=85.55;
		marks[1]=42.22;
		marks[2]=65.88;
		marks[3]=93.95;
		marks[4]=20.08;
		int len = marks.length;	
		// Loops
		System.out.println("Marks are: ");
		for(int i = 0; i<len;i++) {
			System.out.print(marks[i]+"\t");
		}
	}
}
