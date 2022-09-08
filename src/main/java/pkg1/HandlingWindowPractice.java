package pkg1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingWindowPractice {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","../Selenium/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("http://gmail.com");
		
		
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://google.com");
		
		Set<String> win = driver.getWindowHandles();
		Iterator<String> itr = win.iterator();
		
		List<String>winindex = new ArrayList<String>();
		
		while(itr.hasNext())
		{
			winindex.add(itr.next());
		}
		
		driver.switchTo().window(winindex.get(0));
		System.out.println("first window is "+driver.getTitle());
		driver.close();
		
		driver.switchTo().window(winindex.get(1));
		System.out.println("Second window is "+driver.getTitle());
		driver.close();
		
		driver.switchTo().window(winindex.get(2));
		System.out.println("Third window is "+driver.getTitle());
		driver.close();
		
	}

}
