package pkg1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingCheckedBox {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","../Selenium/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.techlistic.com/p/selenium-practice-form.html");
		driver.manage().window().maximize();
		
		//Handling dynamic radio buttons
		
		List<WebElement> radio=driver.findElements(By.xpath("(//*[@name=\"exp\"])"));
		System.out.println("Radio buttons are:- "+radio.size());
//		for(WebElement rd:radio)
//		{
//			rd.click();
//		}
//		
		for(int i=0;i<=radio.size();i++)
		{
			driver.findElement(By.xpath("//*[contains(@id,\"exp-"+i+"\")]"));
			if(i==5)
			{
				driver.findElement(By.xpath("//*[contains(@id,\"exp-"+i+"\")]")).click();
				break;
			}
		}
		System.out.println("done");
	}

}
