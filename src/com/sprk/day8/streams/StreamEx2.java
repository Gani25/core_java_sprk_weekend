package com.sprk.day8.streams;

import java.util.Arrays;
import java.util.List;

public class StreamEx2 {
//	COmbine Map and Filter

	public static void main(String[] args) {
		List<Integer> marks = Arrays.asList(50, 25, 33, 65, 80, 29, 34, 31);

		// Find Faild Student Marks List

		System.out.println("All Marks:\n" + marks);
		System.out.println("\nFailed Marks:\n" + marks.stream().filter(mark -> mark <= 35).toList());

		// Add Grace Marks of 5 to all failed students

		System.out.println("\nAfter Adding Grace Marks:\n"
				+ marks.stream().filter(mark -> mark <= 35).map(mark -> mark + 5).toList());
		
		// After adding grace marks count the number of failed students
		
		System.out.println("\nNumber of failed student after adding grace marks is: "+
				marks
				.stream()
				.filter(mark -> mark <= 35)
				.map(mark -> mark + 5)
				.filter(mark -> mark <=35)
				.count()
				);
		
	
	}

}
