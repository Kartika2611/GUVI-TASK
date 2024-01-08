package task9;
import java.util.Formatter;
import java.util.Scanner;

public class q6 {
	
public static void main(String[] args) {
	
	int month, days;
	float rent,r=0;Scanner sc=new Scanner(System.in);
	System.out.println("Enter the month");
	month=sc.nextInt();
	System.out.println("Enter the no. of days");
	days=sc.nextInt();
	Scanner nc=new Scanner(System.in);
	System.out.println("Enter the rent");
	rent=nc.nextFloat();
	float tariff=rent*days;
    r=tariff+((tariff/100)*20);
	switch(month)
	{
	case 4,5,6,11,12:
		System.out.println("Hotel tariff" +r);
	    break;
	 default:
		 tariff=rent*days;
		 System.out.println("Hotel tariff" +tariff);
		
	}
	}
	
		
		
	
	
	
		

	}

}
