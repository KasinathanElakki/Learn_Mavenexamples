package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProfileUpdateObjects {

	public static WebElement Udateprofile(WebDriver driver) {
		return driver.findElement(By.xpath("//*[contains(text(),'My Profile')]"));

	}
	public static WebElement updatePhone(WebDriver driver) {
		return driver.findElement(By.id("Phone"));
	}

	public static WebElement updateCity(WebDriver driver) {
		return driver.findElement(By.id("City"));
	}

	public static WebElement Udateprofilebutton(WebDriver driver) {
		return driver.findElement(By.partialLinkText("Update Profile"));
	}

}
