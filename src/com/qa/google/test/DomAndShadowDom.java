package com.qa.google.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DomAndShadowDom {

	public static void main(String[] args) {
		// path setting for webdriver
				System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\drivers\\chromedriver.exe");
				// Creating driver instance
				WebDriver driver = new ChromeDriver();
				// navigating to desired url or opening the url
				driver.get("https://books-pwakit.appspot.com/");
				// maximizing the window web page 
				driver.manage().window().maximize();
				
				driver.findElement(By.xpath("//input[@id='input']")).sendKeys("rich");
		
		
		

	}

}
