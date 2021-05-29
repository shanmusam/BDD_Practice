package sample.bdd;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CommonMethods {
	
	
	
	public boolean clickElement(WebElement element, String elementName) {
		try {
			if (element.isEnabled()) {
				element.click(); 
				return true;
			}
		}catch(Exception e) {
			System.out.println("Element not clickable: " + elementName+" :" + e);
		}
		return false;
	}
	
	public boolean waitForElement(WebDriver driver, WebElement element, String elementName) {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		try{
			wait.until(ExpectedConditions.visibilityOf(element));
			return true;
		}catch(Exception e) {
			System.out.println("Element not visible: " + elementName+" :" + e);
		}
		return false;
	}
}
