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

public class guvilogin{

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
        // Filling all the details for Login form.
		driver.findElement(By.xpath("(//a[text()='Login'])[1]")).click();
		driver.findElement(By.id("email")).sendKeys("pillaikartika9@gmail.com");
		driver.findElement(By.id("password")).sendKeys("Harikartika11");
		driver.findElement(By.xpath("(//a[text()='Login'])[1]")).click();
	    //Using Explicit wait 
		WebDriverWait titleWait = new WebDriverWait(driver, Duration.ofSeconds(3));
		titleWait.until(ExpectedConditions.titleContains("GUVI | courses"));
        // Validating the user login 
		String title = driver.getTitle();
	    System.out.println(title);
        if (title.equals("GUVI | courses")) 
        {
			System.out.println("logged in successfully");
		} 
        else 
        {
			System.out.println("login was not successfuly");
		}

		//Closing the browser
		driver.close();
	}

}