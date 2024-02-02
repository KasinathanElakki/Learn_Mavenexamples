package guru99demobank;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class Testcase1 {


	
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium training\\chromedriver-win64\\chromedriver.exe");
	
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://demo.guru99.com/V4/index.php");
		Thread.sleep(10000);
		driver.manage().window().maximize();
		
		PageFactory.initElements(driver, LoginBankPageObjects.class);
		//Login page
		LoginBankPageObjects.Username.sendKeys("mngr548997");
		LoginBankPageObjects.password.sendKeys("jAnEvYp");
		LoginBankPageObjects.submit.click();
		
		
		
		
				
		
	}

}
