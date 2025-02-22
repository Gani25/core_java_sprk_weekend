package com.sprk.day8;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.function.Consumer;

public class LinkedListEx1 {

	public static void main(String[] args) {
		LinkedList<String> fruits = new LinkedList<>();

		fruits.addAll(Arrays.asList("Banana", "Mango", "Litchi", "Orange", "Watermellon"));

		System.out.println("Fruits List: ");

//		Consumer<String> consumer = tempFruit -> {
//			System.out.println("I have "+ tempFruit+" in my refrigerator");
//		};
//		// forEach()
//		fruits.forEach(consumer);

		// forEach()
//		fruits.forEach(tempFruit -> {
//			System.out.println("I have "+ tempFruit+" in my refrigerator");
//		});

		fruits.forEach(tempFruit -> System.out.println("I have " + tempFruit + " in my refrigerator"));

		System.out.println("Remove if()");
		System.out.println(fruits);
//		fruits.removeIf(tempFruit ->{
//			
//			if(tempFruit.contains("o")) 
//				return true;
//			
//			else if(tempFruit.contains("O")) 
//				return true;
//			
//			return false;
//			
//			
//		});

		fruits.removeIf(tempFruit -> tempFruit.toLowerCase().contains("o"));

		System.out.println("After Remove if()");
		System.out.println(fruits);
		
			
		
	}

}
