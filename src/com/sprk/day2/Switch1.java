package com.sprk.day2;

import java.util.Scanner;

public class Switch1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// print day name by taking input of day number from user
//		Wrod Wrapping -> alt + shift + Y
		
		int dayNumber ; 
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter day number [1 - 7]: ");
		dayNumber = sc.nextInt();
		
		switch(dayNumber) {
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
			
		case 3:
			System.out.println("Wednesday");
			break;
		case 4:
			System.out.println("Thursday");
			break;
		case 5:
			System.out.println("Friday");
			break;
		case 6:
			System.out.println("Saturday");
			break;
		case 7:
			System.out.println("Sunday");
			break;
		default:
			System.out.println("Please enter number in range 1 to 7");
				
		}
	}

}
