package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		 
		WebDriver driver = new ChromeDriver();
		
		driver.get("file:///C:/Users/user/Desktop/new%20html/ASQ.html");
		 
		Thread.sleep(4000);
		
		      WebElement ele = driver.findElement(By.id("a1"));
		      
		  	Thread.sleep(2000); 
		  	 
		  	ele.sendKeys(Keys.CONTROL +"a");
			Thread.sleep(2000);
			
			ele.sendKeys(Keys.DELETE);
			 
			driver.findElement(By.id("b1")).sendKeys("ADV selenium");
			Thread.sleep(2000);
			
			driver.close();
		      
		
	}

}
