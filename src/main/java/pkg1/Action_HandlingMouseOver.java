package pkg1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action_HandlingMouseOver {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","../Selenium/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.way2automation.com/way2auto_jquery/frames-and-windows.php#load_box");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement widget= driver.findElement(By.linkText("Widget"));
		Actions action = new Actions(driver);
		action.moveToElement(widget).perform();
		driver.findElement(By.linkText("Accordion")).click();
		
	}
}
