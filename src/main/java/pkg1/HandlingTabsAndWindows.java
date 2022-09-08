package pkg1;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandlingTabsAndWindows {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","../Selenium/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.hdfcbank.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.switchTo().frame(driver.findElement(By.xpath("//*[@id='nvpush_popup_background_iframe']")));
		WebElement widget= driver.findElement(By.xpath("//*[@id='nvpush_cross']"));
		Actions action = new Actions(driver);
		action.moveToElement(widget).perform();
		widget.click();
		
		Alert alert = driver.switchTo().alert();
		alert.dismiss();
		driver.switchTo().alert().accept();
		driver.findElement(By.xpath("//*[@class='carousel-four-div first-col slick-slide slick-current slick-active']")).click();
		

		
		//2nd window
		driver.findElement(By.xpath("//*[@class='col-md-12 p0 text-center']")).click();
		
		
		//3rd window 
		System.out.println(driver.getTitle().contains("Deals"));
	}

}
