package stepDefinition;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import POM.DemoQAPageFactory;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import stepDefinition.HelperClass;

public class DemoQARegistration extends HelperClass{
	
	@Given("^user launch browser and open Demo QA Registration page$")
	public void user_launch_browser_open_Demo_QA_Registration_page() throws Throwable {
	    getDriver();
		openApplication("http://demoqa.com/registration/");
	    
	}
	@When("^user enter firstname,lastname,phonenumber,username,email,aboutYourself,password,confirmpassword$")
	public void textBoxes() throws Throwable {
		DemoQAPageFactory pom=new DemoQAPageFactory();
		setText(pom.getTxtbxFirstName(), "selvakumar");
		setText(pom.getTxtbxLastName(), "Murugesan");
		setText(pom.getTxtbxPhonenumber(), "9600854130");
		setText(pom.getTxtbxUsername(), "selvawin");
		setText(pom.getTxtbxEmail(), "selva@mm.com");
		setText(pom.getTxtbxAboutYourself(), "About yourself option of the entire level program");
		setText(pom.getTxtbxPassword(), "chanan21215145");
		setText(pom.getTxtbxConfirmpassword(), "chanan21215145");
	}

	@Then("^verify entered firstname,lastname,phonenumber,username,email,aboutYourself,password,confirmpassword$")
	public void textBoxAssertVerification() throws Throwable {
		DemoQAPageFactory pom=new DemoQAPageFactory();
		
		String firstName=pom.getTxtbxFirstName().getAttribute("value");
		String lastName=pom.getTxtbxLastName().getAttribute("value");
		String phoneNumber=pom.getTxtbxPhonenumber().getAttribute("value");
		String userName=pom.getTxtbxUsername().getAttribute("value");
		String email=pom.getTxtbxEmail().getAttribute("value");
		String aboutYourSelf=pom.getTxtbxAboutYourself().getAttribute("value");
		String password=pom.getTxtbxPassword().getAttribute("value");
		String confirmPassword=pom.getTxtbxConfirmpassword().getAttribute("value");
	    Assert.assertEquals("selvakumar", firstName);
	    Assert.assertEquals("Murugesan", lastName);
	    Assert.assertEquals("9600854130", phoneNumber);
	    Assert.assertEquals("selvawin", userName);
	    Assert.assertEquals("selva@mm.com", email);
	    Assert.assertEquals("About yourself option of the entire level program", aboutYourSelf);
	    Assert.assertEquals("chanan21215145", password);
	    Assert.assertEquals("chanan21215145", confirmPassword);
	}
	@When("^user click anyone of radio button$")
	public void user_click_anyone_of_radio_button() throws Throwable {
	    DemoQAPageFactory pom=new DemoQAPageFactory();
		click(pom.getRadioMarried());
		
	}
	@Then("^user verify radio button selected or not$")
	public void user_verify_radio_button_selected_or_not() throws Throwable {
	    DemoQAPageFactory pom=new DemoQAPageFactory();
		boolean selected = pom.getRadioMarried().isSelected();
		Assert.assertTrue(selected);
		//closeApplication();
	}

	@When("^user click all check boxes in hobby section$")
	public void user_click_all_check_boxes_in_hobby_section() throws Throwable {
		List<WebElement> NumberOfCheckbox=driver.findElements(By.xpath("//input[@name='checkbox_5[]']"));
		for (int i = 1; i <=NumberOfCheckbox.size(); i++) {
			
			WebElement AllCheckboxHobby=driver.findElement(By.xpath("(//input[@name='checkbox_5[]'])["+i+"]"));
			click(AllCheckboxHobby);
		}
	}

	@Then("^user verify checkboxes checked or not$")
	public void user_verify_checkboxes_checked_or_not() throws Throwable {
	    DemoQAPageFactory pom=new DemoQAPageFactory();
		boolean cricket=pom.getChkbxhobbyCricket().isSelected();
		boolean dance=pom.getChkbxhobbyDance().isSelected();
		boolean reading=pom.getChkbxhobbyReading().isSelected();
		Assert.assertTrue(cricket && dance && reading);
		
	}

	@When("^user choose month,day and year$")
	public void user_choose_month_day_and_year() throws Throwable {
		DemoQAPageFactory pom=new DemoQAPageFactory();
	    dropDown(pom.getDropDownDobMonth(), "8");
	    dropDown(pom.getDropDownDobDay(), "1");
	    dropDown(pom.getDropDownDobYear(), "1990");
	}

	@Then("^user verify given Date of birth choosen or not$")
	public void user_verify_given_Date_of_birth_choosen_or_not() throws Throwable {
	    
	}
	

}
