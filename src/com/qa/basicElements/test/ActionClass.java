package com.qa.basicElements.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClass {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
		
		driver.get("https://demo.seleniumeasy.com/basic-first-form-demo.html");

		/*
		 * // normal way to sendkeys in text box 
		 * WebElement txtBox = driver.findElement(By.xpath("//input[@id='user-message']"));
		 * txtBox.sendKeys("vijay");
		 */

		// clicking Nothanks on pop up window
		WebElement NoThanks = driver.findElement(By.xpath("//*[@id=\"at-cv-lightbox-button-holder\"]/a[2]"));
		NoThanks.click();

		// by using actions class sending keys
		
		 Actions action = new Actions(driver);
		 WebElement txtBox = driver.findElement(By.xpath("//input[@id='user-message']"));

		// build().perform() is used to perform multipkle actions and sending Capital Letters
	
	//	action.moveToElement(txtBox).click().keyDown(Keys.SHIFT).sendKeys("rajesh").keyUp(Keys.SHIFT).build().perform();
		
		// to all the text from text box (i.e contral a key word)
	//	action.moveToElement(txtBox).keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.SHIFT).build().perform();
		
	// to perform single action no need to use build()
		
     action.moveToElement(txtBox).click().sendKeys("vijay").build().perform();
	
		

	}

}
