package javacriptexecute;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Scroll {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","./Software/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.amazon.in");
		
		Thread.sleep(2000);
		
       JavascriptExecutor jse = (JavascriptExecutor)driver;
      
      jse.executeScript("window.scrollby(0,500)");
     
      
	
	}

}
