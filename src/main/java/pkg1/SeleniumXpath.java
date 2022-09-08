package pkg1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumXpath {

	public static void main(String[] args) {
		//Xpath 
		//1.Absolute path  with single'/'   2.relative path with double '//'
		
		//relative xpath techniques
		//1.tag with attribute   //tagname[@attributename='attributevalue']
		
		//2.tag with multiple attribute name with and condition
			//tagname[@attributename='attributeValue' and @attributename='attributeValue']
		
		//3.tag with multiple attribute name with or condition
			//tagname[@attributename='attributevalue' or @attributename='attributeValue']
		
		//Dynamic tag with attribute name
			//*[@attributename='attributeValue']
		
		
		System.setProperty("Webdriver.chromer.driver","../Selenium/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
		
		// //tagename[@attributeName='attributeValue']
		WebElement usrname = driver.findElement(By.xpath("//input[@id='txtUsername']"));
		usrname.sendKeys("Admin");
		
		// //tagname[@attributeName='attributeValue' and @attributeName='attributeValue']
		WebElement psw = driver.findElement(By.xpath("//input[@name='txtPassword' and @id='txtPassword']"));
		psw.sendKeys("admin123");
		
		// //tagname[@attributeName='attributeValue' or @attributename='attributeValue']
		WebElement lgn= driver.findElement(By.xpath("//input[@type='submit' or @class='button']"));
		lgn.click();
		
		// //*[@attributeName='attributeValue']
		WebElement adm=driver.findElement(By.xpath("//*[@id='menu_admin_viewAdminModule']"));
		adm.click();
		
		//tag with innerText(innerText is fixed)
		//  //tagname[text()='innerTextValue']
		WebElement inr = driver.findElement(By.xpath("//span[text()='Assign Leave']"));
		inr.click();
		
		WebElement hm=driver.findElement(By.linkText("//*[@id=\"branding\"]/a[1]"));
		hm.click();
		
		
	}

}
