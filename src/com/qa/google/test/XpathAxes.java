package com.qa.google.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathAxes {

	public static void main(String[] args) {

		// path setting for webdriver
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\drivers\\chromedriver.exe");
		// Creating driver instance
		WebDriver driver = new ChromeDriver();
		// navigating to desired url or opening the url
		driver.get("https://money.rediff.com/gainers");
		// maximizing the window web page 
		driver.manage().window().maximize();

		// self node
		String SelfNode = driver.findElement(By.xpath("//a[contains(text(),'Black Box')]")).getText();
		System.out.println(SelfNode);

		// parent node  (we can use either syntax 1 or syntax 2)
		// syntax 1 (here we need to add /parent to navigate to parent node)
		String ParentNode1 = driver.findElement(By.xpath("//a[contains(text(),'Black Box')]/parent::td")).getText();
		System.out.println(ParentNode1);
		
		// syntax 2 (here we need to add /.. to navigate to parent node)
		String ParentNode2 = driver.findElement(By.xpath("//a[contains(text(),'Black Box')]/..")).getText();
		System.out.println(ParentNode2);
		
		// child node 
		List childs=driver.findElements(By.xpath("//a[contains(text(),'Black Box')]/ancestor::tr/child::td"));
		System.out.println("number of child nodes are "+childs.size());
		
		// Ancestor node (we can use either syntax 1 or syntax 2)
		// syntax 1
		String ancestor1=driver.findElement(By.xpath("//a[contains(text(),'Black Box')]/ancestor::tr/child::td/parent::tr")).getText();
		System.out.println(ancestor1);
		
		// syntax 2
		String ancestor2=driver.findElement(By.xpath("//a[contains(text(),'Black Box')]/ancestor::tr/child::td/..")).getText();
		System.out.println(ancestor2);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		driver.quit();
	}

}
