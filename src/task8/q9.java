package task8;
import java.util.Scanner;

public class q9 {

	public static void main(String[] args) {
		int age;
		Scanner number=new Scanner(System.in);
		System.out.println("Enter the age");
		age=number.nextInt();
		if(age>60) {
		System.out.println("He/She is a senior citizen");

		}else
		{
		System.out.println("He/She is not a senior citizen");
		}

	}

}
