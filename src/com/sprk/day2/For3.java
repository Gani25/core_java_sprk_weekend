package com.sprk.day2;

import java.util.Scanner;

public class For3 {

	public static void main(String[] args) {
		// WAP to check whether the number is prime number or not
		// start = 2, stop = n-1, gap = 1

		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Number: ");
		n = sc.nextInt();
		boolean isPrime = true; // assumption
		if (n <= 1) {
			System.out.println("Enter only positive numbers from 2");
			isPrime = false;
		} else {

			for (int i = 2; i <= n - 1; i++) {
				if (n % i == 0) {
					// Not prime
					isPrime = false;
					break;
				}
			}
		}
		if (isPrime) {
			System.out.println("Number: " + n + " is a prime number");
		} else {
			System.out.println("Number: " + n + " is not a prime number");

		}
	}

}

// WAP to print list of prime number from
// 1 to n
