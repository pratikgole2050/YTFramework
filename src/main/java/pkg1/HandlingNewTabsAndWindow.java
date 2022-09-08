package pkg1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingNewTabsAndWindow {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","../Selenium/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_iframe");
		//driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_win_frames2");
		driver.get("https://www.Way2Automation.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.google.com");
		driver.findElement(By.name("q")).sendKeys("hello selenium 4");
		
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("http://gmail.com");
		System.out.println(driver.getTitle());
		
		
		System.out.println(driver.getWindowHandles());
		Set <String>win=driver.getWindowHandles();
		Iterator<String> iterator = win.iterator();
		
		List<String> winindex=new ArrayList<String>();
		while(iterator.hasNext())
		{
			winindex.add(iterator.next());
		}
		driver.switchTo().window(winindex.get(0));
		System.out.println("First window title is "+driver.getTitle());
		driver.close();		
		
		driver.switchTo().window(winindex.get(1));
		System.out.println("Second window title is "+driver.getTitle());
		driver.close();
		
		driver.switchTo().window(winindex.get(2));
		System.out.println("Third window title is "+driver.getTitle());
		driver.close();
		
	}
}
