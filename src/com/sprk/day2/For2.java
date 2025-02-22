package com.sprk.day2;

import java.util.Scanner;

public class For2 {

	public static void main(String[] args) {
		// WAP to print even number from 1 to n
		// start = 2, stop = n, gap = 2

		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Number: ");
		n = sc.nextInt();

		// i = i + 2 -> i += 2
		for (int i = 2; i <= n; i += 2) {
			System.out.println(i);
		}
	}

}
