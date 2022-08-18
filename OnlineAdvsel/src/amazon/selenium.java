package amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class selenium {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver","./Software/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		Thread.sleep(4000);
		driver.get("file:///C:/Users/user/Desktop/link.html");
	//	WebElement ele = driver.findElement(By.tagName("a"));
	//	ele.click();
		
	//	driver.findElement(By.id("A1")).click();
	//	driver.findElement(By.name("N1")).click();
		driver.findElement(By.className("C1")).click();    
		
	}
}
