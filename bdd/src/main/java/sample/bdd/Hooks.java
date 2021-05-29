package sample.bdd;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;





public class Hooks extends RuntimeSettings{
	
	private RuntimeSettings settings;
	
	public Hooks(RuntimeSettings settings) {
		this.settings = settings;
	}

	@Before
	public void setup() throws IOException {
		System.out.println("From cucumber before");
		settings.properties = new Properties();
		FileInputStream file = new FileInputStream(settings.dirPath + "\\src\\test\\resource\\config.properties");
		settings.properties.load(file);
		
	}
	
	@After
	public void teardown() {
		System.out.println("From cucumber After");
		if(settings.driver!=null) {
			settings.driver.quit();
		}
	}
	
	@BeforeStep
	public void beforestep() {
		System.out.println("From cucumber beforestep");
	}
	
	@AfterStep
	public void afterstep() {
		System.out.println("From cucumber Afterstep");
	}
}
