package pkg1;

import java.time.Duration;
import java.util.List;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;


public class SeleniumPractice {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","../Selenium/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.navigate().to("https://www.vodafone.it/portal/Privati");
		//WebElement alt = driver.findElement(By.className("firstLevelNavigationLink new64832"));
		
		
		
		driver.get("https://www.facebook.com/");
		//driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/pim/viewEmployeeList");
		Wait<WebDriver> Wait = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(50))
				.pollingEvery(Duration.ofSeconds(20))
				.ignoring(NoSuchElementException.class);
		
		
	
	//driver.findElement(RelativeLocator.with(By.tagName("input")).above(By.xpath("//*[@type=\"password\"]"))).sendKeys("abc@gmail.com");
	//driver.findElement(RelativeLocator.with(By.tagName("input")).below(By.xpath("//*[@name=\"email\"]"))).sendKeys("abc");
	//driver.findElement(By.xpath("//*[contains(@id,\"u_0_0_\")]")).click();
	Thread.sleep(5000);
	//driver.findElement(RelativeLocator.with(By.name("lastname")).near(By.xpath("//*[@name=\"firstname\"]"))).sendKeys("gole");	
	
	//driver.findElement(RelativeLocator.with(By.name("firstname")).toLeftOf(By.name("lastname"))).sendKeys("pratik");
	
	
	
	//driver.findElement(RelativeLocator.with(By.name("lastname")).toRightOf(By.name("firstname"))).sendKeys("Gole");
	
	/*
	 * Select select = new Select(driver.findElement(By.id("day")));
	 * select.selectByIndex(20);
	 * 
	 * Select s = new Select(driver.findElement(By.id("month")));
	 * s.selectByVisibleText("Jan");
	 * 
	 * Select s1 = new Select(driver.findElement(By.id("year")));
	 * s1.selectByValue("1993");
	 */
	
//-----------------------------dropDown
/*	List<WebElement> values=driver.findElements(By.tagName("option"));
	System.out.println("total count"+values.size());
	System.out.println(values.get(31).getText());
	
	for(int i=0;i<values.size();i++)
	{
		System.out.println(values.get(i).getAttribute("value"));
		//System.out.println(values.get(i));
	}*/
	
//-------------------------------AllLinks-------------------------------------------------
	
/*	List<WebElement>links=driver.findElements(By.tagName("a"));
	System.out.println("all links"+links.size());
	
	for(WebElement link:links)
	{
		//System.out.println(link.getText()+" "+link.getAttribute("href"));
		System.out.println("text:- "+link.getText());
		System.out.println("attribute:- "+link.getAttribute("href"));
	}
	*/
	
//----------------------------find links of particular block-----------------------------------	
	WebElement blk = driver.findElement(By.xpath("//*[@class='_8esn']"));
	List<WebElement> lk = blk.findElements(By.tagName("a"));
	System.out.println(lk.size());
	
	
	for(WebElement ls : lk)
	{
		System.out.println("URL Text is---"+ls.getText()+"URL is--"+ls.getAttribute("href"));	
		//System.out.println(ls.getAttribute("a"));
		//System.out.println(blk.size());
		//System.out.println(ls.getAttribute("href"));
	}
	
	driver.quit();
	
	}

}
