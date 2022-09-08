package pkg1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingJavaScriptExecutor {
	
	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver","../Selenium/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.javascript.com/");   //for button and textbox,Refresh,Alert
//		driver.get("https://www.w3schools.com/howto/tryit.asp?filename=tryhow_js_display_checkbox_text");  //for checkbox
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
//------------------To click on ||button||----------------------------------------------------------------------
//		WebElement btn= driver.findElement(By.xpath("//*[@class='button   10  ']"));
//		js.executeScript("arguments[0].click();", btn);
		
		
//------------------To Type Text in a ||TextBox|| without using sendKeys() method------------------------------
//		js.executeScript("document.getElementById('inputJS').value='pratik';");
//		driver.close();
		
//----------------To Handle ||Checkbox|| by passing the value as true or false----------------------------------
//		driver.switchTo().frame("iframeResult");
//		WebElement chk= driver.findElement(By.id("myCheck"));
//		js.executeScript("arguments[0].click();", chk);
//				OR
//		js.executeScript("document.getElementById('myCheck').checked=true;");
		
		
		//To generate Alert Pop window in Selenium Webdriver
		//js.executeScript("alert('welcome To Selenium Testing');");
		
		//To refresh browser window using Javascript
		//js.executeScript("history.go(0)");
		
		//To get the innertext of the entire webpage in Selenium
		String innerText = js.executeScript(" return document.documentElement.innerText;").toString();
		System.out.println(innerText);
	
		//To get the Title of our webpage
		String TitleText=js.executeScript("return document.title;").toString();
		System.out.println("Title is----"+TitleText);
		
		//TO get the domain Name
		String domain = js.executeScript("return document.domain;").toString();
		System.out.println("Domain Name is-----"+domain);
		
		//TO get the URL of the webPage
		String url = js.executeScript("return document.URL;").toString();
		System.out.println("URL is------"+url);
		
		
		//To get the Height and Width of a web page
		System.out.println(js.executeScript("return window.innerHeight;").toString());
		System.out.println(js.executeScript("return window.innerWidth;").toString());
		
		//To perform Scroll on an application using Selenium
		//js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		
		js.executeScript("window.scrollBy(0,200)","");
		
//		js.executeScript("var btn=document.createElement('newButton');"
//				 
//                     + "document.body.appendChild(btn);");
	}

}
