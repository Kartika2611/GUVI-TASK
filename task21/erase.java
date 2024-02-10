package task21;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class erase {

	public static void main(String[] args) throws InterruptedException {
		
		// Launch the Chrome browser
		WebDriver driver = new ChromeDriver();

		// Load the URL
		driver.navigate().to("https://the-internet.herokuapp.com/iframe");

		// Implicit wait for the element of the page to click them
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// Maximize the browser 
		driver.manage().window().maximize();

		//  Xpath locator is used
		WebElement frameElement = driver.findElement(By.xpath("//iframe[@title='Rich Text Area']"));

		// Switching to frame by element to enter the text
		driver.switchTo().frame(frameElement);

		//Using <p>  to locate the element
		WebElement ele = driver.findElement(By.xpath("//p[text()='Your content goes here.']"));
		//clear() used to clear the given text
		ele.clear();

		// given text is entered
		ele.sendKeys("Hello People");

	   //printing on console
		WebElement ctext = driver.findElement(By.tagName("p"));
		System.out.println("The text entered is : " + ctext.getText());
		Thread.sleep(2000);

		// Closing the browser
		driver.close();
	}

}