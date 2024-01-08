package task8;
import java.util.Scanner;

public class q5 {

	public static void main(String[] args) {
	   int a;
		Scanner number=new  Scanner(System.in);
		System.out.println("Enter a value");
		a=number.nextInt();
		for(int i=2;i<a;i++) 
		{
		if(a%i==0)
		{
		System.out.println("Number is not  Prime number");
			
		}

		}
	}
}
