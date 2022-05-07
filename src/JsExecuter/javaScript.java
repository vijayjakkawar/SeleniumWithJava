package JsExecuter;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class javaScript {

	public static void main(String[] args) throws InterruptedException, IOException {
		

		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\drivers\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.twoplugs.com/");
		
		// flashing an element
/*	
		WebElement joinfree = driver.findElement(By.xpath("//ul[@class='control-bar']//li[2]//a[1]"));
		
		// directly calling flash method which is present in javaScriptUtill class bcoz it is a static method
		// no need to create object 
		JavaScriptUtill.flash(joinfree, driver);
		
		// drawing border to the perticular element and taking ScreenShot 
		
		
		// drawing border
		JavaScriptUtill.drawBorder(joinfree, driver);
		
		
		// taking screenshot
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File trg  = new File("D:\\Sikuli pics\\twoplug.png");
		
		FileUtils.copyFile(src , trg);
		
		
		// capture the title of the page
		
		  // System.out.println(driver.getTitle());
		
		String title = JavaScriptUtill.getTitleByJs(driver);
		
		System.out.println(title);
	*/	
		
/*		
		// clicking on element
		WebElement login =driver.findElement(By.xpath("/html[1]/body[1]/div[1]/header[1]/div[1]/ul[1]/li[1]/a[1]/span[1]"));
		// login.click();
		JavaScriptUtill.clickElementByJs(login, driver);
		
		// generating alert message manually
		JavaScriptUtill.generateAlert(driver, "you clicked on login button");
		
		// refreshing the browser 
		  //  driver.navigate().refresh();
		 
		JavaScriptUtill.refreshBrowserByJs(driver);
		
*/	
/*	
		// scrolling down the page till our desired element 
		WebElement image = driver.findElement(By.xpath("//*[@id=\"rslides3_s0\"]/div[1]/img"));
		JavaScriptUtill.scrollIntoView(driver, image);
*/		
		// scrolling the page complete down
		JavaScriptUtill.scrollTillBottom(driver);
		
		
		
	}

}
