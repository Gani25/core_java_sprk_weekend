package com.sprk.day9.streams;

import java.util.Arrays;
import java.util.List;

public class StreamEx3 {

	public static void main(String[] args) {
		List<String> fruits = Arrays.asList("Papaya", "Orange", "Mango", "Banana", "Litchi", "Apple", "Cherry",
				"Pomegranade");

//		// For Loop
//		fruits
//		.stream()
//		.forEach(fruit -> System.out.println(fruit));

		// For Loop
		fruits.stream().forEach(System.out::println);

		// COnvert To String Array
		String[] fruitsArr = fruits.stream().toArray(String[]::new);

		System.out.println(fruitsArr);

		for (String fruit : fruitsArr) {
			System.out.println(fruit);
		}

		// Find Max Length of Fruit name
		System.out.println("Name of Max Length of Fruits: "
				+ fruits.stream().max((f1, f2) -> Integer.compare(f1.length(), f2.length())).get());

		// Find min Length of Fruit name
		System.out.println("Name of Min Length of Fruits: "
				+ fruits.stream().min((f1, f2) -> Integer.compare(f1.length(), f2.length())).get());

		// sort by names
		// Find Max Length of Fruit name
		System.out.println("Sorted Fruits In ASC by Name: "
				+ fruits.stream().sorted((f1, f2) -> f1.compareTo(f2)).toList());
	}

}
