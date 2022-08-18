package psl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ddscript {
	
	public static void main(String[] args) throws InterruptedException {
	//	TreeSet<String> a = new TreeSet<String>(Collections.reverseOrder());	
	//	ArrayList<String> a = new ArrayList<String>();
		TreeSet<String> a = new TreeSet<String>();
	System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("file:///C:/Users/user/Desktop/new%20html/hotel.html");
		
		Thread.sleep(2000);
		
		 WebElement ele = driver.findElement(By.id("hotel"));
		
	       Select s = new Select(ele);
			Thread.sleep(2000); 
			
			    List<WebElement> option = s.getOptions();
			
			for(WebElement value : option)
			{
				a.add(value.getText());
			}
		   //  Collections.sort(a,Collections.reverseOrder());
			//Collections.sort(a);
			
			for(String o : a)
		    {
				System.out.println(o);
			}
		driver.close();
	}

}
