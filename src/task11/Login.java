package task11;
import java.util.Scanner;

public class Login 
{

	public static void main(String[] args) 
	{
		String correctPassword = "kartika11@";

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter password: ");
        String enteredPassword = scanner.nextLine();

        try {
            if (!enteredPassword.equals(correctPassword)) 
            {
                throw new Exception("Incorrect password. Please enter your valid password");
            } 
            else {
                System.out.println("Login successful");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

