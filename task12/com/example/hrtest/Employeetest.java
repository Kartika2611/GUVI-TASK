package com.example.hrtest;

import java.util.Scanner;

import com.example.hr.Employee;

public class Employeetest {

	public static void main(String[] args) 
	//Getting the input from user
	{

		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the employee name: ");
		String name = scanner.next();
        System.out.println("enter the employee salary: ");
		Double salary = scanner.nextDouble();

		// Creating the instance of Employee class
		
		Employee emp = new Employee(name,salary);
		System.out.println("\n");
		emp.printName();
		emp.printSalary();

	}

}
