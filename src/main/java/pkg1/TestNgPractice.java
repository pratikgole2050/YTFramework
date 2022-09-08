package pkg1;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNgPractice {
	
	@BeforeSuite
	public void tc1()
	{
		System.out.println("Before suite");
	}
	
	@BeforeClass
	public void tc2()
	{
		System.out.println("Before class");
	}
	
	@BeforeTest
	public void tc3()
	{
		System.out.println("Before Test");
	}
	
	@BeforeMethod
	public void tc9()
	{
		System.out.println("Before method");
	}
	
//	@Test(priority=1)
//	public void tc4()
//	{
//		System.out.println("Test Annotation priority 1");
//	}
	
	@Test(priority=0)
	public void tc12()
	{
		System.out.println("Test Annotation priority 0");
	}
	
	@AfterSuite
	public void tc5()
	{
		System.out.println("After suite");
	}
	
	@AfterClass
	public void tc6()
	{
		System.out.println("After class");
	}
	
	@AfterTest
	public void tc7()
	{
		System.out.println("After Test");
	}
	
	@AfterMethod
	public void tc10()
	{
		System.out.println("After method");
	}
	
	
	

}
