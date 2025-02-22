package com.sprk.day2;

import java.util.Scanner;

public class While4 {

	public static void main(String[] args) {
		// WAP to print sum of digit of n
		// n = 184
		// sum = 4 + 8 + 1 = 13
		
		int sum = 0, n;
		Scanner sc = new  Scanner(System.in);
		System.out.println("Enter a number: ");
		n = sc.nextInt();
		int i = n;
		
		while(i != 0)
		{
			int remainder = i % 10;
			sum = sum + remainder;
			i = i / 10;
		}
		System.out.println("The sum of digit of "+n+ " is: "+sum);
			
	}

}
