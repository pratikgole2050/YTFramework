package org.testing.pages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomePage {
	
	ChromeDriver driver;
	Properties pr;
	public HomePage(ChromeDriver driver ,Properties pr) 
	{
		this.driver=driver;
		this.pr=pr;
	}
	
	public void clickHistory() 
	{
		driver.findElement(By.xpath(pr.getProperty("toggle"))).click();;
		
		driver.findElement(By.xpath(pr.getProperty("history"))).click();
	}
	
	
	public void clickTrending() 
	{
		driver.findElement(By.xpath(pr.getProperty("explore"))).click();
	}
	
	public void clickSubscription()
	{
		driver.findElement(By.xpath(pr.getProperty("subscriptions"))).click();
	}
	
	public void clickLibrary() throws InterruptedException
	{
		driver.findElement(By.xpath(pr.getProperty("library"))).click();
	}
	
	public void clickWatchLater() throws InterruptedException
	{
		driver.findElement(By.xpath(pr.getProperty("watchLater"))).click();
	}

}
