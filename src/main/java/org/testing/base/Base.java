package org.testing.base;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testing.pages.Logout;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Base {
	public ChromeDriver driver;
	public  Properties pr ;
	
	@BeforeMethod
	public void init() throws InterruptedException, IOException
	{
		File f = new File("../YTFramework/Objects.properties");
		FileReader fr = new FileReader(f);
		pr = new Properties(); 
		pr.load(fr);
		System.setProperty("Webdriver.chrome.driver","../YTFramework/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.youtube.com/");
		//driver.manage().window().maximize();
		driver.manage().window().fullscreen();
		//Thread.sleep(5000);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	}
	
	@AfterMethod
	public void bswclose() throws InterruptedException
	{	
//		WebElement lg=driver.findElement(By.xpath(pr.getProperty("lg")));
//		lg.click();
//		
//		WebElement signout = driver.findElement(By.xpath(pr.getProperty("signout")));
//		signout.click();
		
		driver.close();
		driver.quit();
	}

}
