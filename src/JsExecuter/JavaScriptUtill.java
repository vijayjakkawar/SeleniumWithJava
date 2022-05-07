package JsExecuter;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JavaScriptUtill {

	public static void flash(WebElement element, WebDriver driver) throws InterruptedException {
		String bgcolour = element.getCssValue("");

		for (int i = 0; i < 50; i++) {
			changeColor("#000000", element, driver);
			changeColor(bgcolour, element, driver);
		}
	}

	public static void changeColor(String color, WebElement element, WebDriver driver) throws InterruptedException {
		
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("arguments[0].style.backgroundColor = '" + color + "'", element);
        Thread.sleep(20);
        
	}

	public static void drawBorder(WebElement element, WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);

		js.executeScript("arguments[0].style.border='3px solid red '", element);
	}

	public static String getTitleByJs(WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		String title = js.executeScript("return document.title;").toString();
		return title;
	}

	public static void clickElementByJs(WebElement element, WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("arguments[0].click();", element);

	}

	// manuallty generation of alert message

	public static void generateAlert(WebDriver driver, String message)

	{
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("alert('" + message + "')");

	}

	public static void refreshBrowserByJs(WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("history.go(0)");
	}

	public static void scrollIntoView(WebDriver driver, WebElement image) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("arguments[0].scrollIntoView(true);", image);
	}

	public static void scrollTillBottom(WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	}

}
