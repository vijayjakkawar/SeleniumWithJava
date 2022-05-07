package ExtentReport;

import java.io.File;
import java.io.IOException;
import java.sql.Date;
import java.text.SimpleDateFormat;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentReporter;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.aventstack.extentreports.util.Assert;

public class nopCommerceTest {
	

	public WebDriver driver;
	 public ExtentSparkReporter htmlReporter;
	 public ExtentReports extent;
	 public ExtentTest test;

	 @BeforeTest
	 public void setExtent() {
	  // specify location of the report
	  htmlReporter = new ExtentSparkReporter(System.getProperty("user.dir") + "/test-output/myReport.html");

	  htmlReporter.config().setDocumentTitle("Automation Report"); // Tile of report
	  htmlReporter.config().setReportName("Functional Testing"); // Name of the report
	  htmlReporter.config().setTheme(Theme.DARK);
	  
	  extent = new ExtentReports();
	  extent.attachReporter(htmlReporter);
	  
	  // Passing General information
	  extent.setSystemInfo("Host name", "localhost");
	  extent.setSystemInfo("Environemnt", "QA");
	  extent.setSystemInfo("user", "pavan");
	 }

	 @AfterTest
	 public void endReport() {
	  extent.flush();
	 }

	 @BeforeMethod
	 public void setup() {
		 System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\drivers\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("http://demo.nopcommerce.com/");
	 }

	 //Test1
	 @Test
	 public void noCommerceTitleTest(String name) {
	  test = extent.createTest("noCommerceTitleTest");
	  String title = driver.getTitle();
	  System.out.println(title);
	//  Assert.assertEquals(title, "eCommerce demo store");
	 }

	 //Test2
	 @Test
	 public void noCommerceLogoTest(String name) {
	  test = extent.createTest("noCommerceLogoTest");
	  boolean Logo = driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']")).isDisplayed();
	//  Assert.assertTrue(Logo);
	 }

	 //Test3
	 @Test
	 public void noCommerceLoginTest() {
	  test = extent.createTest("noCommerceLoginTest");
	  
	  test.createNode("Login with Valid input");
	//  Assert.assertTrue(true);
	  
	  test.createNode("Login with In-valid input");
	//  Assert.assertTrue(true);
	 }
	  
	 @AfterMethod
	 public void tearDown(ITestResult result) throws IOException {
	  if (result.getStatus() == ITestResult.FAILURE) {
	   test.log(Status.FAIL, "TEST CASE FAILED IS " + result.getName()); // to add name in extent report
	   test.log(Status.FAIL, "TEST CASE FAILED IS " + result.getThrowable()); // to add error/exception in extent report
	   String screenshotPath = nopCommerceTest.getScreenshot(driver, result.getName());
	   test.addScreenCaptureFromPath(screenshotPath);// adding screen shot
	  } else if (result.getStatus() == ITestResult.SKIP) {
	   test.log(Status.SKIP, "Test Case SKIPPED IS " + result.getName());
	  }
	  else if (result.getStatus() == ITestResult.SUCCESS) {
	   test.log(Status.PASS, "Test Case PASSED IS " + result.getName());
	  }
	  driver.quit();
	 }
	 
	 public static String getScreenshot(WebDriver driver, String screenshotName) throws IOException {
	  String dateName = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date(0));
	  TakesScreenshot ts = (TakesScreenshot) driver;
	  File source = ts.getScreenshotAs(OutputType.FILE);
	  
	  // after execution, you could see a folder "FailedTestsScreenshots" under src folder
	  String destination = System.getProperty("user.dir") + "/Screenshots/" + screenshotName + dateName + ".png";
	  File finalDestination = new File(destination);
	  FileUtils.copyFile(source, finalDestination);
	  return destination;
	 }
	

}
