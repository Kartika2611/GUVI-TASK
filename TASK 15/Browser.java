package task13;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
       // open the browser and launch the google url
		//set the driver
		ChromeDriver driver=new ChromeDriver();
	   // add the Url
		driver.get("https://www.google.com/");
		// maximize the driver
		driver.manage().window().maximize();
		//locate the element
		driver.findElement(By.name("csi")).sendKeys("Selenium Browser Driver",Keys.ENTER);
		// close the browser
		driver.close();
	}

}
