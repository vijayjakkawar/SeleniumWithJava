package datePicker;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TableDemo {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		
		WebElement Admin =driver.findElement(By.id("menu_admin_viewAdminModule"));
		WebElement UserManagement =driver.findElement(By.id("menu_admin_UserManagement"));
		WebElement User =driver.findElement(By.id("menu_admin_viewSystemUsers"));
		
		Actions action = new Actions(driver);
		action.moveToElement(Admin).moveToElement(UserManagement).moveToElement(User).click().build().perform();

		WebElement table =driver.findElement(By.id("resultTable"));
		WebElement tbody =table.findElement(By.tagName("tbody"));
	//	List<WebElement> throw =table.findElements(By.tagName("tr"));
		List<WebElement> tbrows =tbody.findElements(By.tagName("tr"));
		
		System.out.println(tbrows.size());
		for(WebElement  rows:tbrows)
		{
			System.out.println(rows.getText());
			List<WebElement> cols =rows.findElements(By.tagName("td"));
			System.out.println(cols.size());
			
			for(int i=1; i<cols.size(); i++)
			{
				if(i==1)
				{
					driver.findElement(By.id("ohrmList_chkSelectRecord_53")).click();
				}
			}
			
		}
		
		
	}

}
