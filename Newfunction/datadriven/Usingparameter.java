package datadriven;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Usingparameter {

	WebDriver driver;

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
	@Test
	@Parameters({"username","password"})
	public void Loginwithcorrectpassword(String uname, String pword) {
		WebElement username = driver.findElement(By.className("oxd-input oxd-input--active"));
		username.sendKeys(uname);
		WebElement password = driver.findElement(By.className("oxd-input oxd-input--active"));
		password.sendKeys(pword);
		WebElement login = driver.findElement(By.className("oxd-button oxd-button--medium oxd-button--main orangehrm-login-button"));
		login.click();
	}
	@Test
	public void Loginwithincorrectpassword() {
		WebElement username = driver.findElement(By.className("oxd-input oxd-input--active"));
		username.sendKeys("");
		WebElement password = driver.findElement(By.className("oxd-input oxd-input--active"));
		password.sendKeys("");
		WebElement login = driver.findElement(By.className("oxd-button oxd-button--medium oxd-button--main orangehrm-login-button"));
		login.click();
	}

	@Test
	public void LoginwithincorrectUsername() {
		WebElement username = driver.findElement(By.className("oxd-input oxd-input--active"));
		username.sendKeys("");
		WebElement password = driver.findElement(By.className("oxd-input oxd-input--active"));
		password.sendKeys("");
		WebElement login = driver.findElement(By.className("oxd-button oxd-button--medium oxd-button--main orangehrm-login-button"));
		login.click();
	}

	@Test
	public void LoginwithincorrectUsernamePassword() {
		WebElement username = driver.findElement(By.className("oxd-input oxd-input--active"));
		username.sendKeys("");
		WebElement password = driver.findElement(By.className("oxd-input oxd-input--active"));
		password.sendKeys("");
		WebElement login = driver.findElement(By.className("oxd-button oxd-button--medium oxd-button--main orangehrm-login-button"));
		login.click();
	}




}
