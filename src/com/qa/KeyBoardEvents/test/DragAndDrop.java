package com.qa.KeyBoardEvents.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://testautomationpractice.blogspot.com/");
		
		 WebElement From = driver.findElement(By.xpath("//p[normalize-space()='Drag me to my target']"));
		 WebElement To = driver.findElement(By.xpath("//div[@id='droppable']"));
		 
		 Actions action = new Actions(driver); 
	
	
	//	action.clickAndHold(From).moveToElement(To).release().build().perform();
		action.dragAndDrop(From, To).build().perform();
		
	}

	
	
}
