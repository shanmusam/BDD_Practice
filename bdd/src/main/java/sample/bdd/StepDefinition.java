package sample.bdd;

import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;



public class StepDefinition extends Utils{

	
	public StepDefinition(RuntimeSettings settings) {super(settings);}
	

	@Given("I launch browser")
	public void Initialise() {
		System.setProperty("webdriver.chrome.driver", settings.dirPath+settings.properties.getProperty("chromeDriver"));
		settings.driver = new ChromeDriver();
		settings.driver.manage().deleteAllCookies();
		settings.driver.manage().window().maximize();
		settings.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@When("I navigate to \"([^\"]*)\"$")
	public void navigate(String url) {
		settings.driver.get(url);
	}
	
	@Then("I should be displayed with \"([^\"]*)\" Page$")
	public void pageDisplayed(String pageName) {
		try {
			settings.page = (Page) Class.forName("sample.bdd."+pageName)
					.getConstructor(WebDriver.class)
					.newInstance(settings.driver);
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}catch(NoSuchMethodException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Assert.assertEquals(settings.page.checkPageLoad(), true); 
	}
	
	
	@Then("I click \"([^\"]*)\" button$")
	public void IClick(String button) {
		Assert.assertNotNull(settings.page);
		settings.page.click(button);
	}
	
	@Then("I enter the below details")
	public void enterDetails(DataTable table) {
		System.out.println(table);
		Assert.assertNotNull(settings.page);
		settings.page.populateFields(table);
	}
}
