package psl;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Navigate {
	
	public static void main(String[] args) throws InterruptedException {
		 
		System.setProperty("webdriver.gecko.driver", "./Software/geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.navigate().to("https://www.amazon.com");
		 
		Thread.sleep(2000);
		
	/*	driver.navigate().to("https://www.facebook.com");
		
		Thread.sleep(2000);
		
		driver.navigate().back();
		
		Thread.sleep(2000);
		
		driver.navigate().refresh();
		
		Thread.sleep(2000);
		
		driver.navigate().forward();    */
		
	  List<WebElement> ele = driver.findElements(By.xpath("//a"));
	  
	        int a = gettext();
	        for(int i = 0; i< a ; i++)
	        {
	        WebElement ad = ele.get(i);
	          String text = ad.getText();
	          System.out.println(text);
	        }  
	  
	    	Thread.sleep(2000);
	/*  for (WebElement link : ele )
	  {
		  System.out.println(link.getText());
	  }      */
	        
		driver.close();    
		
	}

	private static int gettext() {
		// TODO Auto-generated method stub
		return 0;
	}

}
