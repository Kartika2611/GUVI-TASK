package task16;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class firefox {

	public static void main(String[] args) 
	{
		// Creating an object for Firefox driver
		WebDriver driver = new FirefoxDriver(); 
		//Pass the url
		driver.navigate().to("https://www.google.com/");
		//To maximize the window
		driver.manage().window().maximize();
		System.out.println("Print the url");
		//Print the current URL
		String url=driver.getCurrentUrl();
		System.out.println("Printing the url:" +url);
		//Reload the page
		driver.navigate().refresh();
		// closing the browser
		driver.close();

	}

}
