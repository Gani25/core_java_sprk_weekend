package com.sprk.day7.collections;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListEx2 {
	
	public static void main(String[] args) {
		ArrayList<String> fruits = new ArrayList<>();
		
		fruits.addAll(Arrays.asList("Banana","Cherry","Mango","Orange","Grapes"));
		
		System.out.println(fruits);
		
		String[] myStrFruits = fruits.toArray(new String[0]);
		
		System.out.println(myStrFruits.toString());
		
		System.out.println("My Fruits Array: ");
		for(String tempFruit:myStrFruits) {
			System.out.print(tempFruit+"\t");
		}
	}

}
