package com.qa.basicElements.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
	
		driver.get("https://demo.seleniumeasy.com/basic-checkbox-demo.html");
	
		  // check box WebElement CheckBox =
		WebElement CheckBox = driver.findElement(By.xpath("//input[@id='isAgeSelected']"));
		  if(!CheckBox.isSelected()) CheckBox.click();
		  	 
		
		
		
	}

}
