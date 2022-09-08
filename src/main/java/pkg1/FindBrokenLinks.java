package pkg1;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FindBrokenLinks {
	
	@Test
	public void allLinks() throws IOException
	{
		System.setProperty("webdriver.chrome.driver","../Selenium/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		int count=0;
		List<WebElement> links =driver.findElements(By.tagName("a"));
		for(WebElement link:links)
		{
			if(link.getAttribute("href") != null || link.getAttribute("href").contains("javascript"))
			{
			boolean res=this.checkLink(link.getAttribute("href"));
			if(res==false)
				{
					count++;
				}
			}
		}
		System.out.println(count);
	}
	
	public boolean checkLink(String linkURL) throws IOException
	{
		boolean result=false;
		URL url = new URL(linkURL);
		HttpURLConnection conn=(HttpURLConnection) url.openConnection();	
		conn.setConnectTimeout(5000);   //wait for response
		conn.connect();    //hitting the request
		if(conn.getResponseCode()==200)
		{
			result=true;
		}
		return result;
	}
	
}
