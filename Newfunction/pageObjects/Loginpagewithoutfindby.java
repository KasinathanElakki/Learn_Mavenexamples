package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class Loginpagewithoutfindby {

	//provide webelement id directly incase if it has Id
	
	public static WebElement username;
	public static WebElement password;
	

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Selenium training\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
	
		PageFactory.initElements(driver, Loginpagewithoutfindby.class);
		
	username.sendKeys("Admin");
	password.sendKeys("admin123");
		

	}

}
