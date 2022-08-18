package Framwork;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class lrTestdata {
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		  FileInputStream fis = new FileInputStream("./Excel/Testdata.xlsx");
		  
		   Workbook book = WorkbookFactory.create(fis);
		   
		   Sheet sheet = book.getSheet("Sheet1");
		   
		       int rowcount = sheet.getLastRowNum();
		      
		       // System.out.println(rowcount);
		   //loop for row
		     for(int i =0; i<=rowcount; i++)
		   {
		   
		      Row row = sheet.getRow(i);
		      
		      //loop for cell
		        int cellcount = row.getLastCellNum();
		        for(int j = 0; j<=cellcount; j++)
		        {
		      
		      Cell cell = row.getCell(j);
		        
		     
		      System.out.print(cell.toString() + "||");
		        }  
		   }
	}
}
