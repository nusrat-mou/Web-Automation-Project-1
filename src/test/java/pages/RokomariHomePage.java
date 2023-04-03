package pages;

import org.openqa.selenium.By;

public class RokomariHomePage extends BasePage {
	public String rokomari_homepage_url = "https://www.rokomari.com/book";
	public By Sign_In_Button = By.xpath("//div[@class='dropdown user-menu']/a");
	public By Lekhok = By.xpath("//a[@id='js--authors']");
	public By Humayun_Ahmed = By.xpath("//a[contains(text(),'হুমায়ূন আহমেদ')]");
	public By scroll = By.xpath("//div[@class='product-sort mt-0']//div[6]");	
	public By Filter_1 = By.xpath("//label[@for='rok-filter-categoryIds-677']");
	public By Bottom_Scroll = By.xpath("/html[1]/body[1]/div[6]/div[1]/div[1]/div[1]/section[2]/div[2]/div[1]/div[57]/div[1]/a[1]/div[2]");
	public By Next_Page = By.xpath("//a[normalize-space()='Next']");
	public By Scroll2 = By.xpath("//p[normalize-space()='Publishers']");
	public By Hover_Add_To_Cart = By.xpath("//h4[contains(text(),'একজন মায়াবতী')]");
	public By Add_To_Cart = By.xpath("//body/div[6]/div[1]/div[1]/div[1]/section[2]/div[2]/div[1]/div[9]/div[1]/a[1]/div[1]/div[1]/button[1]");
	public By Cart_Icon = By.xpath("//*[@id='cart-icon']");
	public By Scroll3 = By.xpath("//body/div[@id='cart-page']/div[1]/div[1]/div[1]/section[3]/div[1]/div[1]/div[1]");
	public By Place_Order = By.xpath("//body[1]/div[4]/div[1]/div[1]/div[1]/div[2]/div[1]/a[2]/span[1]");
	public By Alternative_Number = By.xpath("//fieldset[@class='group']//input[@id='phone2']");
	public By Select_Country = By.xpath("//select[@id='js--country']");
	public By Street_Address = By.xpath("//fieldset[@class='mb-0']//textarea[@id='address']");
	public By Account = By.xpath("//a[@id='dropdownMenu2']");
	public By Sign_Out = By.xpath(" //a[contains(text(),'Sign Out')]");
	
	
	
	

}
