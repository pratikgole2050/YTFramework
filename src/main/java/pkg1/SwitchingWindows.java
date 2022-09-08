package pkg1;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SwitchingWindows {

	public static void main(String[] args) {
		
		System.setProperty("Webdriver.chrome.driver", "/Selenium/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.fonearena.com/");
		WebElement vdo=driver.findElement(By.xpath("//*[@id='news']/ul/blockquote[1]/h3/a"));
		WebElement clk=driver.findElement(By.id("//*[@id='news']/ul/blockquote[3]/h3/a"));
		Actions ac = new Actions(driver);
		ac.keyDown(Keys.CONTROL).click(vdo).keyUp(Keys.CONTROL).build().perform();
		ac.keyDown(Keys.CONTROL).click(clk).keyUp(Keys.CONTROL).build().perform();
		Set<String> allWindow=driver.getWindowHandles(); 
		int a=0;
		for(String s:allWindow)
		{
			a++;
			if(a==2)
			{
				driver.switchTo().window(s);
				break;
			}
		}

	}

}
