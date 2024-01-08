package task8;
import java.util.Scanner;

public class q10 {

	public static void main(String[] args) {
		int c=0;
		int n;
		System.out.println("Enter the value of n");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		while(n>0)
		{
		n=n/10;
		c++;

		}
		System.out.print("no of digits ");
		System.out.print(+c);


	}

}
