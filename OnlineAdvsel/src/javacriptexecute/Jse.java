package javacriptexecute;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Jse {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver","./Software/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("file:///C:/Users/user/Desktop/new%20html/disable.html");
		
		Thread.sleep(2000);
		
	    JavascriptExecutor jse = (JavascriptExecutor)driver;
	    
	    //pass the data in disable element 
	    
	    jse.executeScript("document.getElementById('a1').value = 'xyz'");
	    
	    Thread.sleep(2000);
         //clear the data in disable element 
	    
	    jse.executeScript("document.getElementById('a1').value = ' '");
		
		
		
		
	}

}
