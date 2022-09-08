package pkg1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_Alerts1 {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","../Selenium/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_alert");
		driver.manage().window().maximize();
		driver.switchTo().frame(1);
		driver.findElement(By.linkText("Try it")).click();
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		System.out.println(alert.hashCode());
		alert.dismiss();
		
		
		
		
	}

}
