package JsExecuter;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalendarAndDatepicker {
	
	public static void main(String[] args) 
	{
	
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\drivers\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://demo.seleniumeasy.com/bootstrap-date-picker-demo.html");
		
		WebElement date =driver.findElement(By.xpath("//*[@id=\"sandbox-container1\"]/div/input"));
		String  dateVal= "28-02-2022";
		CalendarAndDatepicker.selectDate(date, driver, dateVal);
		
		
	}
	
		
		
		public static void selectDate(WebElement element, WebDriver driver , String dateVal)
		{
			JavascriptExecutor js =((JavascriptExecutor)driver);
			js.executeScript("arguments[0].setAttribute('value','"+dateVal+"');", element);
		}
		
		
		
		
		
		
		
	}


