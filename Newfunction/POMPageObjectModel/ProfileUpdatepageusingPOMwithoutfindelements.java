package POMPageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import pageObjects.LoginPageObjects;
import pageObjects.Loginpagewithoutfindelements;
import pageObjects.ProfileUpdateObjects;
import pageObjects.Profileupdatewithoutfindelements;

public class ProfileUpdatepageusingPOMwithoutfindelements {

	

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium training\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.phptravels.net/login");
		WebDriverWait wait = new WebDriverWait(driver, 60);
		
		
		
		PageFactory.initElements(driver, Loginpagewithoutfindelements.class);
		//change Language
		Loginpagewithoutfindelements.ChangeLanguage.click();
		Thread.sleep(10000);
		Loginpagewithoutfindelements.englishlangauge.click();
		Thread.sleep(10000);
		//click on Accounts and move to login page
		Loginpagewithoutfindelements.gotoAccounts.click();
		Loginpagewithoutfindelements.gotoLoginpage.click();
		//login
		Loginpagewithoutfindelements.Username.sendKeys("user@phptravels.com");
		Loginpagewithoutfindelements.passowrd.sendKeys("demouser");
		Loginpagewithoutfindelements.submit.click();
		
		
		PageFactory.initElements(driver, Profileupdatewithoutfindelements.class);
		//update profile
		wait.until(ExpectedConditions.elementToBeClickable(Profileupdatewithoutfindelements.Udateprofile)).click();
		Profileupdatewithoutfindelements.updatePhone.sendKeys("2345676543");
		Profileupdatewithoutfindelements.updateCity.sendKeys("Los Angels");
		Profileupdatewithoutfindelements.Udateprofilebutton.click();

		



	}

}
