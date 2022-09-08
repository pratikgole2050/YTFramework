package org.testing.testScripts;

import org.testing.base.Base;
import org.testing.pages.HomePage;
import org.testing.pages.Login;
import org.testing.pages.Logout;
import org.testng.annotations.Test;

public class TC7 extends Base {
	
	@Test
	public void testCase7() throws InterruptedException
	{
		Login login = new Login(driver, pr);
		login.singin("99.test.99.automation@gmail.com", "99.test.99");
		
		HomePage hp= new HomePage(driver, pr);
		hp.clickWatchLater();
		
//		Logout lg = new Logout(driver, pr);
//		lg.logout();
	}
	
	

}
