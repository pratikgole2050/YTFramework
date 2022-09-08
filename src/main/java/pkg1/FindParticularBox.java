package pkg1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindParticularBox {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","../Selenium/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
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
	}

}
