 package sample.bdd;

import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.datatable.DataTable;

public class HomePage extends Page{
	
	
	private WebDriver driver;

	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(how = How.XPATH, using = "//*[@id='at-cv-lightbox-close']")
	public WebElement close;
	
	@FindBy(how = How.XPATH, using = "//a[text()='Input Forms']")
	public WebElement inputformlnk;
	
	@FindBy(how = How.XPATH, using = "//div[@id='easycont']//ul[@id='treemenu']//a[text()='Simple Form Demo']")
	public WebElement simpleformlnk;
	
	@Override
	public WebElement getElement(String elementName) {
		// TODO Auto-generated method stub
		switch(elementName) {
		case "close":
			return close;
		case "inputform":
			return inputformlnk;
		case "simpleform":
			return simpleformlnk;
		}
		return null;
	}
	
	@Override
	public void click(String button) {
		clickElement(getElement(button), button);			
	}

	

	@Override
	public boolean isDisplayed(String element) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean checkPageLoad() {
		// TODO Auto-generated method stub
		return waitForElement(driver, close, "Close Button");
	}

	@Override
	public void populateFields(DataTable table) {
		// TODO Auto-generated method stub
		
	}

	

	
	
}
