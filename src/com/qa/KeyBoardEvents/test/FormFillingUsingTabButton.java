package com.qa.KeyBoardEvents.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class FormFillingUsingTabButton {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://demo.seleniumeasy.com/input-form-demo.html");
		
		
		driver.findElement(By.name("first_name")).sendKeys("jakkawar");
		Actions act = new Actions(driver);
		
		
		act.sendKeys(Keys.TAB).sendKeys("vijay");
		act.sendKeys(Keys.TAB).sendKeys("vijay@gmail.com");
		act.sendKeys(Keys.TAB).sendKeys("950258");
		act.sendKeys(Keys.TAB).sendKeys("nizamabad");
		act.sendKeys(Keys.TAB).sendKeys("hyderabad");
		Select sc = new Select(driver.findElement(By.xpath("//select[@name='state']")));
		sc.selectByVisibleText("Arizona");
		act.sendKeys(Keys.TAB).sendKeys("500073");
		act.sendKeys(Keys.TAB).sendKeys("ecommerce");
		act.sendKeys(Keys.TAB).click();
		act.sendKeys(Keys.TAB).sendKeys("login test");
		act.sendKeys(Keys.TAB).click().build().perform();
		
		
		

		
	}

}
