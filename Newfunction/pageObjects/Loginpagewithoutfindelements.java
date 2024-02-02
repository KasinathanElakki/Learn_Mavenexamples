package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Loginpagewithoutfindelements {

	
	@FindBy(how=How.XPATH, using ="//*[@class='nav-link dropdown-toggle btn ps-3 p-0 py-2 px-0 text-center d-flex align-items-center justify-content-center gap-0 border waves-effect']")
	public static WebElement ChangeLanguage;
	@FindBy(how=How.PARTIAL_LINK_TEXT, using ="English")
	public static WebElement englishlangauge;
	@FindBy(how=How.PARTIAL_LINK_TEXT, using ="Account")
	public static WebElement gotoAccounts;
	@FindBy(partialLinkText = "Login")
	public static WebElement gotoLoginpage;
	@FindBy(id = "email")
	public static WebElement Username;
	@FindBy(id = "password")
	public static WebElement passowrd;
	@FindBy(id = "submitBTN")
	public static WebElement submit;
	
}
