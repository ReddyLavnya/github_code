package amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Textfield {
	public static void main(String[] args) throws InterruptedException {
		
	System.setProperty("webdriver.gecko.driver","./Software/geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
	Thread.sleep(4000);
	driver.get("file:///C:/Users/user/Desktop/new%20html/Textfield.html");
	
	//driver.findElement(By.tagName("input")).clear();
     // driver.findElement(By.id("A2")).clear();
    //  driver.findElement(By.name("N2")).clear();
	    driver.findElement(By.className("C2")).clear();
}
}

