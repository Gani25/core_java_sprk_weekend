package com.sprk.day5.inheritance.main;

import com.sprk.day5.inheritance.Employee;
import com.sprk.day5.inheritance.PartEmployee;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee e1 = new Employee("Rohan Das",25,"Male",1001,"Admin",20000);
		Employee e2 = new Employee(); // default
		e2.setName("Abdul");
		e2.setAge(20);
		e2.setGender("Male");
		e2.setEmpId(1002);
		e2.setDepartment("Sales");
		e2.setSalary(15000);
		
		e1.calculateSalary();
		System.out.println(e1);
		e2.calculateSalary();
		System.out.println(e2);
		
		PartEmployee pte1 = new PartEmployee("Pratik Mhatre", 35, "Male", 1003, "IT", 25, 2000);
		pte1.calculateSalary();
		System.out.println(pte1);
				
				
	}	

}
