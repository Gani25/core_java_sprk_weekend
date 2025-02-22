package com.sprk.day6.interfaces;

public class Employee implements Person {

	private String name;
	int age;
	String gender;
	private int empId;

	private double salary;

	public Employee() {
		System.out.println("Default constructor of Employee class");
	}

	public Employee(String name, int age, String gender, int empId, double salary) {
		System.out.println("Parameterized constructor of Employee class");
		this.name = name;
		this.age = age;
		this.gender = gender;

		this.empId = empId;

		this.salary = salary;

	}

	public void calculateSalary() {
		if (salary > 15000) {
			System.out.println("10% Tax Deducted. Salary deducted is Rs." + (0.1 * salary));
			salary = salary - 0.1 * salary;
		} else {
			System.out.println("No tax deducted");
		}
	}

	

	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + ", gender=" + gender + ", empId=" + empId + ", salary="
				+ salary + "]";
	}
	
	@Override
	public void displayCompanyName() {
		System.out.println("Company: SPRK Technologies");

	}

	

}
