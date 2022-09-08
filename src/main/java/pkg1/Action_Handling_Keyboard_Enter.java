package pkg1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action_Handling_Keyboard_Enter {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","../Selenium/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://accounts.google.com/v3/signin/identifier?dsh=S503914199%3A1662358592861068&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&rip=1&sacu=1&service=mail&flowName=GlifWebSignIn&flowEntry=ServiceLogin&ifkv=AQN2RmXawk07EujeZDkL7f2_0C1DlqjGq0S0dhY_thftR1PTg-qQnWg6LI5Ll7RRXJzLWsx8ptFdzQ");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.cssSelector("#identifierId")).sendKeys("pratikgole95@gmail.com");
		
		Actions action = new Actions(driver);
		action.sendKeys(Keys.ENTER).build().perform();
		
	}

}
