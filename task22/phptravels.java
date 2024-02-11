package task22;
import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class phptravels
{

	public static void main(String[] args) throws InterruptedException, IOException 
	{
	

		// Launch the chrome Browser
		WebDriver driver = new ChromeDriver();

		// Launching the URL 
		driver.navigate().to("https://phptravels.com/demo/");

		// Using pageLoadTimeout 
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));

		// Using implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// Maximize the browser view
		driver.manage().window().maximize();

		// Locators are used for filling the form
		driver.findElement(By.name("first_name")).sendKeys("Pillai");
		driver.findElement(By.name("last_name")).sendKeys("Kartika");
		driver.findElement(By.name("business_name")).sendKeys("PHP TRAVELS");
		WebElement ele=driver.findElement(By.xpath(("//input[@placeholder='Email']")));
		ele.sendKeys("phptravels0512@gmail.com");

		// Adding the two numbers for validation 
		String num1 = driver.findElement(By.xpath("//span[@id='numb1']")).getText();
		String num2 = driver.findElement(By.xpath("//span[@id='numb2']")).getText();

		// Converting String to integer
		int result = Integer.parseInt(num1) + Integer.parseInt(num2);

		driver.findElement(By.xpath("//input[@id='number']")).sendKeys(String.valueOf(result));

		// Click submit button
		driver.findElement(By.xpath("//button[text()='Submit']")).click();
		
		// Using explicit wait until 
		WebElement thankYouText = driver.findElement(By.xpath("//strong[text()=' Thank you!']"));
		WebElement successMessage = driver.findElement(By.xpath("//p[@class='text-center cw']"));

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
		wait.until(ExpectedConditions.visibilityOf(thankYouText));
		wait.until(ExpectedConditions.visibilityOf(successMessage));

		String thankYou = driver.findElement(By.xpath("//strong[text()=' Thank you!']")).getText();
		String success = driver.findElement(By.xpath("//p[@class='text-center cw']")).getText();

		// Validating 
		
		String text = driver.findElement(By.xpath(" //h2[contains(text(),'Instant demo request form')]")).getText();      //get text for verification purpose
		
		if(text.contains("Instant"))
		{                                  
			System.out.println("Form submitted successfully:"    +text);
		} else 
		{
			System.out.println("Form not submitted successfully");
		}
															
		TakesScreenshot screenshot = (TakesScreenshot) driver;//Taking screenshot
		Thread.sleep(1000);
		File source =screenshot.getScreenshotAs(OutputType.FILE);
		File destination =new File("C:\\Users\\ADMIN\\eclipse-workspace\\Xlsheetop\\src\\main\\java\\task22.png");   
		
		FileUtils.copyFile(source, destination);
		
			
		driver.close();    //close the tab
	}
}

		
		
		
		
		