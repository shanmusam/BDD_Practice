package sample.bdd;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.cucumber.datatable.DataTable;

public abstract class Page extends CommonMethods{
	
	public abstract WebElement getElement(String elementName);
	public abstract void click(String button);
	public abstract boolean isDisplayed(String element);
	public abstract boolean checkPageLoad();
	public abstract void populateFields(DataTable table);
	
	
}
