package datadriven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class UsingTestNGdataprovider {

	WebDriver driver;

	String [][]data = {
				{"username1", "password1"},
				{"username2", "password2"},
				{"username3", "password3"},
				{"username4", "password4"}
	};
	
	
	
	@DataProvider(name ="logindata")
	public String[][] dataproiver() {
		
		return data;
	}
	
	@BeforeTest
	public void Beforetest() {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium training\\chromedriver-win64\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}
	@AfterTest
	public void aftertest() {
		driver.quit();
	}
	@Test(dataProvider = "logindata")
	@Parameters({"username","password"})
	public void Loginwithcorrectpassword(String uname, String pword) {
		WebElement username = driver.findElement(By.className("oxd-input oxd-input--active"));
		username.sendKeys(uname);
		WebElement password = driver.findElement(By.className("oxd-input oxd-input--active"));
		password.sendKeys(pword);
		WebElement login = driver.findElement(By.className("oxd-button oxd-button--medium oxd-button--main orangehrm-login-button"));
		login.click();
	}
	}
