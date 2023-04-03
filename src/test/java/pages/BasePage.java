package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import io.qameta.allure.Allure;

import static utilities.BaseDriverSetup.getDriver;

import java.awt.Desktop.Action;
import java.io.ByteArrayInputStream;
public class BasePage {
	public WebElement getElement(By locator) {
		return getDriver().findElement(locator);
		
	}
	public void writeText(By locator, String text) {
		getElement(locator).sendKeys(text);
	}
	public void clickOnElement(By locator) {
		getElement(locator).click();
	}
	public void takeScreenShot(String name) {
		Allure.addAttachment(name, new ByteArrayInputStream(((TakesScreenshot)(getDriver())).getScreenshotAs(OutputType.BYTES)));
	}
	public void scrollToElement(By locator) {
		WebElement el = getElement(locator);
		JavascriptExecutor js = (JavascriptExecutor)getDriver();
		js.executeScript("arguments[0].scrollIntoView();", el);
	}
	public void hoverTest(By locator) throws InterruptedException {
	
		Actions action = new Actions(getDriver());
		WebElement hoverExample = getDriver().findElement(locator);
		action.moveToElement(hoverExample).perform();
		Thread.sleep(5000);
	}

	


}
