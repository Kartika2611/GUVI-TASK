package task21;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class nestedframe
{

	public static void main(String[] args) throws InterruptedException 
	{
		//Launch the browser
		WebDriver driver = new ChromeDriver();

		// Load the URL 
		driver.navigate().to("http://the-internet.herokuapp.com/nested_frames");

		// Implicit wait is used
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// Maximize the browser 
		driver.manage().window().maximize();

		WebElement topframe = driver.findElement(By.xpath("//frame[@name='frame-top']"));
		// Switching to top frame
		driver.switchTo().frame(topframe);

		// Verifying there are three frames on the page
		List<WebElement> frame = driver.findElements(By.tagName("frame"));
		String Size = String.valueOf(frame.size());
		if (Size.equals("3")) 
		{
			System.out.println("There are three frames ");
		} else {
			System.out.println("Frames are less than three");
		}

		WebElement leftFrame = driver.findElement(By.xpath("//frame[@name='frame-left']"));
		// Switching to left frame
		driver.switchTo().frame(leftFrame);

		// Locating the text 
		WebElement ele = driver.findElement(By.tagName("body"));
		String leftText = ele.getText();

		// Verifying the left frame 
		
		if (leftText.equals("LEFT")) {
			System.out.println("The left frame hastext: " + leftText);
		} 
		else 
		{
			System.out.println("The left frame don't have any text");
		}

		// Switching back to the top frame
		driver.switchTo().parentFrame();

		WebElement midframe = driver.findElement(By.xpath("//frame[@name='frame-middle']"));
		
		// Switching to middle frame
		driver.switchTo().frame(midframe);

		// Locating the text 
		WebElement ele1 = driver.findElement(By.tagName("body"));
		String middleText = ele1.getText();

		// Verifying that the middle frame 
		
		if (middleText.equals("MIDDLE")) {
			System.out.println("The middle frame has the text: " + middleText);
		} else {
			System.out.println("The middle don't have text");
		}

		// Switching back to the top frame
		driver.switchTo().parentFrame();
       // driver.close();
	}

}