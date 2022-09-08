package pkg1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintTheAllLinksOfWebPage {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "../Selenium/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		
		List<WebElement> allLinks =driver.findElements(By.tagName("a"));
		
		System.out.println("all the links on web page"+allLinks.size()+"links");
		
		for(WebElement links:allLinks)
		{
			System.out.println(links.getAttribute("href"));
			
			System.out.println(links.getText());
		}
		

	}

}
