package org.testing.utilities;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class CaptureScreenShots {
	
	public static void screenshot(WebDriver driver) throws IOException
	{
		TakesScreenshot scr=(TakesScreenshot) driver;
		File f=scr.getScreenshotAs(OutputType.FILE);
		File fb = new File("./Screenshot/test.png");
		FileUtils.copyFile(f, fb);
	}

}
