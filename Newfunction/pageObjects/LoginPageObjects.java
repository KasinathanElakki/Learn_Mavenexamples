package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPageObjects {

	public static WebElement changelanguages(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@class='nav-link dropdown-toggle btn ps-3 p-0 py-2 px-0 text-center d-flex align-items-center justify-content-center gap-0 border waves-effect']"));	
	}
	
	public static WebElement englishlangauge(WebDriver driver) {
		return driver.findElement(By.partialLinkText("English"));
	}
	
	public static WebElement gotoAccounts(WebDriver driver) {
		return driver.findElement(By.partialLinkText("Account"));
	}
	
	public static WebElement gotoLoginpage(WebDriver driver) {
		return driver.findElement(By.partialLinkText("Login"));
		
	}
	public static WebElement Username(WebDriver driver) {
		return driver.findElement(By.id("email"));
	}
	
	public static WebElement passowrd(WebDriver driver) {
		return driver.findElement(By.id("password"));
	}

	public static WebElement submit(WebDriver driver) {
		return driver.findElement(By.id("submitBTN"));	
	}
}
