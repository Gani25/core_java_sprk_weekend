package com.sprk.day2;

import java.util.Scanner;

public class Task2 {

	// WAP to check whther the number is palindrome or not
	public static void main(String[] args) {

		int n, reverse = 0, i;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		n = sc.nextInt();
		i = n;
		while (i != 0) {
			int remainder = i % 10;
			reverse = (reverse * 10) + remainder;
			i = i / 10;

		}
		
		if(n == reverse) {
			System.out.println("Number: "+n+" is a palindrome");
		}else {
			System.out.println("Number: "+n+", Reverse: "+reverse+" is not a palindrome");
			
		}

	}

}
