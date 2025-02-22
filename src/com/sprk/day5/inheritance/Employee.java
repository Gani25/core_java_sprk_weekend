package com.sprk.day5.inheritance;


public class Employee extends Person {

//	FIELDS
	protected int empId;

	protected String department;

	protected double salary;

//	METHDOS
	public Employee() {
		System.out.println("Default constructor of Employee Class");
	}

	public Employee(String name, int age, String gender,int empId, String department, double salary) {
		super(name,age,gender);
		System.out.println("Parameterized constructor of Employee Class");
		this.empId = empId;
		this.department = department;
		this.salary = salary;
	}
	
	

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public void calculateSalary() {
		if(salary > 15000) {
			System.out.println("10% TDS deducted");
			System.out.println("Salary deducted = "+(0.1*salary));
			// Reduce actual salary
			salary = salary - 0.1 * salary;
		}else {
			System.out.println("No TDS Deducted");
		}
	}

	@Override
	public String toString() {
		return super.toString()+"Employee [empId=" + empId + ", department=" + department + ", salary=" + salary + "]";
	}
	
	
	
	
}
