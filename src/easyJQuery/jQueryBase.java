package easyJQuery;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class jQueryBase {
	WebDriver driver;
	
	@BeforeMethod
	
	public void setUp()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\drivers\\chromedriver.exe");
		 driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://demo.seleniumeasy.com/");
		driver.findElement(By.linkText("No, thanks!")).click();
		
	}
	
	
	
	@AfterMethod
	public void TearDown()
	{
		driver.quit();
	}
	

}
