package task8;
import java.util.Scanner;

public class q1 {

public static void main(String[] args) {
	
	int a;
    int b; 
	int c;
	int d;
	Scanner number = new  Scanner(System.in);
	System.out.println("Enter a value");
	a=number.nextInt();
	System.out.println("Enter b value");
    b=number.nextInt();
	Scanner obj = new  Scanner(System.in);
	System.out.println("Enter c value");
	c=obj.nextInt();
	System.out.println("Enter d value");
	d=obj.nextInt();
	int e=a+b;
	int f=c+d;
	if(e>f){
	 System.out.println("sum of a and b  is > than sum of c and d");
		   }
	else {
	 System.out.println("sum of a and b  is < than sum of c and d");
	}
}
}
								
