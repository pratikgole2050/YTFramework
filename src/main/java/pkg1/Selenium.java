package pkg1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Selenium {
	
	public static void Chrome()
	{
		System.setProperty("webdriver.chrome.driver","../Selenium/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		//driver.get("https://www.t-mobile.com/");
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		WebElement user= driver.findElement(By.id("txtUsername"));
		//WebElement us = driver.findElement(ByCssSelector.);
		user.sendKeys("Admin");
		WebElement psw=driver.findElement(By.id("txtPassword"));
		psw.sendKeys("admin123");
		WebElement login=driver.findElement(By.id("btnLogin"));
		login.click();
		
		String title=driver.getTitle();
		String url=driver.getCurrentUrl();
		String source=driver.getPageSource();
		//System.out.println("title:"+title+"url:"+url+"source:"+source);
		System.out.println(title);
		System.out.println(url);
		//System.out.println(source);
		//driver.manage().window().maximize();
		Options op = driver.manage();
		Window w = op.window();
		w.maximize();
		//driver.quit();
	}
	
	public static void EdgeBrowser()
	{
		System.setProperty("webdriver.Edge.driver","../Selenium/msedgedriver.exe");
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://www.fonearena.com/");
		String title=driver.getTitle();
		String url=driver.getCurrentUrl();
		String source=driver.getPageSource();
		//System.out.println("title:"+title+"url:"+url+"source:"+source);
		System.out.println(title);
		System.out.println(url);
		//System.out.println(source);
		driver.manage().window().maximize();
		Options op = driver.manage();
		Window w = op.window();
		w.maximize();
		driver.quit();
	}
	

	public static void main(String[] args) {
		
		EdgeBrowser();
		Chrome();
	}

}
