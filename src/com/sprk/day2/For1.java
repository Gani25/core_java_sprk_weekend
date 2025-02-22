package com.sprk.day2;

import java.util.Scanner;

public class For1 {

	public static void main(String[] args) {
		// WAP to print first n natural number
		// start = 1, stop = n, gap = 1

		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Number: ");
		n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.println(i);
		}
	}

}
