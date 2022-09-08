package org.testing.testScripts;

import java.io.IOException;

import org.testing.base.Base;
import org.testing.pages.HomePage;
import org.testing.pages.Login;
import org.testing.pages.Logout;
import org.testing.utilities.CaptureScreenShots;
import org.testng.annotations.Test;

public class TC8 extends Base {
	
	@Test
	public void testCase8() throws InterruptedException, IOException
	{
		Login login = new Login(driver, pr);
		login.singin("99.test.99.automation@gmail.com", "99.test.99");
		
		HomePage hp= new HomePage(driver, pr);
		hp.clickLibrary();
		CaptureScreenShots.screenshot(driver);
		
	}

}
