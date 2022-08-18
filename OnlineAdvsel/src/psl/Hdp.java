package psl;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hdp {

	public static void main(String[] args) throws InterruptedException, AWTException {
		
		System.setProperty("webdriver.chrome.driver" ,"./Software/chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.get("https://wallpapercave.com/yash-hd-wallpapers");
		
		// driver.get("https://www.redbus.in/")
     /* driver.findElement(By.xpath("//label[. = 'Date']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//td[. = '29']")).click();  */
		
		Thread.sleep(2000);
		 driver.findElement(By.xpath("//img [src = '/wp/wp4082081.jpg']")).click();
		    Robot r = new Robot();
		    
		    r.keyPress(KeyEvent.VK_LEFT);
		    r.keyRelease(KeyEvent.VK_LEFT);
		    
		    Thread.sleep(1000);
		    
		    r.keyPress(KeyEvent.VK_ENTER);
		    r.keyRelease(KeyEvent.VK_ENTER);
		    
		    
		
		  
		
}	
}