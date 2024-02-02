package POMPageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import pageObjects.LoginPageObjects;

public class LoginPage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium training\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.phptravels.net/login");
		
		//createobject to get the methods from other classes   or use static option to get methods 
		//LoginPageObjects loginobjects = new LoginPageObjects();
		
		LoginPageObjects.Username(driver).sendKeys("user@phptravels.com");
		LoginPageObjects.passowrd(driver).sendKeys("demouser");
		LoginPageObjects.submit(driver).click();
	
	}

}
