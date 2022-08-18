package Framwork;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.commons.math3.optim.linear.SolutionCallback;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class testdata {
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		     FileInputStream fis = new FileInputStream("./Excel/Testdata.xlsx");
		     
		           Workbook book = WorkbookFactory.create(fis);
		           
		           Sheet sheet = book.getSheet("Sheet1");
		            
		      /*      Row row = sheet.getRow(0);
		            
		            Cell cell = row.getCell(0);
		            
		           String value = cell.getStringCellValue();	
		           System.out.println(value);  */
		           
		            Row row = sheet.createRow(3);
		            
		            Cell cell = row.createCell(3);
		            
		            cell.setCellValue("GULBARGA");
		            
		          FileOutputStream fos = new FileOutputStream("./Excel/Testdata.xlsx");
		          
		          book.write(fos);
		           
		              
		           
		           
		           
		           
	}

}
