package com.sprk.day1;

import java.util.Scanner;

public class If2 {
//	CTRL + SHIFT + F -> FORMAT
	public static void main(String[] args) {
		/*
		 * WAP to accept 2 number from user and check greatest between 2 or both are
		 * equal
		 */

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 2 numbers: ");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();

		if (n1 > n2) {
			System.out.printf("n1: %d is greater than n2: %d\n",n1,n2);
		}else if(n1 < n2) {
			System.out.printf("n2: %d is greater than n1: %d\n",n2,n1);
		}else {
			System.out.printf("Both are equal\n");
		}
	}

}
