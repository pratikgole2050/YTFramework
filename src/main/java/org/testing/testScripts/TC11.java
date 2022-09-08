package org.testing.testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC11 {
	ChromeDriver driver;
	
	@BeforeMethod
	public void web() throws InterruptedException
	{
	System.setProperty("webdriver.chrome.driver", "../YTFramework/chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("https://www.youtube.com/");
	driver.manage().window().maximize();
	Thread.sleep(5000);
	}
	
	
	@Test
	public void lgn() throws InterruptedException
	{	
		WebElement lgn = driver.findElement(By.xpath("//*[text()=\"Sign in\"]"));
		lgn.click();
		
		WebElement em = driver.findElement(By.xpath("//*[@type=\"email\"]"));
		em.sendKeys("99.test.99.automation@gmail.com");
		
		WebElement nxt = driver.findElement(By.xpath("//*[text()=\"Next\"]"));
		nxt.click();
		Thread.sleep(3500);
		
		WebElement psw = driver.findElement(By.xpath("//input[@type=\"password\"]"));
		psw.sendKeys("99.test.99");
		
		WebElement nxt1 = driver.findElement(By.xpath("//*[text()=\"Next\"]"));
		nxt1.click();
		
		Thread.sleep(3000);
		WebElement tr = driver.findElement(By.xpath("//*[@*=\"Explore\"][1]"));
		tr.click();
		
//		Actions sc = new Actions(driver);
		WebElement lg=driver.findElement(By.xpath("//button[@id=\"avatar-btn\"]"));
//		Thread.sleep(3000);
//		for(int i=0;i<5;i++)
//		{
//		sc.sendKeys(Keys.TAB).perform();
//		}
//		Thread.sleep(3000);
		lg.click();
		
		Thread.sleep(3000);
		WebElement signot=driver.findElement(By.xpath("//*[text()=\"Sign out\"]"));
		signot.click();
		Thread.sleep(3000);
		
		
	}
	@AfterMethod
	public void bswclose()
	{	

		driver.close();
		//driver.quit();
	}

}
