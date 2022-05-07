package com.qa.KeyBoardEvents.test;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class HanlingMultipleTabs {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		String parentTab = driver.getWindowHandle();
		
		  Actions action = new Actions(driver);  
		  
		  WebElement gmailLink =driver.findElement(By.xpath("//*[@id=\"gb\"]/div/div[1]/div/div[1]/a"));
		  
		  action.moveToElement(gmailLink).keyDown(Keys.CONTROL).click().build().perform();
		  Set<String> childTab = driver.getWindowHandles(); 
		  for (String child :childTab) 
		  if (child.equals(parentTab)) 
		  { driver.switchTo().window(parentTab);
		    driver.close();
		  }
		 
		
		

	}

}
