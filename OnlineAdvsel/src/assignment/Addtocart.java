package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Addtocart {
public static void main(String[] args) throws InterruptedException {
		
	System.setProperty("webdriver.gecko.driver","./Software/geckodriver.exe");
	 WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.amazon.in/");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@aria-label = 'Search']")).sendKeys("tops for women" +Keys.ENTER);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//img[@src = 'https://m.media-amazon.com/images/I/61XpLLkZZtL._AC_UL320_.jpg']")).click();
		Thread.sleep(2000);
		
		driver.close();

}
}
