package pkg1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action_HandlingJqueryResizableElement {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","../Selenium/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/resources/demos/resizable/default.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement dd=driver.findElement(By.xpath("//div[@class='ui-resizable-handle ui-resizable-se ui-icon ui-icon-gripsmall-diagonal-se']"));
		//WebElement dd=driver.findElement(By.className("ui-slider ui-corner-all ui-slider-horizontal ui-widget ui-widget-content\""));
		new Actions(driver).dragAndDropBy(dd, 100, 300).perform();
	}

}
