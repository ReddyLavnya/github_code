package psl;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fileuploadpopup {
	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver" ,"./Software/chromedriver.exe" );
	WebDriver driver = new ChromeDriver();
	driver.get("file:///C:/Users/user/Desktop/new%20html/file.html");
	  WebElement ele = driver.findElement(By.xpath("//input[@id = 'upload']"));
	  Thread.sleep(2000);  
	  ele.sendKeys("C:\\Users\\user\\Desktop\\Mojari");
	  
	}
}
