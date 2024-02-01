package task17;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class addtocart {

	public static void main(String[] args) throws InterruptedException {
		        // Creating an object for Chrome driver
				WebDriver driver = new ChromeDriver(); 
				//Pass the url
				driver.navigate().to("https://www.demoblaze.com/");
				//implicit wait duration is used to wait for 10seconds
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				//To maximize the window
				driver.manage().window().maximize();
				//to find the laptop element
				 driver.findElement(By.partialLinkText("Laptop")).click();
				 // redirected page a time window of few seconds to load 
				 Thread.sleep(4000);
				 driver.findElement(By.partialLinkText("Sony vaio i5")).click();
				// X-path is used to find the element and add to cart 
				 driver.findElement(By.xpath("//a[text()='Add to cart']")).click();  
				 //close the browser
				 driver.close();
			 	
				 		
  }

}
