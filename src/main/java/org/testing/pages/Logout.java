package org.testing.pages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Logout {
	
	ChromeDriver driver;
	Properties pr;
	public Logout(ChromeDriver driver,Properties pr) 
	{
		this.driver=driver;
		this.pr=pr;
	}
	
	public void logout() throws InterruptedException
	{
		WebElement lg=driver.findElement(By.xpath(pr.getProperty("lg")));
		lg.click();
		Thread.sleep(4500);
		
		WebElement signout = driver.findElement(By.xpath(pr.getProperty("signout")));
		signout.click();
	}

}
