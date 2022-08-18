package actitime;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Actitime {
	public static void main(String[] args) throws InterruptedException
	{
		
		System.setProperty("webdriver.gecko.driver","./Software/geckodriver.exe" );
		WebDriver driver = new FirefoxDriver();
	//	driver.get("http://localhost/login.do");
		driver.get("https://www.bollymoviereviewz.com/2013/04/bollywood-box-office-collection-2013.html");
		Thread.sleep(2000);
	/*	driver.findElement(By.xpath("//input[@name = 'username']")).sendKeys("admin");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name = 'pwd']")).sendKeys("manager");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text() = 'Login ']")).click();
		Thread.sleep(4000);
		driver.close();   */
		

		
			}

}
//driver.findElement(By.name("username")).sendKeys("admin");
//driver.findElement(By.name("pwd")).sendKeys("manager");