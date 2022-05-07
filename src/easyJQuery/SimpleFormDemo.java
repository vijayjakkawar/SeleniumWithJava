package easyJQuery;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class SimpleFormDemo extends jQueryBase {

	@Test
	public void validatesimpleForm()

	{
		// validation of single text box
		driver.findElement(By.linkText("Input Forms")).click();
		driver.findElement(By.linkText("Simple Form Demo")).click();

		driver.findElement(By.id("user-message")).sendKeys("Hi..This Is Vijay");
		driver.findElement(By.xpath("//button[normalize-space()='Show Message']")).click();

		// validation of multiple textbox
		driver.findElement(By.id("sum1")).sendKeys("10");
		driver.findElement(By.id("sum2")).sendKeys("20");
		driver.findElement(By.xpath("//*[@id=\"gettotal\"]/button")).click();

	}

}
