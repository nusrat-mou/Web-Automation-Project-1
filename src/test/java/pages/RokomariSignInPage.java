package pages;

import org.openqa.selenium.By;

public class RokomariSignInPage extends BasePage {
	public String Sign_In_URL = "https://www.rokomari.com/login";
    
	
	public By email_phone_input = By.xpath("//input[@id='j_username']");
	public By password_field = By.xpath("//input[@id='j_password']");
	public By Login_Button = By.xpath("//button[contains(text(),'Sign In')]");
	public By scrollToSignUp = By.xpath("//p[normalize-space()='Login easily with your facebook or google account']");
	
			

}
