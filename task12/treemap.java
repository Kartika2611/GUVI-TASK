package task12;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.TreeMap;

public class treemap 
{

public static void main(String[] args) 
{

	TreeMap<Integer, String> empMap = new TreeMap<>();

	 Scanner scanner = new Scanner(System.in);

	 // Getting the input from user for the number of employees
	   System.out.print("enter the total number of employees-> ");
	   int numEmployees = scanner.nextInt();
	   for (int i = 0; i < numEmployees; i++) {
	   System.out.print("enter the employee ID-> ");
	   int empId = scanner.nextInt();
	   scanner.nextLine();
	   System.out.print("enter the employee name-> ");
	   String empName = scanner.nextLine();
	   // Adding the employee ID and name to the TreeMap
	            empMap.put(empId, empName);
	   }
	        
	    // Sorting in alphabetical order
	      List<String> sortednames = new ArrayList<>(empMap.values());
	      Collections.sort(sortednames);
	      System.out.println("");
	      System.out.println("Sorting employee name in alphabetical order");
	      for (String name : sortednames) 
	      {
	            System.out.println(name);
	       }
	        
	     }
	}


