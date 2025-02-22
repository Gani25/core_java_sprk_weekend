package com.sprk.day2;

import java.util.Scanner;

public class While5 {

	public static void main(String[] args) {
		// WAP to print factorial of n
		// n = 6-> 6 * 5 * 4 * 3 * 2 * 1 = 720
		int n, i;
		long fact = 1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		n = sc.nextInt();
		i = n;

		while (i >= 1) {
			fact = fact * i;
			i--;
		}

		System.out.println("The factorial of " + n + " is " + fact);
	}

}




