package com.sprk.day1;

import java.util.Scanner;

public class If1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

//		WAP to check whether the number is even or odd
//		input: 1, Conditions: 2
//		Divisible by 2 -> Divide num by 2 and remainder is 0

		System.out.println("Enter a number: ");
		int n = sc.nextInt();
		if (n % 2 == 0) {
			System.out.println("Number " + n + " is even");
		}else {
			System.out.println("Number "+n+" is odd");
		}

	}

}
