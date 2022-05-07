package AssignmentProgram;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class program1 {

	  public WebDriver driver;
		
		@BeforeTest
		public void setUp()
		{
			
			System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\drivers\\chromedriver.exe");
			 driver = new ChromeDriver();

			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			driver.get("https://demo.seleniumeasy.com/input-form-demo.html");
			
		}
		
		
		@Test
		public void setDetails()
		
		{
			driver.findElement(By.name("first_name")).sendKeys("jakkawar");
			driver.findElement(By.name("last_name")).sendKeys("vijay");
			driver.findElement(By.name("email")).sendKeys("jakkawar@gmail.com");
			driver.findElement(By.name("phone")).sendKeys("5845891234");
			driver.findElement(By.name("address")).sendKeys("ameerpet 500073");
			driver.findElement(By.name("city")).sendKeys("hyderabad");
			Select se = new Select(driver.findElement(By.name("state")));
			se.selectByVisibleText("Arizona");
			driver.findElement(By.name("zip")).sendKeys("50000");
			driver.findElement(By.name("website")).sendKeys("vijay@123");
			driver.findElement(By.name("hosting")).click();
			driver.findElement(By.name("comment")).sendKeys("this is my first project");
			driver.findElement(By.className("btn btn-default")).click();
			
			
		}
		
		
	
	@AfterTest
	public void TearDown()
	{
		driver.quit();
	}
		
		
		
		

	}


