package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Profileupdatewithoutfindelements {

	@FindBy(xpath = "//*[contains(text(),'My Profile')]")
	public static WebElement Udateprofile;
	@FindBy(id = "Phone")
	public static WebElement updatePhone;
	@FindBy(id = "City")
	public static WebElement updateCity;
	@FindBy(partialLinkText = "Update Profile")
	public static WebElement Udateprofilebutton;


}
