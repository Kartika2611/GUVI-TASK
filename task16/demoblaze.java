package task16;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demoblaze {

	public static void main(String[] args) {
		// // Creating an object for Chrome driver
		WebDriver driver = new ChromeDriver(); 
		//Pass the url
		driver.navigate().to("https://www.demoblaze.com/");
		//To maximize the window
		driver.manage().window().maximize();
		//Get the title of the page
		String title=driver.getTitle();
		System.out.println("TITLE OF THE PAGE IS STORE:" +title);
		if(title.equals("STORE"))
		{
	    System.out.println("Page landed on correct website");
		}
		else
		{
			System.out.println("Page landed on incorrect website");
		}
	 
				
		}
	}




