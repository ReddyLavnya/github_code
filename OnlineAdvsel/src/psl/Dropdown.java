package psl;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("file:///C:/Users/user/Desktop/new%20html/hotel.html");
		
		Thread.sleep(2000);
		
		 WebElement ele = driver.findElement(By.xpath("//select[@id = 'hotel']"));
		
	       Select s = new Select(ele);
			Thread.sleep(2000); 
		
			//select multiple option and deselect**********************************
		/*	s.selectByIndex(0);
			Thread.sleep(2000);
			
			s.selectByValue("l");
			Thread.sleep(2000);
			
			s.selectByVisibleText("pizza");
			Thread.sleep(2000);
			
			s.deselectAll();		
			Thread.sleep(2000);    */
			
			//check whether drop down is multiselect  or not**********************************
			
	/*		boolean check = s.isMultiple();
			
			if(check)
			{
				System.out.println("it is  multiple");
			}
			else
			{
				System.out.println("it si not a multiple");
			}   */
			
			//check number of option present in the dropdown**********************************
			
			/*    List<WebElement> option = s.getOptions();
			      
			 int count = option.size();
			 
			 System.out.println(count);  */
			
			//fetch all the option and print******************************************** 
			 
			 
			   List<WebElement> fetch = s.getOptions();
			   
			   for(WebElement print : fetch)
			   {
				       String data = print.getText();
				       System.out.println(data);
				  // System.out.println(print.getText());
			   }
			
			
			
			
			
		driver.close();
		
		
	}

}
