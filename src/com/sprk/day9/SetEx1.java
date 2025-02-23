package com.sprk.day9;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetEx1 {
	
	public static void main(String[] args) {
		Set<String> fruits = new HashSet<>();
		
		fruits.add("Mango");
		fruits.add("Apple");
		fruits.add("Mango");
		fruits.add("Banana");
		fruits.add("Orange");
		fruits.add("Grapes");
		fruits.add("Banana");
		
		System.out.println("Hash Set");
		System.out.println(fruits);
		
		fruits.add("Jamun");
		fruits.add("Litchi");
		fruits.add("Strawberry");
		System.out.println(fruits);
		
		Set<String> fruits1 = new TreeSet<>();
		System.out.println("\nTree Set");
		
		fruits1.add("Mango");
		fruits1.add("Apple");
		fruits1.add("Mango");
		fruits1.add("Banana");
		fruits1.add("Orange");
		fruits1.add("Grapes");
		fruits1.add("Banana");
		
		System.out.println(fruits1);
		
		fruits1.add("Jamun");
		fruits1.add("Litchi");
		fruits1.add("Strawberry");
		System.out.println(fruits1);
	}

}
