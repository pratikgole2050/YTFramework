package pkg1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action_HandlingRightClick {
	
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","../Selenium/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://deluxe-menu.com/popup-mode-sample.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement rightclk = driver.findElement(By.xpath("//img[@src=\"data-samples/images/popup_pic.gif\"]"));
		Actions action = new Actions(driver);
		action.contextClick(rightclk).perform();
		
		WebElement clk= driver.findElement(By.xpath("//tr/td[@id=\"dm2m1i1tdT\"]"));
		action.moveToElement(clk).perform();
		
		WebElement clk1= driver.findElement(By.xpath("//tr/td[@id=\"dm2m2i1tdT\"]"));
		action.moveToElement(clk1).perform();
		
		WebElement clk2= driver.findElement(By.xpath("//tr/td[@id=\"dm2m3i1tdT\"]"));
//		action.moveToElement(clk2).perform();
//		clk2.click();
		
		//--------------------------------or------------------------------
		action.click(clk2).perform();
		action.doubleClick(clk2)
		
	}

}
