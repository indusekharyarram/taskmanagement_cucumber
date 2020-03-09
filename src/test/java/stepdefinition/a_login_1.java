package stepdefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.a_login;

public class a_login_1 {
a_login enter= new a_login();
	@Given("^launch the browser$")
	public void launch_the_browser() throws Throwable {
		enter.launch();
	}

	@When("^open TaskManager website$")
	public void open_TaskManager_website() throws Throwable {
		enter.open();
	   
	}

	@Then("^enter Login and Password$")
	public void enter_Login_and_Password() throws Throwable {
		enter.enter();
	   
	}

	@Then("^click on Login button$")
	public void click_on_Login_button() throws Throwable {
	    enter.click();
	}

}
