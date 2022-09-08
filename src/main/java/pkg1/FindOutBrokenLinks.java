package pkg1;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FindOutBrokenLinks {
	
	@Test
	public void allLinks() throws IOException, InterruptedException

	{
		System.setProperty("webdriver.chrome.driver","../Selenium/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//capture links from webpage
		List<WebElement> links =driver.findElements(By.tagName("a"));

		//number of links
		System.out.println(links.size());
		
		for(int i=0;i<links.size();i++)
		{
			
			//by using href attribute we can get URL of required of link
			
			WebElement element =links.get(i);
			String url = element.getAttribute("href");
			
			URL link = new URL(url);
			
			//create a connection using url object 'link'
			
			HttpURLConnection httpconn =(HttpURLConnection) link.openConnection();
			
			//wait time 2 seconds 
			Thread.sleep(3000);
			
			//establish connection
			httpconn.connect();
			
			int rescode = httpconn.getResponseCode();  //return response code. if code is above 400
			if(rescode >=400)
			{
				System.out.println("i"+ url+ " - " + " is broken link");
			}
			else
			{
				System.out.println(url+ " - " + " is valid link");
			}
			
			
		}
	}
}
