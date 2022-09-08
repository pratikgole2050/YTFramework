package pkg1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SeleniumConstructor {

	public static void main(String[] args) {
		
		ChromeOptions opt = new ChromeOptions();
		opt.setHeadless(true);
		 
		ChromeDriver driver = new ChromeDriver(opt);
		
		ChromeDriver driver1=new ChromeDriver();
	}
}
