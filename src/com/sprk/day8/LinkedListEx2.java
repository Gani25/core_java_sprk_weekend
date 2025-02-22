package com.sprk.day8;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.function.Consumer;

public class LinkedListEx2 {

	public static void main(String[] args) {
		LinkedList<String> fruits = new LinkedList<>();

		fruits.addAll(Arrays.asList("Grapes","Banana", "Mango", "Litchi","Apple","Banana","Grapes","Banana", "Orange", "Watermellon"));

		System.out.println("Fruits List: ");

		System.out.println("fruits before sorting: ");
		System.out.println(fruits);
		
		Collections.sort(fruits);
		System.out.println("fruits after sorting: ");
		System.out.println(fruits);
		
		Collections.sort(fruits, Collections.reverseOrder());
		System.out.println("fruits after sorting in DESC: ");
		System.out.println(fruits);
		
		
		
	}

}
