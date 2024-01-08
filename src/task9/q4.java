package task9;

import java.util.Scanner;

public class q4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:*" );
		int n=sc.nextInt();
		char c=sc.next().charAt(0);
		int i=1,j,k=n*2-1;
		do
		  {
			j=1;
			do
			{
				if(j==i || j==k-i+1)
					System.out.print(c);;
					System.out.print(" ");
					j++;
			}while(j<=k);

			System.out.println();
			i++;
					
		  }while(i<=k);
	}

}
