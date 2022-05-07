package easyJQuery;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RadioButtons extends jQueryBase {
	
	
	@Test
	public void validateRadioButton()
	{
		driver.findElement(By.linkText("Input Forms")).click();
		driver.findElement(By.xpath("//li[@class='tree-branch']//ul//li//a[normalize-space()='Radio Buttons Demo']")).click();
		
		driver.findElement(By.xpath("//label[normalize-space()='Male']//input[@name='optradio']")).click();
		driver.findElement(By.xpath("//button[@id='buttoncheck']")).click();
		
		WebElement ShowMsg = driver.findElement(By.xpath("//*[@id=\"easycont\"]/div/div[2]/div[1]/div[2]/p[3]"));
		//Assert.assertEquals(ShowMsg, " 'Male' is checked");
	}

}
