package org.testing.testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testing.base.Base;
import org.testng.annotations.Test;

public class TC4 extends Base {
	
	@Test
	public void testCase4() throws InterruptedException
	{
		Thread.sleep(4000);
		WebElement vdo = driver.findElement(By.id(pr.getProperty("video")));
		vdo.click();
		Thread.sleep(5000);
		
		WebElement like = driver.findElement(By.xpath(pr.getProperty("Like")));
		like.click();
		
		Thread.sleep(5000);
		
		WebElement dislike = driver.findElement(By.xpath(pr.getProperty("Dislike")));
		dislike.click();
		Thread.sleep(4000);
		
	}

}
