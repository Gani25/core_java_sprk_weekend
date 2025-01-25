package com.sprk.day1;

import java.util.Scanner;

public class If3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		WAP to check whther the given year is a leap year or not

		// year
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a year: ");
		int year = sc.nextInt();

		if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
			System.out.printf("Year %d is a leap year\n", year);
		}else {
			System.out.printf("Year %d is not a leap year\n", year);
			
		}

	}

}
