package Steps;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import BaseLayer.BaseClass;
import PageLayer.RegisterPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class RegisterPageStep extends BaseClass {

	RegisterPage registerpg;

	@Given("user open {string} browser")
	public void user_open_browser(String browsername) {
		BaseClass.initialization(browsername);

	}

	@When("user is on register page")
	public void user_is_on_register_page() {
		String URl = prop.getProperty("url");
		driver.get(URl);
	}

	@When("user enter valid {string} , {string},{string} and {string}")
	public void user_enter_valid_and(String Fname, String Lname, String email, String password) {

		registerpg = new RegisterPage();
		registerpg.enterfunctionality(Fname, Lname, email, password);

	}

	@When("user select DOB as  {string} , {string} ,{string} and user select gender as {string}")
	public void user_select_dob_as_and_user_select_gender_as(String Date, String month, String year, String gender) {

		registerpg.selectFunctionality(Date, month, year, gender);

	}

}
