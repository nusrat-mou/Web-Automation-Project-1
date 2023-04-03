package pages;

import org.openqa.selenium.By;

public class RokomariHomePage extends BasePage {
	public String rokomari_homepage_url = "https://www.rokomari.com/book";
	public By Sign_In_Button = By.xpath("//div[@class='dropdown user-menu']/a");
	public By Lekhok = By.xpath("//a[@id='js--authors']");
	public By Humayun_Ahmed = By.xpath("//a[contains(text(),'হুমায়ূন আহমেদ')]");
	public By scroll = By.xpath("//div[@class='product-sort mt-0']//div[6]");	
	public By Filter = By.xpath("//label[@for='rok-filter-categoryIds-677']");
	
	
	
	

}
