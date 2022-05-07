package AssignmentProgram;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class program2 {
	
	
	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.dezlearn.com/webtable-example/");
		
		
		WebElement table =driver.findElement(By.xpath("//table[@class='tg']"));
		List<WebElement>rows= table.findElements(By.tagName("tr"));
		System.out.println(rows.size());
		
		for(int i=1; i<rows.size(); i++)
		{
		//	if(i==3)
		//	{
		//	String john =driver.findElement(By.xpath("//td[@class='tg-0lax']")).getText();
			
			List<WebElement> cols =rows.get(i).findElements(By.tagName("td"));
			
			for(int j=0; j<cols.size(); j++)
			{
				if (j==2 || j==3)
				{
					cols.get(j).findElement(By.tagName("input")).click();
				
				}
				if(j==4)
				{
					WebElement select =cols.get(j).findElement(By.tagName("select"));
					Select sc = new Select(select);
					sc.selectByIndex(1);
				}
				if(j==5)
					cols.get(j).findElement(By.tagName("input")).sendKeys("first comment");
			}
		}
		
	}

}
