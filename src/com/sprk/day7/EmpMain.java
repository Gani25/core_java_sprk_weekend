package com.sprk.day7;

public class EmpMain {
	
	public static void main(String[] args) {
		
		
		Employee e1 = new Employee(1001, "Rohit", "Male", 2500, "IT");
		
		// Shallow Copy
		Employee e2 = e1;
		
		System.out.println("Emp 1: "+e1);
		System.out.println("Emp 2: "+e2);
		
		e2.setDepartment("Sales");
		e2.setName("Abdul Gani");
		
		System.out.println("Emp 1: "+e1);
		System.out.println("Emp 2: "+e2);
		
		System.out.println("Copy COnstructir Example: ");
		
		Employee newE1 = new Employee(1002, "Pranjal Shinde", "Female", 3590, "Admin");
		
		// Deep Copy
		Employee copyE1 = new Employee(newE1);
		
		System.out.println("New E1 = "+newE1);
		System.out.println("Copy E1 = "+copyE1);
				
		copyE1.setGender("Male");
		copyE1.setName("Siddesh");
		
		System.out.println("New E1 = "+newE1);
		System.out.println("Copy E1 = "+copyE1);
				
	}

}
