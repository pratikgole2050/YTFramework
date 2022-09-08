package pkg1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingTextBox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","../Selenium/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://facebook.com");
		driver.manage().window().maximize();
		driver.findElement(By.name("email")).sendKeys("pratik@gmail.com");
		Thread.sleep(5000);
		driver.findElement(By.name("email")).clear();
		Thread.sleep(5000);
		driver.close();
		driver.findElement(By.name("email")).sendKeys("gole@gmail.com");
		
		
	}

}
