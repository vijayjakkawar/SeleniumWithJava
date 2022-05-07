package AlertsAndExceptions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExceptionHandlingExmp {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://demo.seleniumeasy.com/javascript-alert-box-demo.html");

		try {
		new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//button[text()='Click me!'])[2]")));
			
		  try {
		  driver.findElement(By.xpath("(//button[text()='Click me!'])[2]")).click();
		  }catch(WebDriverException e) { System.out.println(e.getLocalizedMessage()); }
		  }catch(

	TimeoutException e)
	{
		System.out.println(e.getLocalizedMessage());
	}

}

}
