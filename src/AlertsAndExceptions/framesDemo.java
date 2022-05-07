package AlertsAndExceptions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class framesDemo {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);		
		driver.manage().window().maximize();
		driver.get("http://demo.automationtesting.in/Frames.html");
		
		//  to move webpage to single frame 
		
		driver.switchTo().frame(driver.findElement(By.id("singleframe")));
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("vijay");
		// to switch back to our default page
		driver.switchTo().defaultContent();
		
		// multiple frames
		
		

	}

}
