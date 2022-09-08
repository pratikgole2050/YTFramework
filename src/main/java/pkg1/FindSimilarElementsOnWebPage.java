package pkg1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FindSimilarElementsOnWebPage {
	
	@Test
	public void findSimilarElements()
	{
		System.setProperty("webdriver.chrome.driver","../Selenium/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		List<WebElement> links= driver.findElements(By.xpath("//input[@type='text']"));
		List<WebElement> links1= driver.findElements(By.linkText("a"));
		List<WebElement> links2= driver.findElements(By.tagName("img"));
		
		System.out.println("links are"+links.size());
		System.out.println("links are---------"+links);
	}

}
