package Task20;
import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class guvisignup{

	public static void main(String[] args) throws InterruptedException 
	{
		

		// Launch the Chrome browser
		WebDriver driver = new ChromeDriver();

		// Load the URL 
		driver.navigate().to("https://www.guvi.in/");

		// Implicit wait for the element 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// Maximize the browser 
		driver.manage().window().maximize();

		// Click the Sign up button on the top right corner
		driver.findElement(By.xpath("(//a[text()='Sign up'])[1]")).click();

		// Filling all the details for Sing up form
		driver.findElement(By.className("form-control")).sendKeys("Pillai Kartika");
		driver.findElement(By.id("email")).sendKeys("pillaikartika9@gmail.com");
		driver.findElement(By.cssSelector("input#password")).sendKeys("Harikartika11");
		driver.findElement(By.xpath("//input[@id='mobileNumber']")).sendKeys("8838999346");
        List<WebElement> button = driver.findElements(By.tagName("a"));
        for (WebElement button1 : button) 
        {
			if (button1.getAttribute("id").equals("signup-btn")) 
			{
				//Thread.sleep(2000);
				button1.click();
			}
		}

		
	}

}