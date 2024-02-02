package datadriven;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.util.SystemOutLogger;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class UsingPOIExcelMethod {

	
	//1. Read the file location
	//2.Create object for workbook
	//3.Go to the sheet to be worked on
	//4.Row iteration and get the row values
	//5.cell iteration and get the cell values
	//HSSF - excel 2003 files, XSSF - 2007 and later
	//HSSFWorkbook and XSSFWorkboork - to get the workbook
	//HSSFSheet and XSSFSheet are classes which act as an Excel worksheet 
	
	
	static List<String> usernamelist = new ArrayList<String>();
	static List<String> passwordlist = new ArrayList<String>();
	
	public void readExcel() throws IOException {
		FileInputStream excel = new FileInputStream("C:\\Users\\\\Ksnat\\Downloads\\book1.xlsx");
		Workbook workbook = new XSSFWorkbook(excel);
		org.apache.poi.ss.usermodel.Sheet sheet = workbook.getSheetAt(0);
		
		Iterator<Row> Rowiterator = sheet.iterator();
		while(Rowiterator.hasNext()) {
			Row rowvalue = Rowiterator.next();
			
		Iterator<Cell>	celliterator = rowvalue.iterator();
		int i=2;
		while(celliterator.hasNext()) {
			if(i%2==0) {
				usernamelist.add(celliterator.next().toString());
			}else {
				passwordlist.add(celliterator.next().getStringCellValue());
				}
			i++;
			}	
		}
	}
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		UsingPOIExcelMethod us = new UsingPOIExcelMethod();
		us.readExcel();
  System.out.println("username list is" +usernamelist);
  System.out.println("password list is" +passwordlist);
	}

}
