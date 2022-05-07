package com.qa.KeyBoardEvents.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandlingMultipleTabsEx1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://demo.seleniumeasy.com/basic-first-form-demo.html");
		WebElement noThanks = driver.findElement(By.xpath("//*[@id=\"at-cv-lightbox-button-holder\"]/a[2]"));
		noThanks.click();
		String parentTab = driver.getWindowHandle();

		WebElement DatePicker = driver
				.findElement(By.xpath("//a[@class='dropdown-toggle'][normalize-space()='Date pickers']"));
		DatePicker.click();
		WebElement BootsTrap = driver
				.findElement(By.xpath("//a[@class='dropdown-toggle'][normalize-space()='Date pickers']"));
		WebElement Jquery = driver
				.findElement(By.xpath("//ul[@class='dropdown-menu']//a[normalize-space()='JQuery Date Picker']"));
		Actions act = new Actions(driver);
		act.moveToElement(BootsTrap).keyDown(Keys.CONTROL).click().build().perform();
	//	driver.switchTo().window(parentTab);
	//	act.moveToElement(Jquery).keyDown(Keys.CONTROL).click().build().perform();
	}

}
