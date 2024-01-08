package task8;
import java.util.Scanner;

public class q4 {

	public static void main(String[] args) {
		int a, b;
		System.out.println("Enter a and b value");
		Scanner re = new  Scanner(System.in);
		a=re.nextInt();
		b=re.nextInt();
		int c=a;
		a=b;
		b=c;
		System.out.println("After swapping:a="+a);
		System.out.println("After swapping:b="+b);

	}

}
