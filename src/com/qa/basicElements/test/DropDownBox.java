package com.qa.basicElements.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownBox {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();		
		driver.get("https://demo.seleniumeasy.com/basic-select-dropdown-demo.html");
		
	WebElement	SelectDay = driver.findElement(By.xpath("//select[@id='select-demo']"));
		Select sc = new Select(SelectDay);
	//	sc.selectByIndex(1);
	//	sc.selectByValue("Monday");
		sc.selectByVisibleText("Tuesday");
		
	}

}
