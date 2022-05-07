package JsExecuter;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JsPractiseUtil {
	
	WebDriver driver;
	
	public static void changeColor(String color,WebElement element ,WebDriver driver)
	{
		JavascriptExecutor js =((JavascriptExecutor) driver);
		js.executeScript("arguments[0].style.backgroundColor='" + color +"'",element);
		
	}
	
	
	
	

}
