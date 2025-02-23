package com.sprk.day8.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StreamEx1 {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(50, 2, 41, 1, 20, 3, 9, 27);

		System.out.println("Numbers: " + numbers);

		// Create a List of numbers with only odd numbers from
		// existing list

		List<Integer> oddNums = new ArrayList<>();

		for (int element : numbers) {
			if (element % 2 != 0) {
				// add this elemnt into oddNums
				oddNums.add(element);
			}
		}

		System.out.println("Odd Numbers: " + oddNums);
		System.out.println("\nFilter Operation In Stream:\n");
		List<Integer> oddNumStream = numbers
				.stream()
				.filter(element -> element % 2 != 0)
				.toList();
		System.out.println("Odd Numbers using stream: " + oddNumStream);
		
		// MAP
		System.out.println("\nMAP Operation In Stream:\n");
		
		// Modify existing numbers list and multiply by 2

		List<Integer> mapNumbers = numbers
			.stream()
			.map(element -> (element * 2))
			.toList();
		
		System.out.println(mapNumbers);
		
		// Cube of numbers
		List<Integer> cubeNumbers = numbers
				.stream()
				.map(element -> (int)Math.pow(element, 3))
				.toList();
		
		System.out.println("Cube Numebrs: "+cubeNumbers);
	
				
		
	}

}
