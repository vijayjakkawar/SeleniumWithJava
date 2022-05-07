package AlertsAndExceptions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectTypes {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://demo.seleniumeasy.com/jquery-dropdown-search-demo.html");

		// single select box

		driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[1]/div/div[2]/span/span[1]/span")).click();
		WebElement country = driver.findElement(By.xpath("/html/body/span/span/span[1]/input"));
		country.sendKeys("india");
		country.sendKeys(Keys.ENTER);

		// multiple select box (search and select)
		WebElement state = driver.findElement(By.className("select2-search__field"));
		state.sendKeys("alaska");
		state.sendKeys(Keys.ENTER);
		state.sendKeys("colo");
		state.sendKeys(Keys.ENTER);
		state.sendKeys("dela");
		state.sendKeys(Keys.ENTER);
		
		

	}

}
