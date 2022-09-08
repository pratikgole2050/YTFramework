package pkg1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingWindowPractice1 {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","../Selenium/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://google.com");
		
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.gmail.com");
		
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://youtube.com");
		
		
		Set<String> win =driver.getWindowHandles();
		Iterator<String> itr=win.iterator();
		
		List<String> winindex = new ArrayList<String>();
		
		while(itr.hasNext())
		{
			winindex.add(itr.next());
		}

		driver.switchTo().window(winindex.get(0));
		driver.switchTo().window(winindex.get(1));
		driver.switchTo().window(winindex.get(2));
		driver.quit();
	}

}
