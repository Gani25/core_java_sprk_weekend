package com.sprk.day9.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class EmployeeList {

	public static void main(String[] args) {
		List<Employee> employees = new ArrayList<>();

		employees.add(new Employee(70, "Rohan Gupta", 2300, "Sales"));
		employees.add(new Employee(60, "Dinesh Yadav", 6600, "HR"));
		employees.add(new Employee(20, "Preeti Shinde", 4300, "Sales"));
		employees.add(new Employee(80, "Nandini Shinde", 6500, "HR"));
		employees.add(new Employee(10, "Rohan Yadav", 6500, "Sales"));
		employees.add(new Employee(100, "Shruti", 5200, "HR"));
		employees.add(new Employee(50, "Depali Verma", 2200, "Sales"));
		employees.add(new Employee(30, "Shoaib", 6600, "IT"));
		employees.add(new Employee(40, "Pranjal Sharma", 6500, "IT"));
		employees.add(new Employee(90, "Shubham", 4800, "Sales"));

		System.out.println("Employee Info Before Sorting");
		for (Employee tempEmployee : employees) {
			System.out.println(tempEmployee);
		}

//		Comparator<Employee> comparator = (o1,o2)->{
//			int departmentCompare = o1.getDepartment().compareTo(o2.getDepartment());
//			
//			if(departmentCompare  == 0) {
//				// The Compare by Salary in ASC
//				return Double.compare(o1.getSalary(), o2.getSalary());
//			}
//			return departmentCompare;
//		};

//		Comparator<Employee> comparator = (o1,o2)->{
//			int departmentCompare = o1.getDepartment().compareTo(o2.getDepartment());
//			int salaryCompare = Double.compare(o1.getSalary(), o2.getSalary());
//			
//			return departmentCompare == 0 ? salaryCompare : departmentCompare;
//			
//		};

//		Comparator<Employee> comparator = (o1, o2) -> o1.getDepartment().compareTo(o2.getDepartment()) == 0
//				? Double.compare(o2.getSalary(), o1.getSalary()) // Sal in DESC
//				: o1.getDepartment().compareTo(o2.getDepartment()); // Dept in ASC

		Collections.sort(employees,
				(o1, o2) -> o1.getDepartment().compareTo(o2.getDepartment()) == 0
						? Double.compare(o2.getSalary(), o1.getSalary()) // Sal in DESC
						: o1.getDepartment().compareTo(o2.getDepartment()) // Dept in ASC
		);
		System.out.println();
		System.out.println("Employee Info After Sorting By Department and By Salary In ASC");
		System.out.println();
		for (Employee tempEmployee : employees) {
			System.out.println(tempEmployee);
		}

	}

}
