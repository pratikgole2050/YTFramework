package pkg1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingCheckBox {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","../Selenium/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.techlistic.com/p/selenium-practice-form.html");
		driver.manage().window().maximize();
		//driver.findElement(By.xpath("//*[@id=\"profession-0\"]")).click();
		//driver.findElement(By.xpath("//*[@id=\"profession-1\"]")).click();
		Thread.sleep(10000);
		
//-----------------select check box if you know the how many check box are there-------(Static)
		
//		for(int i=0;i<=1;i++)
//		{
//			driver.findElement(By.xpath("//*[@id=\"profession-"+i+"\"]")).click();
//		}

		
//		for(int i=0;i<=3;i++)
//		{
//			driver.findElement(By.xpath("//*[@id=\"tool-"+i+"\"]")).click();
//		}
		
		
//------------------------------dynamic checkbox handling----------------------------------------
//----if you don't know the how many check boxes are there-----------------------------------		
		
		
//		int i=0;
//		int count=0;
//		while(driver.findElement(By.xpath("//*[@id=\"tool-"+i+"\"]")).isEnabled()==true)
//		{
//			driver.findElement(By.xpath("//*[@id=\"tool-"+i+"\"]")).click();
//			i++;
//			count++;
//		}
//		System.out.println(count);
		
//		List<WebElement>chkbox= driver.findElements(By.xpath("//*[contains(@id,\"tool-\")]"));
//		System.out.println("checkbox Size"+chkbox.size());
//		
//		for(WebElement chk:chkbox)
//		{
//			chk.click();
//		}
		
		
		//handle particular checkbox not all others
		
		WebElement checkbox=driver.findElement(By.xpath("(//*[@class=\"control-group\"])[6]"));
		List<WebElement> chx=checkbox.findElements(By.xpath("//*[contains(@id,\"tool-\")]"));
		
		for(WebElement chk:chx)
		{
			chk.click();
		}
		
	}

}
