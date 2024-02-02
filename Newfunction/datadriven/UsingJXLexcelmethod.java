package datadriven;

import java.io.FileInputStream;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class UsingJXLexcelmethod {

	/*Steps with JXL Jars
	 * 1.File location 
	 * 2.Get workbook 
	 * 3.Get sheet 
	 * 4.Get rows 
	 * 5.Get columns
	 * 6.iterate and get cell values
	 */
	
	String [][]data = null;
	WebDriver driver;
	@DataProvider(name ="logindata")
	public String[][] dataproiver() throws BiffException, IOException {
		data=getexceldata();
		return data;
	}
	
	  public String[][] getexceldata() throws BiffException, IOException{
	  
			FileInputStream excelfile = new FileInputStream("C:\\Users\\Ksnat\\Downloads\\book1.xls");
			Workbook workbook = Workbook.getWorkbook(excelfile);
			Sheet sheet =workbook.getSheet(0);
			int rowscount = sheet.getRows();
			int columncount=sheet.getColumns();
			
			String testdata[][] = new String[rowscount-1][columncount];
			for(int i =1; i<rowscount; i++) {
				for(int j=1;j<columncount;j++) {
					testdata[i-1][j] =	sheet.getCell(j, i).getContents();	
				}
			}
			return testdata;
			
	}
	
	
	@Test(dataProvider = "logindata")
	public void Loginwithcorrectpassword(String uname, String pword) {
		WebElement username = driver.findElement(By.className("oxd-input oxd-input--active"));
		username.sendKeys(uname);
		WebElement password = driver.findElement(By.className("oxd-input oxd-input--active"));
		password.sendKeys(pword);
		WebElement login = driver.findElement(By.className("oxd-button oxd-button--medium oxd-button--main orangehrm-login-button"));
		login.click();

}
}