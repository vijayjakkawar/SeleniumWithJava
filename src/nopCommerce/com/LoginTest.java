package nopCommerce.com;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginTest {

		public WebDriver driver;
		
		@BeforeTest
	public void setUp()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.nopcommerce.com/en/login?returnUrl=%2Fen%2Fdemo");
		
	}
		@Test
		public void Register()
		{
			driver.findElement(By.className("btn blue-button")).click();
			driver.findElement(By.id("FirstName")).sendKeys("jakkawar");
			driver.findElement(By.id("LastName")).sendKeys("vijay");
			driver.findElement(By.id("Email")).sendKeys("jakkawar@gmail.com");
			driver.findElement(By.xpath("ConfirmEmail")).sendKeys("jakkawar@gmail.com");
			driver.findElement(By.id("Username")).sendKeys("vijayjakkawar");
			driver.findElement(By.id("check-availability-button")).click();
			
			
			
		}
		
		
		
		
		
		@AfterTest
		public void tearDown()
		{
			
			driver.quit();
			
		}
	
	
	
	

}
