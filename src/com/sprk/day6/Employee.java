package com.sprk.day6;

public class Employee extends Person {

	private int empId;

	private double salary;

	public Employee() {
		System.out.println("Default constructor of Employee class");
	}

	public Employee(String name, int age, String gender, int empId, double salary) {
		super(name, age, gender);

		System.out.println("Parameterized constructor of Employee class");
		this.empId = empId;

		this.salary = salary;

	}

	void calculateSalary() {
		if (salary > 15000) {
			System.out.println("10% Tax Deducted. Salary deducted is Rs." + (salary - 0.1 * salary));
			salary = salary - 0.1 * salary;
		}else {
			System.out.println("No tax deducted");
		}
	}

	@Override
	public String toString() {
		calculateSalary();
		return super.toString()+"Employee [empId=" + empId + ", salary=" + salary + "]";
	}

	@Override
	public void displayCompanyName() {
		System.out.println("Company: SPRK Technologies");
		
	}
	
	
	
	

}
