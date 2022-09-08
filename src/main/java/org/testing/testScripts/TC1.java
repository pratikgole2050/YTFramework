package org.testing.testScripts;

import java.io.IOException;

import org.testing.base.Base;
import org.testing.pages.HomePage;
import org.testing.pages.Login;
import org.testing.pages.Logout;
import org.testing.utilities.CaptureScreenShots;
import org.testng.annotations.Test;

import pkg1.CaptureScreenShot;

public class TC1 extends Base {
	
	@Test
	public void testCase1() throws InterruptedException, IOException {
		
		Login login = new Login(driver, pr);
		login.singin("99.test.99.automation@gmail.com", "99.test.99");
		
		
//		Login login=PageFactory.initElements(driver, Login.class);
//		login.singin("99.test.99.automation@gmail.com", "99.test.99");
		
		HomePage hp=new HomePage(driver, pr);
//		hp.clickTrending();
		
//		HomePage hp=PageFactory.initElements(driver, HomePage.class);
		hp.clickHistory();
		
		hp.clickLibrary();
		hp.clickSubscription();
		hp.clickTrending();
		hp.clickWatchLater();
		
//		Logout lg = new Logout(driver, pr);
//		lg.logout();
		
		CaptureScreenShots.screenshot(driver);
//		Logout lg =PageFactory.initElements(driver, Logout.class);
//		lg.logout();
	}
	

}
