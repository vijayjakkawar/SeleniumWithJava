package com.qa.google.test;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitConditions {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\drivers\\chromedriver.exe");
		// Creating driver instance
		WebDriver driver = new ChromeDriver();

		driver.get("https://demo.seleniumeasy.com/jquery-download-progress-bar-demo.html");
		driver.manage().window().maximize();
		// driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebElement dwnldButton = driver.findElement(By.xpath("//button[text()='Start Download']"));
		dwnldButton.click();
		String message;
		WebDriverWait wait = new WebDriverWait(driver, 5);
		long starttime = System.currentTimeMillis();
		try {

			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='Complete!']")));
			message = driver.findElement(By.xpath("//div[text()='Complete!']")).getText();
		} catch (TimeoutException e) {
			System.out.println(e.getMessage());
			message = "Not Complete";
		}
		long endtime = System.currentTimeMillis();
		System.out.println((endtime - starttime) / 1000);

		if (message.equals("Complete!")) {
			System.out.println("downloaded successfully!");
		}

		else {
			System.out.println("not downloaded successfully!");
		}

	}
}
