package check;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Check {

	public static void main(String[] args) throws InterruptedException
	{
		
		System.setProperty("webdriver.gecko.driver","./Software/geckodriver.exe" );
		WebDriver driver = new FirefoxDriver();
		driver.get("file:///C:/Users/user/Desktop/new%20html/check.html");
		Thread.sleep(4000);

		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		
		
		Thread.sleep(60000);
	
		driver.close();
			}

}
