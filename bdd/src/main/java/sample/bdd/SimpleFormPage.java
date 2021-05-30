package sample.bdd;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import io.cucumber.datatable.DataTable;

public class SimpleFormPage extends Page{
	
	
	private WebDriver driver;
	
	public SimpleFormPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(how = How.XPATH, using = "//*[@id='user-message']")
	public WebElement inputbox;

	@Override
	public WebElement getElement(String elementName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void click(String button) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean isDisplayed(String element) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean checkPageLoad() {
		return waitForElement(driver, inputbox, "input box");
	}

	@Override
	public void populateFields(DataTable table) {
		// TODO Auto-generated method stub
		List<SimpleFormData> data = new ArrayList<SimpleFormData>();
		System.out.println(table.asList(SimpleFormData.class));
		//System.out.println(data);
	}
	
	public class SimpleFormData{
		public String name;

		public SimpleFormData(String name) {
			this.name = name;
		}
	}
	
}
