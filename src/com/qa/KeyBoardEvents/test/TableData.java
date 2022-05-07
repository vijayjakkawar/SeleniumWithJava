package com.qa.KeyBoardEvents.test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableData {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://demo.seleniumeasy.com/table-pagination-demo.html");
		
		WebElement Table = driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/section/div/table"));
		List<WebElement> Thead = Table.findElements(By.tagName("th"));
		for(WebElement h:Thead)
			System.out.println(h.getText());
	List<WebElement> trow = Table.findElements(By.tagName("tr"));
	     for(int i=1;i<=trow.size()-1; i++)
	     {
	    List<WebElement> tcols = trow.get(i).findElements(By.tagName("td"));
	    	for(WebElement col: tcols)
	    		System.out.println(col.getText());
	     }  
		driver.findElement(By.xpath("//a[normalize-space()='2']")).click();
		 for(int i=1;i<=trow.size()-1; i++)
	     {
	    List<WebElement> tcols = trow.get(i).findElements(By.tagName("td"));
	    	for(WebElement col: tcols)
	    		System.out.println(col.getText());
	     }  
		
		driver.close();
		
	}

}
