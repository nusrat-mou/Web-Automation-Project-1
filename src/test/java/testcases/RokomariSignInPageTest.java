package testcases;

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
		rokomariSignInPage.clickOnElement(rokomariSignInPage.Login_Button);
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		rokomariHomePage.hoverTest(rokomariHomePage.Lekhok);
		Thread.sleep(5000);
		
		rokomariHomePage.clickOnElement(rokomariHomePage.Humayun_Ahmed);
		Thread.sleep(2000);
		
		rokomariHomePage.scrollToElement(rokomariHomePage.scroll);
		Thread.sleep(2000);
		
		rokomariHomePage.clickOnElement(rokomariHomePage.Filter_1);
		Thread.sleep(2000);
		
		rokomariHomePage.scrollToElement(rokomariHomePage.Bottom_Scroll);
		Thread.sleep(2000);
		
		rokomariHomePage.clickOnElement((rokomariHomePage.Next_Page));
		Thread.sleep(2000);
		
		rokomariHomePage.scrollToElement(rokomariHomePage.Scroll2);
		Thread.sleep(2000);
		
		rokomariHomePage.hoverTest(rokomariHomePage.Hover_Add_To_Cart);
		Thread.sleep(2000);
		
		rokomariHomePage.clickOnElement(rokomariHomePage.Add_To_Cart);
		Thread.sleep(5000);
		
		rokomariHomePage.clickOnElement(rokomariHomePage.Cart_Icon);
		Thread.sleep(3000);
		
		rokomariHomePage.scrollToElement(rokomariHomePage.Scroll3);
		Thread.sleep(2000);
		
		rokomariHomePage.clickOnElement(rokomariHomePage.Place_Order);
		Thread.sleep(3000);
		
		rokomariHomePage.writeText(rokomariHomePage.Alternative_Number, "01720970244");
		Thread.sleep(3000);
		rokomariHomePage.clickOnElement(rokomariHomePage.Select_Country);
		Thread.sleep(3000);
		rokomariHomePage.writeText(rokomariHomePage.Street_Address, "Mumbai");
		Thread.sleep(3000);
		rokomariHomePage.clickOnElement(rokomariHomePage.Account);
		Thread.sleep(2000);
		rokomariHomePage.clickOnElement(rokomariHomePage.Sign_Out);
		Thread.sleep(2000);
		
		
		
		
		
	}
	
	

}
