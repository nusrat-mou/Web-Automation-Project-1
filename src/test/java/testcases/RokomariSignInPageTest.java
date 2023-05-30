package testcases;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import pages.RokomariHomePage;
import pages.RokomariSignInPage;
import utilities.BaseDriverSetup;

public class RokomariSignInPageTest extends BaseDriverSetup {
	RokomariSignInPage rokomariSignInPage = new RokomariSignInPage();
	RokomariHomePage rokomariHomePage = new RokomariHomePage();
	
	
	@Test
	public void SignInTest() throws InterruptedException {
		getDriver().get(rokomariSignInPage.Sign_In_URL);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		rokomariSignInPage.scrollToElement(rokomariSignInPage.scrollToSignUp);
		Thread.sleep(5000);
		
		
		rokomariSignInPage.writeText(rokomariSignInPage.email_phone_input, "nus.mou.106@gmail.com");
		rokomariSignInPage.writeText(rokomariSignInPage.password_field, "12345678910");
		rokomariSignInPage.takeScreenShot("Sign In Info");
		rokomariSignInPage.clickOnElement(rokomariSignInPage.Login_Button);
		rokomariSignInPage.takeScreenShot("Sign In");
		 
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	
		
		
		
	}
	
	

}
