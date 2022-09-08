package pkg1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingFrames {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","../Selenium/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_iframe");
		//driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_win_frames2");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//---outer frame size
		System.out.println(driver.findElements(By.tagName("iframe")).size());
		
		driver.switchTo().frame("iframeResult"); 
		
		//-----inner frame size
		System.out.println(driver.findElements(By.tagName("iframe")).size());
		driver.switchTo().frame(0); 
		driver.findElement(By.xpath("//*[@id='w3loginbtn']")).click();
		//driver.switchTo().defaultContent();
		driver.switchTo().parentFrame();
		//driver.findElement(By.xpath("(//*[@title='Change Theme'])[1]")).click();
		//driver.findElement(By.cssSelector("#menuButton")).click();
		System.out.println(driver.findElements(By.tagName("iframe")).size());


	}

}
