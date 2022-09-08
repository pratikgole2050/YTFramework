package pkg1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment2 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","../Selenium/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://qa.Way2Automation.com/");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@type=\"text\" and @name=\"name\"]")).sendKeys("pratik");
		driver.findElement(By.xpath("//input[@type=\"tel\" and @name=\"phone\"]")).sendKeys("7350202073");
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//*[@value=\"Submit\"])[1]")).click();

	}

}
