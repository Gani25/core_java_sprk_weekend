package com.sprk.day6;

public class MainClass {
	
	public static void main(String[] args) {
		// Don't want to initialize object of Person
//		Person person = new Person("Rohit",25,"Male"); Person is Abstract class cannot be initialize
//		System.out.println(person);
		
		Employee employee= new Employee("Rohan",25,"Male",10001,25000.0);
		
		employee.displayCompanyName();
		
		System.out.println(employee);
		
		// Dynamic Method Dispatch:
		/*
		 * Reference of base class and object of derived class
		 * */
		Person p1 = new Employee("Pranjal",18,"Female",1002,25895.0);
		
		p1.displayCompanyName();
		
		System.out.println(p1);
	}

}
