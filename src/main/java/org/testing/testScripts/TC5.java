package org.testing.testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testing.base.Base;
import org.testng.annotations.Test;

public class TC5 extends Base {
	
	@Test
	public void testCase5() throws InterruptedException
	{
		WebElement vdo = driver.findElement(By.id(pr.getProperty("video")));
		vdo.click();
		Thread.sleep(5000);
		
		WebElement subscribe = driver.findElement(By.xpath(pr.getProperty("subscribe1")));
		subscribe.click();
		
		
	}

	
}
