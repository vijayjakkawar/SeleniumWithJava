package com.qa.google.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleTest {

	
	public static void main(String[] args) {
		// 1. Setting System Properties (firefox.driver)

		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\drivers\\chromedriver.exe");

		// Creating driver instance
		WebDriver driver = new ChromeDriver();
		driver.get("https://google.com/");
/*
		// to get the url of the google
		String url = driver.getCurrentUrl();
		System.out.println(url);
		// to get title of the google
		String title = driver.getTitle();
		System.out.println(title);
		// to get source code
		String pgSource = driver.getPageSource();
		System.out.println(pgSource);
*/
		
		
	/*
		// to get all webelements & storing in List Using for Each Loop
		
		List<WebElement> Links = driver.findElements(By.tagName("a"));
		for(WebElement Link:Links)
		{
			System.out.println(Link.getText());
		}  

	*/
		
		
	/*	
		// to get all webelements & storing in List Using for Iterator
		List<WebElement> Links = driver.findElements(By.tagName("a"));
		
		Iterator<WebElement>  Link= Links.iterator();
				
				while(Link.hasNext())
				{
					System.out.println(Link.next().getText());
				}
	*/		
		
/*
		// to navigate next website
		driver.navigate().to("https://www.flipkart.com/");
		// to navigate to previous web site
		driver.navigate().back();
		// to navigate forward and backword
		driver.navigate().forward();
		// to refresh the page
		driver.navigate().refresh();
		// to close the web site automatically
		driver.quit(); // this command closes all the tabs at a time

		// driver.close(); this command closes the last tabs
		  
		 
*/
	}
	
}
