package pkg1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action_HandlingDoubleClick {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","../Selenium/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_ondblclick");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//div[@id='iframe']"));
		driver.switchTo().frame(1);
//		driver.switchTo().frame("//div[@id='iframe']");
		WebElement db = driver.findElement(By.xpath("//p[text()='Double-click this paragraph to trigger a function.']"));
		//WebElement db = driver.findElement(By.xpath("//p[contains(text(),'Double-click this paragraph to trigger a function.')]"));
		Actions action = new Actions(driver);
		action.moveToElement(db).perform();
		action.doubleClick(db).perform();
	}

}
