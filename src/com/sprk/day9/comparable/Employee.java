package com.sprk.day9.comparable;

public class Employee implements Comparable<Employee> {
	
	private int empId;
	
	private String name;
	
	private double salary;
	
	private String department;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(int empId, String name, double salary, String department) {
		super();
		this.empId = empId;
		this.name = name;
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
		return "Employee [empId=" + empId + ", name=" + name + ", salary=" + salary + ", department=" + department
				+ "]";
	}

//	@Override
//	public int compareTo(Employee o) {
//		
//		// SOrt by salary in ASC
//		return Double.compare(salary, o.salary);
//	}
	
//	@Override
//	public int compareTo(Employee o) {
//		
//		// SOrt by NAME in ASC
//		return name.compareTo(o.name);
//	}
	
//	@Override
//	public int compareTo(Employee o) {
//		
//		// SOrt by empIdin ASC
//		return Integer.compare(o.empId, empId);
//	}
	
	@Override
	public int compareTo(Employee o) {
		
		// SOrt by salary in ASC
		return department.compareTo(o.department);
	}
	
	

}
