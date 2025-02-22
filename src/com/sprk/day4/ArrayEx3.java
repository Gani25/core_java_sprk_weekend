package com.sprk.day4;

import java.util.Scanner;

public class ArrayEx3 {

	public static void main(String[] args) {
		// Take input in array from user
		// declare empty array
		int[] arr = new int[5];
		int i; 
		Scanner sc = new Scanner(System.in);
		// input
		for(i = 0; i< arr.length;i++)
		{
//			System.out.printf("Please enter element at position %d: ",i);
			
			System.out.println("Please enter element at position "+(i+1)+": ");
			arr[i] = sc.nextInt();
		}

		// Loops
		System.out.println("elements are: ");
		for (i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "\t");
		}
		System.out.println("\nelements in reverse order are: ");
		for (i = arr.length-1; i >=0; i--) {
			System.out.print(arr[i] + "\t");
		}
	}
}
