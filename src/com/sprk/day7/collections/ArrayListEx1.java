package com.sprk.day7.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListEx1 {
	
	public static void main(String[] args) {
		
		List<Integer> numbers = new ArrayList<>();
		
		System.out.println(numbers);
		System.out.println(numbers.isEmpty());
		
		numbers.add(5);
		numbers.add(4);
		numbers.add(80);
		numbers.add(9);
		numbers.add(4);
		numbers.add(4);
		numbers.add(80);
		System.out.println(numbers);
		System.out.println(numbers.isEmpty());
		
		numbers.add(2, -6);
		System.out.println(numbers);
		
		List<Integer> newNumbers = new ArrayList<>();
		newNumbers.add(50);
		newNumbers.add(-20);
		newNumbers.add(60);
		newNumbers.add(-20);
		
		
		numbers.addAll(newNumbers);
		
		//List<Integer> newNumbers = Arrays.asList(50,-20,60,-20);
		
		System.out.println(numbers);
		List<Integer> newNumbers1 = Arrays.asList(35,-25,2,4);
		numbers.addAll(2, newNumbers1);
		System.out.println(numbers);
		
		System.out.println("Number -6 exists in our List or not? "+numbers.contains(-6));
		
		System.out.println("Number -600 exists in our List or not? "+numbers.contains(-600));
		
		System.out.println("Whether the COllection: "+newNumbers+" exists in my list or not? "+numbers.containsAll(newNumbers));
		
		System.out.println("Index of first occurence of 80 is: "+numbers.indexOf(80));

		System.out.println("Index of last occurence of 80 is: "+numbers.lastIndexOf(80));
		
//		System.out.println("Value at index number 6 is: "+numbers[6]); ERROR
		
		System.out.println("Value at index number 6 is: "+numbers.get(6)); 
		
		numbers.set(6, -580);
		System.out.println(numbers);
		
		System.out.println("First Element of our ArrayList: "+numbers.getFirst());
		System.out.println("Last Element of our ArrayList: "+numbers.getLast());
		
		
		
		// Delete
		
		System.out.println("Deleted element at index 4 is: "+numbers.remove(4));

		System.out.println(numbers);
		
		Object x = (Integer)80; 
		System.out.println("Delete" + x +" element from ArrayList: "+numbers.remove(x));
		
		
		System.out.println(numbers);
		
		List<Integer> deleteNums = Arrays.asList(35,-580,-20,4,55000);
		
		System.out.println( numbers.removeAll(deleteNums));
		
		System.out.println(numbers);
		
		// Iterating over List / LOOPS
		System.out.println("Using For Loop");
		for(int i = 0; i < numbers.size();i++)
		{
			if(i<numbers.size()-1)
			{
				
				System.out.print(numbers.get(i)+", ");
			}else {
				
				System.out.print(numbers.get(i)+" ");
			}
		}
		
		System.out.println("\n\nUsing Enhanced For Loop");
		
		for(Integer tempNumber : numbers) {
			
			
			
			System.out.print(tempNumber+" ");
		}
		
	


		
	}

}
