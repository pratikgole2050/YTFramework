package pkg1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","../Selenium/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("//*[@name='q']")).sendKeys("Way2Automation");
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//*[@name=\"btnK\"])[1]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[contains(@class,\"LC20lb MBeu\")]")).click();
		
		List<WebElement> lnk= driver.findElements(By.tagName("a"));
		System.out.println(lnk.size());
		Thread.sleep(5000);
		for(WebElement lk:lnk)
		{
			System.out.println("URL: "+lk.getAttribute("href")+"Text: "+lk.getText());
		}

	}

}
