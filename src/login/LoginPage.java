package login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginPage {
	
	
	WebDriver driver = new ChromeDriver();
    
	
	@Test
	public void validateLogin()
	{
	driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
	driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
	driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin123");
	driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
	}
	
	@Test
	public void validateForgotPwd()
	{
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		driver.findElement(By.xpath("//a[normalize-space()='Forgot your password?']")).click();
		driver.findElement(By.xpath("//input[@id='securityAuthentication_userName']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@id='btnSearchValues']")).click();
	}
	

}
