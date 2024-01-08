package task9;
import java.util.Scanner;

public class q2 {

	public static void main(String[] args) {
	String str;
	String strev="";
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the string");
	str=sc.next();
	int len=str.length();
	for(int i=len-1;i>=0;i--)
	{
		strev=strev+str.charAt(i);
		
		
	}
	System.out.println("Reveresed string is:"  +strev);
	
  }

}
