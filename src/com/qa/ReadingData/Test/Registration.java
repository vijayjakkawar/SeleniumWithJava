package com.qa.ReadingData.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Registration {

	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		
		FileInputStream file = new FileInputStream("C:\\Users\\hp\\Desktop\\testing study doc\\automation\\RegistrationForm.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		
		XSSFSheet sheet = workbook.getSheet("registration");
		int rowCount = sheet.getLastRowNum();
		int cellCount = sheet.getRow(0).getLastCellNum();
		
		for(int i=1; i<rowCount; i++)
		{
		XSSFRow	currentRow = sheet.getRow(i);
		
		// Geting the values from Execl and stroing the values in variables 
		
		String Fname = currentRow.getCell(0).getStringCellValue();
		String Lname = currentRow.getCell(1).getStringCellValue();
		String Phone = currentRow.getCell(2).getStringCellValue();		
		String Email = currentRow.getCell(3).getStringCellValue();		
		String Address = currentRow.getCell(4).getStringCellValue();		
		String City = currentRow.getCell(5).getStringCellValue();		
		String State = currentRow.getCell(6).getStringCellValue();		
	    String PostalCode =currentRow.getCell(7).getStringCellValue();		
		String Counrty = currentRow.getCell(8).getStringCellValue();		
		String Username = currentRow.getCell(9).getStringCellValue();		
		String Password = currentRow.getCell(10).getStringCellValue();		
		String Cpassword = currentRow.getCell(11).getStringCellValue();
		
		
		// entering the values to the form
		
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys(Fname);
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys(Lname);
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys(Phone);
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys(Email);
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys(Address);
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys(City);
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys(State);
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys(PostalCode);
		
		Select sc = new Select(driver.findElement(By.xpath("//input[@name='firstName']")));
		sc.selectByVisibleText(Counrty);
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys(Username);
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys(Password);
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys(Cpassword);
		
		// clicking on submmit button
		driver.findElement(By.xpath("//input[@name='submit']")).click();
		
		// validation 
		
		if (driver.getPageSource().contains("Thank you for registering."))
		{
			System.out.println("Registration is complete for " + i +"record ");
		}
		else
		{
			
		}
		System.out.println("Registration is failed for " + i +"record ");
		
		}
		
		
	}

}
