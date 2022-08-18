package psl;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Webele {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver","./Software/geckodriver.exe");
		 WebDriver driver = new FirefoxDriver();
		// driver.get("file:///C:/Users/user/Desktop/link.html");
		 driver.get("https://www.facebook.com/");
		 Thread.sleep(3000);
		 
		 //WAS to perform action on a link without using click method *****
	/*	  WebElement ele = driver.findElement(By.xpath("//a[.=' google ']"));
		    Thread.sleep(4000); 
		         ele.sendKeys(Keys.ENTER);
		         Thread.sleep(4000);  */  
		 
		 
		 //WAS to fetch the tool tip or attribute value of an element *******************************
	
	/*	  WebElement ele = driver.findElement(By.xpath("//a[.=' google ']"));
		  
		     String name = ele.getAttribute("href");
		 
		 System.out.println(name); */
		 
		 //WAS to fetch text of an element*********************************************
		 
	/*	 WebElement ele = driver.findElement(By.xpath("//button[.='Log In']"));
		 
		   String text = ele.getText();
		   System.out.println(text);           */
		   
		//WAS to fetch the location of an element ****************************************** 
	/*	 WebElement ele = driver.findElement(By.xpath("//button[.='Log In']"));
		  
		Point loc = ele.getLocation();
		
		int a = loc.getX();
		System.out.println(a);
		
		int b = loc.getY();
		System.out.println(b);
		
		//System.out.println(loc);   */
		 
		//was to fetch  
		 
		 WebElement ele = driver.findElement(By.id("email"));
		   String size = ele.getCssValue("font-size");
		   System.out.println(size);
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		         driver.close();
	}

}
