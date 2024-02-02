package POMPageObjectModel;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import pageObjects.LoginPageObjects;
import pageObjects.ProfileUpdateObjects;

public class ProfileUpdatepage {


	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Selenium training\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.phptravels.net/login");
		WebDriverWait wait = new WebDriverWait(driver, 60);
		
		
		//change Language
		LoginPageObjects.changelanguages(driver).click();
		Thread.sleep(10000);
		LoginPageObjects.englishlangauge(driver).click();
		Thread.sleep(10000);
		//click on Accounts and move to login page
		LoginPageObjects.gotoAccounts(driver).click();
		LoginPageObjects.gotoLoginpage(driver).click();
		
		//login
		LoginPageObjects.Username(driver).sendKeys("user@phptravels.com");
		LoginPageObjects.passowrd(driver).sendKeys("demouser");
		LoginPageObjects.submit(driver).click();
		
		//update profile
		wait.until(ExpectedConditions.elementToBeClickable(ProfileUpdateObjects.Udateprofile(driver))).click();
		ProfileUpdateObjects.updatePhone(driver).sendKeys("2345676543");
		ProfileUpdateObjects.updateCity(driver).sendKeys("los angeles");
		ProfileUpdateObjects.Udateprofilebutton(driver).click();
		






	}

}
