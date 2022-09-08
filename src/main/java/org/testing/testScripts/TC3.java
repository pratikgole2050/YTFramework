package org.testing.testScripts;

import org.testing.base.Base;
import org.testing.pages.HomePage;
import org.testing.pages.Login;
import org.testng.annotations.Test;

public class TC3 extends Base {
	
	@Test
	public void testCase3() throws InterruptedException
	{
		Login login = new Login(driver, pr);
		login.singin("99.test.99.automation@gmail.com", "\"99.test.99");
		
		HomePage hp=new HomePage(driver, pr);
		hp.clickSubscription();
	}

}
