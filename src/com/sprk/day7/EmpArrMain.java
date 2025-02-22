package com.sprk.day7;

public class EmpArrMain {
	
	public static void main(String[] args) {
		
		Employee[] employees = new Employee[5];
		
		employees[0] = new Employee(1001,"Rohan Yadav","Male",25000,"Sales");
		employees[1] = new Employee(1005,"Ashutosh Mishra","Male",15000,"Sales");
		employees[2] = new Employee(1003,"Nandini Srivastav","Female",35000,"HR");
		employees[3] = new Employee(1004,"Abhishek Gupta","Male",25000,"HR");
		employees[4] = new Employee(1002,"Anjali Raibole","Female",15000,"HR");
		
		System.out.println("Employees Are: ");
		
		for(Employee tempEmployee : employees) {
			System.out.println(tempEmployee);
		}
	}

}
