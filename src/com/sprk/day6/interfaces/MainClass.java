package com.sprk.day6.interfaces;

public class MainClass {
	
	public static void main(String[] args) {

		Employee employee = new Employee("Rohan",25,"Male",10001,25000.0);
		
		employee.displayCompanyName();
		employee.calculateSalary();
		
		System.out.println(employee);
		
		
		Person p1 = new Employee("Pranjal",18,"Female",1002,25895.0);
		
		p1.displayCompanyName();
		p1.calculateSalary();
		
		System.out.println(p1);
	}

}
