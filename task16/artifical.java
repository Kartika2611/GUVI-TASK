package task16;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class artifical {

	public static void main(String[] args) 
	{
		// Creating an object for  driver
		 WebDriver driver =new ChromeDriver();  //Launch the driver
		 
		 
		 driver.navigate().to("https://www.wikipedia.org/");     //Load the url
		 
		 driver.manage().window().maximize();   //maximize the window
		 
		 //Search the text using send keys  and put enter
		 driver.findElement(By.id("searchInput")).sendKeys("Artificial intelligence" ,Keys.ENTER);   
		
		 //to search the history and click
		 driver.findElement(By.id("toc-History")).click();
		 
		 //print the title of the section 
		 
		String text = driver.findElement(By.id("toc-History")).getText();
		
		System.out.println("Title is:" +text);  //print the section text in console
		
		driver.close();    //close the driver


}
}
