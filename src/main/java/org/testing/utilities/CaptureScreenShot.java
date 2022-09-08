package org.testing.utilities;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;


public class CaptureScreenShot {
	
	public static void captureScreen(WebDriver driver) throws IOException
	{
		TakesScreenshot scr = (TakesScreenshot) driver;
		File f = scr.getScreenshotAs(OutputType.FILE);
		File fd = new File("./Screenshot/test2.png");
		FileUtils.copyFile(f, fd);
	}


}
