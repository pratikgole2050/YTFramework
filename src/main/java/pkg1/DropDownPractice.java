package pkg1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DropDownPractice {

	public static void main(String[] args) {
		
		System.setProperty("WebDriver.chrome.driver.","../Selenium/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Actions sc = new Actions(driver);
		WebElement wb=driver.findElement(By.xpath("//a[@title=\"Marathi\"]"));
		for(int i=0;i<3;i++)
		{
		sc.sendKeys(Keys.TAB).perform();
		}
		wb.click();
	}

}
