package easyJQuery;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BasicValidations  extends jQueryBase{
	
	@Test(priority=1)
	public void validateLogo()
	{
		boolean Logo = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[1]/a/img")).isDisplayed();
		Assert.assertTrue(Logo);
	}
	
	@Test(priority=2)
	public void validateTitle()
	{
		String Titte = driver.getTitle();
		Assert.assertEquals(Titte, "Selenium Easy - Best Demo website to practice Selenium Webdriver Online");
	}
	
	@Test(priority=3)
	public void validatePageSource()
	{
		String PSource = driver.getPageSource();
		System.out.println(PSource);
	}
	
	
	

	@Test(priority = 4)
	
	public void validateCheckBox() {
		
		driver.navigate().to("https://demo.seleniumeasy.com/basic-checkbox-demo.html");
		WebElement Chechbox = driver.findElement(By.xpath("//*[@id=\"isAgeSelected\"]"));
		if (!Chechbox.isSelected()) {
			Chechbox.click();
			System.out.println("chech box is selected");
			
		}
	}
		
		@Test(priority = 5)
		public void validateDropDownBox()
		{
			driver.navigate().to("https://demo.seleniumeasy.com/basic-select-dropdown-demo.html");
			Select sc = new Select(driver.findElement(By.xpath("//select[@id='select-demo']")));
			sc.selectByIndex(2);
			System.out.println("drop down box is selected");
			
		}
		
	
		@Test(priority = 6)
		public void ListBox() {
			
			
			driver.navigate().to("https://demo.seleniumeasy.com/jquery-dual-list-box-demo.html");
			
			driver.findElement(By.xpath("//option[normalize-space()='Alice']")).click();
			driver.findElement(By.xpath("//button[@class='pAdd btn btn-primary btn-sm']")).click();		
			driver.findElement(By.xpath("//option[normalize-space()='Manuela']")).click();
			driver.findElement(By.xpath("//button[@class='pAdd btn btn-primary btn-sm']")).click();		
			driver.findElement(By.xpath("//option[normalize-space()='Luiza']")).click();
			driver.findElement(By.xpath("//button[@class='pAdd btn btn-primary btn-sm']")).click();		
				
			System.out.println("list is added");
		}
		
	
		
	}

