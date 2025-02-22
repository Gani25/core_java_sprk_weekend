package com.sprk.day2;

import java.util.Scanner;

public class Task1 {

	// WAP to print table of n till x iterations
	public static void main(String[] args) {
		
		int n, x, i = 1, table;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		n = sc.nextInt();
		System.out.println("Enter a number of iterations: ");
		x = sc.nextInt();
		 
		System.out.println("Table of "+ n+ " is:");
		while(i <=x)
		{
			table = n*i;
			System.out.println(n+ " x "+i+" = "+table);
			i++;
			
		}

	}

}
