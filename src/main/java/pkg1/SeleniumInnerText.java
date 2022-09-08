package pkg1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumInnerText {

	public static void main(String[] args) {
		
		System.setProperty("Webdriver.chromer.driver","../Selenium/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		
		// //tagename[@attributeName='attributeValue']
		WebElement usrname = driver.findElement(By.xpath("//input[@id='txtUsername']"));
		usrname.sendKeys("Admin");
		
		// //tagname[@attributeName='attributeValue' and @attributeName='attributeValue']
		WebElement psw = driver.findElement(By.xpath("//input[@name='txtPassword' and @id='txtPassword']"));
		psw.sendKeys("admin123");
		
		// //tagname[@attributeName='attributeValue' or @attributename='attributeValue']
		WebElement lgn= driver.findElement(By.xpath("//input[@type='submit' or @class='button']"));
		lgn.click();
		
		WebElement inr = driver.findElement(By.xpath("//span[text()='Assign Leave']"));
		inr.click();

	}

}
