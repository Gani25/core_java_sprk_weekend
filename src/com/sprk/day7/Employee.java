package com.sprk.day7;

public class Employee {

	private int empId;

	private String name;

	private String gender;

	private double salary;

	private String department;

	public Employee() {
		// TODO Auto-generated constructor stub
	}

	// Copy COnstructor
	// Param as Employee Obj
	public Employee(Employee otherObj) {
		empId = otherObj.empId;
		gender = otherObj.gender;
		name = otherObj.name;
		salary = otherObj.salary;
		department = otherObj.department;
	}

	public Employee(int empId, String name, String gender, double salary, String department) {
		super();
		this.empId = empId;
		this.name = name;
		this.gender = gender;
		this.salary = salary;
		this.department = department;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
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

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", gender=" + gender + ", salary=" + salary
				+ ", department=" + department + "]";
	}

}
