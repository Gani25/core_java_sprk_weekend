package com.sprk.day7.generics;

import com.sprk.day7.Employee;

public class GenericMain {
	
	
	public static void main(String[] args) {
		String info = "Hello all Welcome";
		
		Response<String> response = new Response<>();
		
		response.setData(info);
		response.setMessage("In Generic Passing String");
		
		System.out.println(response);
		
		Response<Employee> response2 = new Response<>();
		
		response2.setData(new Employee(1001, "Memon", "Male", 250, "Sales"));
		response2.setMessage("Passing Employee Object in Generics");
		
		System.out.println(response2);
		
		Response<Student> response3 = new Response<Student>("Student Obj in Generics", new Student(1, "Rohan", 25));
		
		System.out.println(response3);
		
	}
	
	

}
