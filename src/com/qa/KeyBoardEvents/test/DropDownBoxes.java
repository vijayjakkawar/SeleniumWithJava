package com.qa.KeyBoardEvents.test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownBoxes {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://demo.seleniumeasy.com/basic-select-dropdown-demo.html");
		
		WebElement SelectDay = driver.findElement(By.xpath("//*[@id=\"select-demo\"]"));
		
		Select select = new Select(SelectDay);
		select.selectByIndex(3);
		System.out.println("Day is selected");
		Thread.sleep(3000);
	
		
     driver.close();
	}

}
