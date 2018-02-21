package test.java.stepdefs;

import java.util.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class StepDefinitions {
	
	By name = By.id("inputFunnel");
	By dateOfBirth = By.id("opt_date");
	By stateId = By.id("user_region_id");
	By emailAddress = By.id("user_email");
	By userPassword = By.id("user_password");
	By signUp = By.xpath("//*[@id=\"new_user\"]/input[4]");
	
	HashMap<String, By> locators = new HashMap<String, By>();
	
	public HashMap<String, By> loadLocators() throws Throwable {
		locators.put("name", name);
		return locators;
	}
	
	public static WebDriver driver;
	
//	@Given("^User is on the hone page$")
//	public void user_is_on_the_home_page() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "/Users/shruthiagni/Downloads/chromedriver");
//		driver = new ChromeDriver();
//		driver.get("https://staging.opternative.com/");
//	}

//	@When("^User enters credentials \"(.*)\" \"(.*)\"$")
//	public void user_enters_credentials(String EmailAddress, String Password) throws Throwable {
//		driver.findElement(firstLastName).clear();
//		driver.findElement(firstLastName).sendKeys(FirstandLastName);
//		driver.findElement(dateOfBirth).clear();
//		driver.findElement(dateOfBirth).sendKeys(dob);
//		Select stateValue = new Select(driver.findElements(stateId));
//		stateValue.selectByVisibleText(state);
//		driver.findElement(emailAddress).sendKeys(emailid);
//		driver.findElement(userPassword).clear();
//		driver.findElement(userPassword).sendKeys(password);]
//	}
	
	@When("^I fill in \"(.*)\" with \"(.*)\"")
	public void fillInField(String Field, String Name) throws Throwable {
		HashMap<String, By> locators = loadLocators();
		By locator = (By)locators.get(Field);
		driver.findElement(locator).sendKeys(Name);
	}

//	@Then("^I am on the \"([^\"]*)\" page on URL \"([^\"]*)\"$")
//	public void i_am_on_the_page_on_URL(String arg1, String arg2) throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new PendingException();
//	}
//
//	@Then("^I should see \"([^\"]*)\" message$")
//	public void i_should_see_message(String arg1) throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new PendingException();
//	}

}
