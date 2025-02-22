package com.sprk.day3.demo;

// Blueprint
public class Person {
	// Access Modifier
	// 1. default -> Only accessible within same package
	// 2. public -> Accessible within and outside package as well as class
	// 3. private -> Only accessible inside of the class
	// Fields
	private int age;
	
	private String name;

	private String gender;
	
	// METHODS
	public Person() {
		System.out.println("Default Constructor of a Person Class");
		name = "John Doe";
		age = 25;
		gender = "Male";
	}
	
	// Parameterized COnstructor
	public Person(String name, int age, String gender)
	{
		System.out.println("Parameterized Constructor of a Person Class");
		this.name = name;
		this.age = age;
		this.gender = gender;
		
	}
	
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
	

	@Override
	public String toString() {
		return "Person [age=" + age + ", name=" + name + ", gender=" + gender + "]";
	}

	public void display() {
		System.out.println("Name: "+name); 
		System.out.println("Gender: "+gender); 
		System.out.println("Age: "+age); 
	}
}
