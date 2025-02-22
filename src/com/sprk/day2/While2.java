package com.sprk.day2;

import java.util.Scanner;

public class While2 {
	
//	WAP to print first n natural numebrs in reverse order
	public static void main(String[] args) {
		int n; 
		Scanner sc = new Scanner(System.in);
		System.out.println("ENter number: ");
		n = sc.nextInt();
		int i = n; // initialization
		
		while(i>=1)
		{
			System.out.println(i);
			i--;
		}
	}

}
