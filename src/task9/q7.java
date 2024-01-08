package task9;

import java.util.Scanner;

public class q7 {

	public static void main(String[] args) {
		int a;
	    int b; 
		int c;
		Scanner number = new  Scanner(System.in);
		System.out.println("Enter a value");
		a=number.nextInt();
		System.out.println("Enter b value");
	    b=number.nextInt();
		System.out.println("Enter c value");
		c=number.nextInt();
		if(a>b && a>c)
		{
		 System.out.println("a is the largest number");
	    }
		else if(b>c && b>a)  
		{
		 System.out.println("b is the largest number");
		}
		else 
		{
	     System.out.println("c is the largest number");
	}
	}

}
