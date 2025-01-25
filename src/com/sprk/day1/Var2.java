package com.sprk.day1;

import java.util.Scanner;

public class Var2 {
	
//	input
	public static void main(String[] args) {
		int age; // variable declaration
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your age: ");
		age = sc.nextInt();
	
		
		sc.nextLine();
		String name; // declaration
		System.out.println("Enter your name: ");
		name = sc.nextLine();
		
		
		
		System.out.println("Name: "+name);
		System.out.println("Your age is: "+age);
		
	}

}
