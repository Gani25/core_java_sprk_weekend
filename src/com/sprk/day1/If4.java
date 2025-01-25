package com.sprk.day1;

import java.util.Scanner;

public class If4 {

	public static void main(String[] args) {
//		WAP to check whther the triangle is 
//		equilateral or iscoceles or scalene

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter 3 sides: ");
		int s1 = sc.nextInt();
		int s2 = sc.nextInt();
		int s3 = sc.nextInt();

		if (s1 > 0 && s2 > 0 && s3 > 0) {
			// checkl for equi, iso, scalene
			if (s1 == s2 && s2 == s3) {
				System.out.println("Equilateral triangle");
			} else if (s1 == s2 || s2 == s3 || s1 == s3) {
				System.out.println("Isoceles triangle");

			} else {

				System.out.println("Scalene triangle");
			}
		}else {
			System.out.println("Invalid Triangle");
		}

	}

}
