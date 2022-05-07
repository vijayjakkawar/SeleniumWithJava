package Sikuli;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class SikuliDemo {
	
	public WebDriver driver;
	Screen myScreen;
	
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://demo.opencart.com/");
	}
	
	
	public void verify()
	{
		myScreen=new Screen();
		
		Pattern p1= new Pattern("D:\\Sikuli pics\\Laptops.png");
		try {
			myScreen.wait(p1,5);
			myScreen.click(p1);
		} catch (FindFailed e) {
			
			e.printStackTrace();
		}
		
	}
	

	public static void main(String[] args) {
		SikuliDemo sd = new SikuliDemo();
		sd.setup();
		sd.verify();
		
		

	}

}
