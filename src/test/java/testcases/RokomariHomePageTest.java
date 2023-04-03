package testcases;


import org.testng.annotations.Test;

import pages.RokomariHomePage;
import utilities.BaseDriverSetup;

public class RokomariHomePageTest extends BaseDriverSetup {
	RokomariHomePage rokomariHomePage = new RokomariHomePage();
	
	@Test
	public void TestHomePage() throws InterruptedException {
		getDriver().get(rokomariHomePage.rokomari_homepage_url);
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		rokomariHomePage.hoverTest(rokomariHomePage.Sign_In_Button);
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		rokomariHomePage.clickOnElement(rokomariHomePage.Sign_In_Button);
		Thread.sleep(5000);
		
	}

}
