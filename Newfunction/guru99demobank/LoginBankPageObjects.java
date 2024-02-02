package guru99demobank;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginBankPageObjects {

	@FindBy(name = "uid")
	public static WebElement Username;
	@FindBy(how = How.NAME, using ="password")
	public static WebElement password;
	@FindBy(name = "btnLogin")
	public static WebElement submit;
	
	
	
}
