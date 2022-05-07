package datePicker;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePickerDemo {

	public static void main(String[] args) throws InterruptedException {

		String month = "March 2023";
		String day = "23";
		String month1 = "April 2019";
		String day1 = "15";

		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://demo.seleniumeasy.com/bootstrap-date-picker-demo.html");

		// 1. direct sending values in the calender
		// driver.findElement(By.className("form-control")).sendKeys("23/03/2023");
		

		// 2. capturaing the values and travelling to the desired month year and date

		driver.findElement(By.xpath("//body/div[2]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/input[1]")).click();
		Thread.sleep(3000);

		while (true) {
			String monthyearval = driver.findElement(By.className("datepicker-switch")).getText();

			if (monthyearval.equals(month)) {
				break;
			} else {
				driver.findElement(By.className("next")).click();
			}

		}
		
		driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[1]/table[1]/tbody[1]/tr/td[contains(text(), "+day+")]"))
				.click();

		//  practise perpose
		
		driver.findElement(By.xpath("//body/div[2]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/input[2]")).click();
		
		while(true)
		{
			String monthvalue =driver.findElement(By.xpath("(//th[@class='datepicker-switch'])[1]")).getText();
			
			if(monthvalue.equals(month1))
			{
				break;
			}
			else
			{
				driver.findElement(By.className("prev")).click();
			}
			
		}
		
		driver.findElement(By.xpath("/html/body/div[3]/div[1]/table/tbody/tr/td[contains(text(), "+day1+")]")).click();
		
		
		// 3. another type or apporch of datepicker
		
		
		
	}

}
