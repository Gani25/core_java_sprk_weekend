package com.sprk.day9.comparable;

import java.util.ArrayList;
import java.util.List;

public class EmployeeList {
	
	public static void main(String[] args) {
		List<Employee> employees = new ArrayList<>();
		
		
		
		employees.add(new Employee(70,"Rohan Gupta",2300,"Sales"));
		employees.add(new Employee(60,"Dinesh Yadav",6600,"HR"));
		employees.add(new Employee(20,"Preeti Shinde",4300,"Sales"));
		employees.add(new Employee(100,"Shruti",6600,"HR"));
		employees.add(new Employee(10,"Rohan Yadav",6500,"Sales"));
		employees.add(new Employee(50,"Depali Verma",2200,"Sales"));
		employees.add(new Employee(30,"Shoaib",6600,"IT"));
		employees.add(new Employee(40,"Pranjal Sharma",6500,"IT"));
		employees.add(new Employee(80,"Nandini Shinde",6500,"HR"));
		employees.add(new Employee(90,"Shubham",4800,"Sales"));
		
		System.out.println("Employee Info Before Sorting");
		for(Employee tempEmployee:employees) {
			System.out.println(tempEmployee);
		}
		
	}

}
