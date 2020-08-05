package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStepDefs {
	public static WebDriver driver;

	@Given("^user is on login page$")
	public void user_is_on_login_page() throws Throwable {

		System.setProperty("webdriver.gecko.driver", "./src/main/java/TestData/geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		System.out.println(driver.getTitle());
		driver.quit();
	}

	@When("^I provide valid username and password$")
	public void i_provide_valid_username_and_password() throws Throwable {

	}

	@When("^user clicks on login button$")
	public void user_clicks_on_login_button() throws Throwable {

	}

	@Then("^user should be able to login$")
	public void user_should_be_able_to_login() throws Throwable {

	}

	@Then("^user is on home page$")
	public void user_is_on_home_page() throws Throwable {

	}

}
