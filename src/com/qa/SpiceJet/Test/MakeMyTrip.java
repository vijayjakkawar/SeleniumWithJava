package com.qa.SpiceJet.Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MakeMyTrip {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.makemytrip.com/");

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", driver.findElement(By.xpath("//label[@for='fromCity']")));
		// from 
		driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys("Hyderabad");
		js.executeScript("arguments[0].click()",driver.findElement(By.xpath("(//p[text()='Hyderabad, India'])[1]")));
		// to
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div[1]/div[2]/div[1]/div/div/div[1]/input")).sendKeys("mumb");
		js.executeScript("arguments[0].click();",driver.findElement(By.xpath("//p[normalize-space()='Chhatrapati Shivaji International Airport']")));
		
		
	}

}
