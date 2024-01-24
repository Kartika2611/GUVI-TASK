package com.example.hr;

public class Employee 

{

		     String name;
		     int id;
		     double salary;
		     // Creating Constructor for the class Employee
		    public Employee(String name, double salary) 
		    {
		        this.name = name;
		        this.salary = salary;
		    }
		    
		   
		   


			public void printName() 
		    {
		    	
		        System.out.println("Employee name-> " +name);
		    }
		    
		    public void printSalary() {

		    	System.out.println("Employee salary-> " +salary);
		    
			
	}
}