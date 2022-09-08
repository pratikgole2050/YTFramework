package org.testing.pages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {
	
	ChromeDriver driver;
	Properties pr;
	public Login(ChromeDriver driver ,Properties pr) 
	{
		this.driver=driver;
		this.pr=pr;
	}
	
//	By lgn	  =By.xpath(pr.getProperty("login"));
//	By usrname=By.xpath(pr.getProperty("UserName"));
//	By nxt=By.xpath(pr.getProperty("nxtButton"));
//	By psw=By.xpath(pr.getProperty("Password"));
//	By nxtbtn=By.xpath(pr.getProperty("nxtButton"));
	
	
	public void singin(String username,String password) throws InterruptedException
	{
		driver.findElement(By.xpath(pr.getProperty("login"))).click();
		//driver.findElement(lgn).click();
		
		driver.findElement(By.xpath(pr.getProperty("UserName"))).sendKeys(username);
		//driver.findElement(usrname).sendKeys(username);
		
		driver.findElement(By.xpath(pr.getProperty("nxtButton"))).click();
		//driver.findElement(nxt).click();
		Thread.sleep(10000);
		
		driver.findElement(By.xpath(pr.getProperty("Password"))).sendKeys(password);
		//driver.findElement(psw).sendKeys(password);
		Thread.sleep(4000);
		
		driver.findElement(By.xpath(pr.getProperty("nxtButton"))).click();
		//driver.findElement(nxtbtn).click();
		Thread.sleep(4500);
	}

}
