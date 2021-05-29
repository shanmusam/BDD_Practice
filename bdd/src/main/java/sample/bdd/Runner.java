package sample.bdd;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(
		features = "src/main",
		glue = "sample.bdd"
)
public class Runner extends AbstractTestNGCucumberTests {
	
	@BeforeSuite
	public void bsdisplay() {
		System.out.println("TestNG - BeforeSuite");
	}
	
	@BeforeTest
	public void btdisplay() {
		System.out.println("TestNG - BeforeTest");
	}
	
	@BeforeClass
	public void bcdisplay() {
		System.out.println("TestNG - BeforeClass");
	}
	
	@BeforeMethod
	public void bmdisplay() {
		System.out.println("TestNG - BeforeMethod");
	}
	
	@AfterMethod
	public void amdisplay() {
		System.out.println("TestNG - AfterMethod");
	}
	
	@AfterClass
	public void acdisplay() {
		System.out.println("TestNG - AfterClass");
	}
	
	@AfterTest
	public void atdisplay() {
		System.out.println("TestNG - AfterTest");
	}
	
	@AfterSuite
	public void asdisplay() {
		System.out.println("TestNG - AfterSuite");
	}
	
}
