package stepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.Select;

public class HelperClass {

	public static WebDriver driver;
	public static void getDriver(){
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		driver =  new ChromeDriver();
		driver.manage().window().maximize();
	}
	public static void closeApplication(){
		driver.quit();
	}
	public static void openApplication(String url){
		driver.get(url);
	}

	public void setText(WebElement ele, String txt){

		ele.sendKeys(txt);
	}
	public static void click(WebElement element){
		element.click();
	}

	public void dropDown(WebElement element, String name){
		Select d=new Select(element);
		d.selectByVisibleText(name);
	}


}
