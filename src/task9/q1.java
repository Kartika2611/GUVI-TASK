package task9;
import java.util.Scanner;

public class q1 {

	public static void main(String[] args) {
    String str;
    Scanner sc=new Scanner(System.in);
    System.out.println("ENTER THE STRING VALUE");
    str=sc.next();
    String str1=str;
    String reverse="";
    int len=str.length();
    for(int i=len-1;i>=0;i--)
    {
    	reverse=reverse+str.charAt(i);
    }
    if(str1.equals(reverse)) 
    {
    	System.out.println(str1+ "Is a palindrome");
    }
    else
    {
    	System.out.println(str1+ "Is not a palindrome");
    }
    	
 }

}
