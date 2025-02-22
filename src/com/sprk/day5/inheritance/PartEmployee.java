package com.sprk.day5.inheritance;

public class PartEmployee extends Employee {

	private int numOfDays;

	private double dailyWages;

	public PartEmployee() {
		System.out.println("Default constructor of Part Employee");
	}

	public PartEmployee(String name, int age, String gender, int empId, String department, int numOfDays,
			double dailyWages) {
		
		super(name, age, gender, empId, department, numOfDays*dailyWages);
		System.out.println("Parameterized constructor of Part Employee Class");
		this.numOfDays = numOfDays;
		this.dailyWages = dailyWages;
	}
	
	

	@Override
	public void calculateSalary() {
		System.out.println("No TDS for part time employee Thankyou!");
	}

	@Override
	public String toString() {
		return super.toString()+"PartEmployee [numOfDays=" + numOfDays + ", dailyWages=" + dailyWages + "]";
	}

	
	
	
	
	
	

}
