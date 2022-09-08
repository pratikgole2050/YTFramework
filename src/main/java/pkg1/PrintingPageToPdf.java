package pkg1;

import java.io.IOException;
import java.nio.file.Paths;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.Pdf;
import org.openqa.selenium.PrintsPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.print.PrintOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.google.common.io.Files;

public class PrintingPageToPdf  {

	public static void main(String[] args) throws IOException {
		
		System.setProperty("WebDriver.chrome.driver", "../Selenium/chromedriver.exe");
		ChromeOptions opt=new ChromeOptions();
		WebDriver driver = new ChromeDriver(opt);
		driver.get("https://facebook.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		Pdf pdf =((PrintsPage) driver).print(new PrintOptions());
		Files.write(Paths.get("./selenium.pdf"),OutputType.BYTES.convertFromBase64Png(pdf.getContent()));
		//Files.write(Paths.get("./selenium1.pdf"),OutputType.BYTES.convertFromBase64Png(pdf.getContent()));
	}

}
