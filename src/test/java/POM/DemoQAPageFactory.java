package POM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import stepDefinition.HelperClass;

public class DemoQAPageFactory extends HelperClass{

	public DemoQAPageFactory() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id="name_3_firstname")
	private WebElement txtbxFirstName;
	
	@FindBy(id="name_3_lastname")
	private WebElement txtbxLastName;

	@FindBy(xpath = "//input[@value = 'single']")
	private WebElement radioSingle;

	@FindBy(xpath = "//input[@value = 'married']")
	private WebElement radioMarried;

	@FindBy(xpath = "//input[@value = 'divorced']")
	private WebElement radioDivorced;
	
	@FindBy(xpath = "//input[@value = 'dance']")
	private WebElement chkbxhobbyDance;

	@FindBy(xpath = "//input[@value = 'reading']")
	private WebElement chkbxhobbyReading;

	@FindBy(xpath = "//input[@value = 'cricket ']")
	private WebElement chkbxhobbyCricket;

	@FindBy(id = "dropdown_7")
	private WebElement dropDownCountry;

	@FindBy(name="date_8[date][mm]")
	private WebElement dropDownDobMonth;
	
	@FindBy(name="date_8[date][dd]")
	private WebElement dropDownDobDay;
	
	@FindBy(name="date_8[date][yy]")
	private WebElement dropDownDobYear;
	
	@FindBy(id="phone_9")
	private WebElement txtbxPhonenumber;
	
	@FindBy(id="username")
	private WebElement txtbxUsername;
	
	@FindBy(id="email_1")
	private WebElement txtbxEmail;
	
	@FindBy(id="description")
	private WebElement txtbxAboutYourself;
	
	@FindBy(id="password_2")
	private WebElement txtbxPassword;
	
	@FindBy(id="confirm_password_password_2")
	private WebElement txtbxConfirmpassword;

	public WebElement getTxtbxFirstName() {
		return txtbxFirstName;
	}

	public WebElement getTxtbxLastName() {
		return txtbxLastName;
	}

	public WebElement getRadioSingle() {
		return radioSingle;
	}

	public WebElement getRadioMarried() {
		return radioMarried;
	}

	public WebElement getRadioDivorced() {
		return radioDivorced;
	}

	public WebElement getChkbxhobbyDance() {
		return chkbxhobbyDance;
	}

	public WebElement getChkbxhobbyReading() {
		return chkbxhobbyReading;
	}

	public WebElement getChkbxhobbyCricket() {
		return chkbxhobbyCricket;
	}

	public WebElement getDropDownCountry() {
		return dropDownCountry;
	}

	public WebElement getDropDownDobMonth() {
		return dropDownDobMonth;
	}

	public WebElement getDropDownDobDay() {
		return dropDownDobDay;
	}

	public WebElement getDropDownDobYear() {
		return dropDownDobYear;
	}

	public WebElement getTxtbxPhonenumber() {
		return txtbxPhonenumber;
	}

	public WebElement getTxtbxUsername() {
		return txtbxUsername;
	}

	public WebElement getTxtbxEmail() {
		return txtbxEmail;
	}

	public WebElement getTxtbxAboutYourself() {
		return txtbxAboutYourself;
	}

	public WebElement getTxtbxPassword() {
		return txtbxPassword;
	}

	public WebElement getTxtbxConfirmpassword() {
		return txtbxConfirmpassword;
	}

	
	
}
