package pkg1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ISElementIsPresent {

	@SuppressWarnings("deprecation")
	
	public static WebDriver driver;
	
	public static boolean ElementIsPresent(String Locator)
	{
		try
		{
			driver.findElement(By.xpath(Locator));
			return true;
		}
		catch (Exception e) {
			return false;		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//WebDriverManager.chromeDriver().setup();
		System.setProperty("webdriver.chrome.driver","../Selenium/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://facebook.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//System.out.println(ElementIsPresent("").isEnabled());
		
		System.out.println(ElementIsPresent("//*[@type=\"password\"]"));
		
		driver.quit();

	}

}
