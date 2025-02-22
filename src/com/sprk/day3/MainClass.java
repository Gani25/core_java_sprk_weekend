package com.sprk.day3;

import com.sprk.day3.demo.Person;

public class MainClass {
	
	public static void main(String[] args) {
		// Object Person
		// Reference Variable of Type Person
		Person p1 = new Person();
		p1.setName("Pranjal");
		p1.setGender("Female");
		System.out.println(p1);		
		
		Person p2 = new Person("Rohit Yadav",30,"Male");
		System.out.println(p2);
	}
}