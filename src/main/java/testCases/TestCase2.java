package testCases;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestCase2 {
	public static ExtentReports extent;
	public static ExtentTest test;
	
	
	@BeforeTest
	public static void startTest()
	{
		extent = new ExtentReports(System.setProperty("./report/extent.html", null));
	extent = new ExtentReports(System.getProperty("./reports/")+"\\ExtentReportResults.html");
	test = report.startTest("ExtentDemo");
	}
	
	@Test
	public void extentReportsDemo()
	{
	System.setProperty("webdriver.chrome.driver", "D:\\SubmittalExchange_TFS\\QA\\Automation\\3rdparty\\chrome\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.google.co.in");
	if(driver.getTitle().equals("Google"))
	{
	test.log(LogStatus.PASS, "Navigated to the specified URL");
	}
	else
	{
	test.log(LogStatus.FAIL, "Test Failed");
	}
	}
	@AfterTest
	public static void endTest()
	{
	report.endTest(test);
	report.flush();
	}
	
}
