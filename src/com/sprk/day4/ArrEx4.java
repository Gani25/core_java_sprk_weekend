package com.sprk.day4;

import java.util.Arrays;
import java.util.Collections;

public class ArrEx4 {

	public static void main(String[] args) {
		// Sort Given Array ASC

		int[] arr = { 10, 7, 2, -2, -25 };
		int i;
		// Loops
		System.out.println("elements before sorting: ");
		for (i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "\t");
		}

		Arrays.sort(arr);

		System.out.println("\nelements after sorting in ASC: ");
		for (i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "\t");
		}

		// Sort In DESC
		System.out.println("\nelements in desc order: ");
		for (i = arr.length - 1; i >= 0; i--) {
			System.out.print(arr[i] + "\t");
		}
	}
}
