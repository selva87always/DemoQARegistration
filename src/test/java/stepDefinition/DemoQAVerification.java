package stepDefinition;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import POM.DemoQAPageFactory;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DemoQAVerification extends HelperClass{
	
	@Given("^user launch browser & open Demo QA Registration page$")
	public void user_launch_browser_open_Demo_QA_Registration_page() throws Throwable {
	    getDriver();
		openApplication("http://demoqa.com/registration/");
	    
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
		closeApplication();
	}

	@When("^user click all check boxes in hobby section$")
	public void user_click_all_check_boxes_in_hobby_section() throws Throwable {
	    for (int i = 1; i <=3; i++) {
			
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
		closeApplication();
	}

	@Then("^user verify default country selected or not in country field$")
	public void user_verify_default_country_selected_or_not_in_country_field() throws Throwable {
		DemoQAPageFactory pom=new DemoQAPageFactory();
		Select s= new Select(pom.getDropDownCountry());
		String text = s.getFirstSelectedOption().getText();
		Assert.assertEquals("Afghanistan", text);
		closeApplication();
	    
	}

}
