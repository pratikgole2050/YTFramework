package pkg1;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.ScreenshotException;
import org.openqa.selenium.support.ui.Select;

public class CaptureScreenShot {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		//Capturing Element ScreenShot
		System.setProperty("webdriver.chrome.driver","../Selenium/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://qa.Way2Automation.com/");
		Thread.sleep(5000);
		WebElement txt=driver.findElement(By.xpath("//input[@type=\"text\" and @name=\"name\"]"));
		txt.sendKeys("pratik");
		File txtScrn=txt.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(txtScrn, new File("./Screenshot/txt.jpg"));
		
		WebElement phone=driver.findElement(By.xpath("//input[@type=\"tel\" and @name=\"phone\"]"));
		phone.sendKeys("7350202073");
		
		File phn=phone.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(phn,new File("./Screenshot/phone.jpg"));
		Thread.sleep(5000);
		
		
		//capture visible area ScreenShot
		//WebDriver driver1 = new FirefoxDriver();
		File pageScreenshot=((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(pageScreenshot,new File("./Screenshot/pagescr.jpg"));
		
		
//		//capture Full page screenshot
//		WebElement fullpage=((TakesScreenshot) driver).getFullPageScreenShotAs(OutputType.FILE);
//		FileUtils.copyFile(fullpage,new File("./Screenshot/fullpage.jpg"));
		
		Screenshot screenshot=new AShot().takeScreenshot(drv); 
		

		  

	}

}
