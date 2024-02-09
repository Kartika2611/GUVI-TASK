package Task20;
import java.time.Duration;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DatePicker {

   public static void main(String[] args) throws InterruptedException 
	{

		
				WebDriver driver = new EdgeDriver();
                //Maximizing the window 
				driver.manage().window().maximize();
				//Navigating the URL
				driver.get("https://jqueryui.com/datepicker/");
				//using implicit wai
                driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
				//switching to frame
                driver.switchTo().frame(0);
				//id locator is used
                driver.findElement(By.id("datepicker")).click();
				//xpath locator is used
                driver.findElement(By.xpath("//a[@title='Next']")).click();
                Thread.sleep(2000);
                //from table date is chosen using xpath locator
                driver.findElement(By.xpath("((//table)[1]//tr//a[text()='22'])")).click();
				WebElement datePick = driver.findElement(By.id("datepicker"));
				//getAttribute is used to get the attribute
				String date = datePick.getAttribute("value");
				//next month date is printed
				System.out.println("Next Month Date:" + date);
                //closing all tabs opened in the browser
				driver.quit();
				
	}

}