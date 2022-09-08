package pkg1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingWebTables {

	public static void main(String[] args) throws InterruptedException {
		
//------------------  "//table[@id='customers']/tbody/tr"      ------rows
//------------------ "//table[@id='customers']/tbody/tr[1]/th" ------columns
		
		System.setProperty("Webdriver.chrome,driver", "../Selenium/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.get("https://www.w3schools.com/html/html_tables.asp");
		driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");
		
		driver.manage().window().maximize();
		
		List<WebElement> rows= driver.findElements(By.xpath("// table[@id='customers']/tbody/tr"));
		List<WebElement> cols=driver.findElements(By.xpath("//table[@id='customers']/tbody/tr/th"));
		System.out.println("row size: "+rows.size());
		System.out.println("col size: "+cols.size());
		
		Thread.sleep(10000);
		for(int i=2;i<=rows.size();i++)
		{	
			for(int j=1;j<=cols.size();j++)
			{
				//System.out.print(driver.findElement(By.xpath("//table[@id='customers']/tbody/tr["+i+"]/td["+j+"]")).getText());
				System.out.print(driver.findElement(By.xpath("//table[@id='customers']/tbody/tr["+i+"]/td["+j+"]")).getText()+"   ");
				//System.out.print(driver.findElement(By.xpath("//table[@id="customers"]/tbody/tr[7]/td[1]")).getText());
			}
			System.out.println();
		}
		

	}

}
