package pkg1;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Selenium1 {
	
//	@Test
//	public void fbLogin() throws InterruptedException
//	{
//		System.setProperty("webdriver.chrome.driver","../Selenium/chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
//		driver.get("https://www.facebook.com/");
//		WebElement email=driver.findElement(By.id("email"));
//		email.sendKeys("prattygole07@gmail.com");
//		WebElement psw = driver.findElement(By.id("pass"));
//		psw.sendKeys("1245");
//		WebElement login=driver.findElement(By.name("login"));
//		login.click();
//	}
	@Test
	public void fbSignUp() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","../Selenium/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000000));
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/campaign/landing.php?campaign_id=14884913640&extra_1=s%7Cc%7C589460569891%7Ce%7Cfacebook%20sign%20up%7C&placement=&creative=589460569891&keyword=facebook%20sign%20up&partner_id=googlesem&extra_2=campaignid%3D14884913640%26adgroupid%3D128696221832%26matchtype%3De%26network%3Dg%26source%3Dnotmobile%26search_or_content%3Ds%26device%3Dc%26devicemodel%3D%26adposition%3D%26target%3D%26targetid%3Dkwd-5066597374%26loc_physical_ms%3D9301538%26loc_interest_ms%3D%26feeditemid%3D%26param1%3D%26param2%3D&gclid=Cj0KCQjw54iXBhCXARIsADWpsG8bPogTcEaJJQPbMJ-ptXUw4ATfV7jwvThcykEHEuxmFWVKawbHkJoaAlbzEALw_wcB");
//		WebElement crt=driver.findElement(By.ByXPath.className(""));
//		crt.click();
		WebElement name=driver.findElement(By.name("firstname"));
		name.sendKeys("pratik");
		WebElement surname = driver.findElement(By.name("lastname"));
		surname.sendKeys("Gole");
		WebElement mob = driver.findElement(By.name("reg_email__"));
		mob.sendKeys("8723128754");
		WebElement psw = driver.findElement(By.name("reg_passwd__"));
		psw.sendKeys("abcdefg");
		WebElement Bday=driver.findElement(By.id("day"));
		Select day = new Select(Bday);
		day.selectByVisibleText("20");
		WebElement Bmonth = driver.findElement(By.id("month"));
		Select month = new Select(Bmonth);
		month.selectByIndex(7);
		WebElement Byear = driver.findElement(By.id("year"));
		Select year = new Select(Byear);
		year.selectByValue("1993");
		
		driver.findElement(By.linkText('))
		
		String abc=driver.findElement(By.id("month")).getAttribute("value");
		System.out.println(abc);
		driver.quit();
		
	}
	
//	@Before
//	public void login()
//	{
//		System.setProperty("Webdriver.chrome.driver", "../Selenium/chromedriver.exe");
//		ChromeDriver driver = new ChromeDriver();
//		driver.get("https://www.facebook.com/campaign/landing.php?campaign_id=14884913640&extra_1=s%7Cc%7C589460569891%7Ce%7Cfacebook%20sign%20up%7C&placement=&creative=589460569891&keyword=facebook%20sign%20up&partner_id=googlesem&extra_2=campaignid%3D14884913640%26adgroupid%3D128696221832%26matchtype%3De%26network%3Dg%26source%3Dnotmobile%26search_or_content%3Ds%26device%3Dc%26devicemodel%3D%26adposition%3D%26target%3D%26targetid%3Dkwd-5066597374%26loc_physical_ms%3D9301538%26loc_interest_ms%3D%26feeditemid%3D%26param1%3D%26param2%3D&gclid=Cj0KCQjw54iXBhCXARIsADWpsG8bPogTcEaJJQPbMJ-ptXUw4ATfV7jwvThcykEHEuxmFWVKawbHkJoaAlbzEALw_wcB");
//		driver.manage().window().maximize();
//	}
//	@Test
//	public void signup()
//	{
//		login();
////		System.setProperty("Webdriver.chrome.driver", "../Selenium/chromedriver.exe");
//		//ChromeDriver driver = new ChromeDriver();
//		WebElement name=driver().findElement(By.name("firstname"));
//		name.sendKeys("pratik");
//		
//	}

}
