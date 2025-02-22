package com.sprk.day2;

import java.util.Scanner;

public class While3 {
	
//	WAP to print first n natural numebrs
	public static void main(String[] args) {
		int i = 1, n; // initialization
		Scanner sc = new Scanner(System.in);
		System.out.println("ENter number: ");
		n = sc.nextInt();
		
		while(i<=n)
		{
			System.out.println(i);
			i++;
		}
	}

}
