package pkg1;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ControlKeyPractice {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "../Selenium/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.youtube.com/");
		driver.manage().window().maximize();
		WebElement vdo=driver.findElement(By.id("video-title"));
		Actions ac = new Actions(driver);
		ac.keyDown(Keys.CONTROL).click(vdo).keyUp(Keys.CONTROL).build().perform();
		System.out.println("Before switching url is "+driver.getCurrentUrl());
		Set<String> allWindow=driver.getWindowHandles();
		String fstTab=driver.getWindowHandle();
		System.out.println(allWindow.size());
		for(String s:allWindow)
		{
			driver.switchTo().window(s);
		}
		System.out.println("after Switching url is "+driver.getCurrentUrl());
		driver.switchTo().window(fstTab);
		System.out.println(driver.getCurrentUrl()); 
	}

}
