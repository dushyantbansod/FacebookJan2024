package PageLayer;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;
import UtilityLayer.HandleDropDown;
import UtilityLayer.WaitClass;

public class RegisterPage extends BaseClass {
	@FindBy(name = "firstname")
	private WebElement fname;

	@FindBy(name = "lastname")
	private WebElement lname;

	@FindBy(name = "reg_email__")
	private WebElement email;

	@FindBy(name = "reg_passwd__")
	private WebElement pasword;

	@FindBy(name = "birthday_day")
	private WebElement day;

	@FindBy(name = "birthday_month")
	private WebElement Month;

	@FindBy(name = "birthday_year")
	private WebElement Year;

	@FindBys(@FindBy(xpath = "//label[@class='_58mt']"))
	private List<WebElement> Gender;

	public RegisterPage() {
		PageFactory.initElements(driver, this);
	}

	public void enterfunctionality(String Fname, String Lname, String Email, String Password) {
		WaitClass.sendKeys(fname,Fname);
		WaitClass.sendKeys(lname, Lname);
		WaitClass.sendKeys(email, Email);
		WaitClass.sendKeys(pasword, Password);
	}

	public void selectFunctionality(String Date, String month, String year, String gender) {
		HandleDropDown.selectByVisibleText(day, Date);
		HandleDropDown.selectByVisibleText(Month, month);
		HandleDropDown.selectByVisibleText(Year, year);

	
		WaitClass.selectgender(Gender, gender);
	}
}
