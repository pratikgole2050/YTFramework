package testCases;

import org.testng.annotations.*;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Testcase12 {
	
	//public static ExtentReports extent;
	//public static ExtentSparkReporter spark;
	//public static ExtentTest test;
	
	ExtentReports extent = new ExtentReports();
	ExtentSparkReporter spark = new ExtentSparkReporter("ExtentReport.html");
	
	@BeforeTest
	public void beforeTest()
	{

		extent.attachReporter(spark);
	}
	
	@Test
	public void test()
	{
		ExtentTest test=extent.createTest("launch browser").assignAuthor("pratik").assignCategory("Sanity")
				.assignDevice("chrome");
		test.log(Status.PASS, "user laucnh the browser");
		test.pass("user laucnh the browser verified");
		test.warning("check username");
	}
	
	@Test
	public void test1()
	{
	    ExtentTest test=extent.createTest("login application");
		test.log(Status.FAIL, "user login the application");
		test.fail("check username and password");
	}
	
	@Test
	public void test2()
	{
		ExtentTest test=extent.createTest("create customer");
		test.log(Status.SKIP, "user create a customer");
		test.skip("customer created");
	}
	
	@Test
	public void test3()
	{
		ExtentTest test=extent.createTest("create subscriber");
		test.log(Status.WARNING, "user created subscriber");
		test.warning("subscriber created suscessfully");
	}
	
	@Test
	public void test4()
	{
		ExtentTest test=extent.createTest("logout application");
		test.log(Status.INFO, "Logout application");
		test.info("user log offed successfully");
	}
	
	@AfterTest
	public void afterTest()
	{
		extent.flush();
	}
	

}
