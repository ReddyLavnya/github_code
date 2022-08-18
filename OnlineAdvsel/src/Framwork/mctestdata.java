package Framwork;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class mctestdata {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
			FileInputStream fis = new FileInputStream("./Excel/Testdata.xlsx");
		  
		   Workbook book = WorkbookFactory.create(fis);
		   
		   Sheet sheet = book.getSheet("Sheet1");
		   
			System.setProperty("webdriver.gecko.driver","./Software/geckodriver.exe" );
			
		WebDriver driver = new FirefoxDriver();
		
	driver.get("https://www.amazon.in");
	
	 List<WebElement> ele = driver.findElements(By.xpath("//a"));
	 
	 for(int i = 0 ; i<ele.size(); i++)
	 {
		           Row row = sheet.createRow(i) ;
		           Cell cell = row.createCell(0);
		           cell.setCellValue(ele.get(i).getAttribute("href"));
	 }
	 FileOutputStream fos =new FileOutputStream("./Excel/Testdata.xlsx");
	 book.write(fos);
	 }

	
	}
	
		
	


