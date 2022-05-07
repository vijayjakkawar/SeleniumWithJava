package AlertsAndExceptions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);		
		driver.manage().window().maximize();
		driver.get("https://demo.seleniumeasy.com/javascript-alert-box-demo.html");
		
		// Handling Normal Alert Msgs
		
		driver.findElement(By.xpath("(//button[text() = 'Click me!'])[1]")).click();
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		
		
		// Handling Ok or Cancel Confirm Alerts
	
		driver.findElement(By.xpath("(//button[text() = 'Click me!'])[2]")).click();
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
	//	driver.switchTo().alert().dismiss();

		
		
		// Handling Prompt Type Alerts
		
		WebElement PromprAlert =driver.findElement(By.xpath("//button[text()='Click for Prompt Box']"));
		PromprAlert.click();		
		Thread.sleep(3000);
		driver.switchTo().alert().sendKeys("Vijay");
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
	
		
		
		
		
		
		
		
	}

}
