package JsExecuter;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JsPractise {
	
	public static void main(String[] args) {
		
		System.setProperty("webelement.chrome.driver", "C:\\Program Files\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10 ,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://demo.opencart.com/");
		
		
		WebElement ChangeColor = driver .findElement(By.xpath("//a[normalize-space()='Your Store']"));
		
		JsPractiseUtil.changeColor(null, ChangeColor, driver);
				
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
