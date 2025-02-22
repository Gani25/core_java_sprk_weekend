package com.sprk.day6;

public abstract class Person {

	protected String name;

	protected int age;

	protected String gender;

	public Person() {
		System.out.println("Default constructor of Person");
	}

	public Person(String name, int age, String gender) {
		System.out.println("Parameterized constructor of Person");
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	
	// A method without body {} is clled as abstract method
	public abstract void displayCompanyName();

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", gender=" + gender + "]";
	}
	
	
	
	

}
