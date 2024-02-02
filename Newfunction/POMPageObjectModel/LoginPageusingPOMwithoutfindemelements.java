package POMPageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import pageObjects.LoginPageObjects;
import pageObjects.Loginpagewithoutfindelements;

public class LoginPageusingPOMwithoutfindemelements {

	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium training\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.phptravels.net/login");
		
		//createobject to get the methods from other classes   or use static option to get methods 
		//LoginPageObjects loginobjects = new LoginPageObjects();
		
		PageFactory.initElements(driver, Loginpagewithoutfindelements.class);
		
		Loginpagewithoutfindelements.Username.sendKeys("user@phptravels.com");
		Loginpagewithoutfindelements.passowrd.sendKeys("demouser");
		Loginpagewithoutfindelements.submit.click();
		
	}
	}

