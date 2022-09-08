package org.testing.testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testing.base.Base;
import org.testng.annotations.Test;

public class TC6 extends Base {
	
	@Test
	public void testCase6() throws InterruptedException {
		
		WebElement vdo = driver.findElement(By.id(pr.getProperty("video")));
		vdo.click();
		Thread.sleep(5000);
		
		Thread.sleep(6000);
		WebElement comment = driver.findElement(By.xpath(pr.getProperty("comment")));
		comment.sendKeys("NOICE");
		
		Thread.sleep(5000);
		WebElement send = driver.findElement(By.xpath(pr.getProperty("commentButton")));
		send.click();
	}

}
