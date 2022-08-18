package instagram;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Insta {
	
	public static void main(String[] args)  {
		
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://www.instagram.com/accounts/login/");
		
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  
		driver.findElement(By.name("username")).sendKeys("__lavanya_reddy___");
	    
	    driver.findElement(By.name("password")).sendKeys("lavanyaR@786");
	    
	    driver.findElement(By.xpath("//div[. = 'Log In']")).click();
	    
     //  WebDriverWait wait = new WebDriverWait(driver, 10);
		
	//	wait.until(ExpectedConditions.titleContains("Enter"));
		
		driver.findElement(By.xpath("//a[@href = '/direct/inbox/']")).click();
		
		driver.findElement(By.xpath("//div[. = 'Sharnu Ak']")).click();
		
	         driver.findElement(By.xpath("//textarea[. = '']")).sendKeys("soumya" + Keys.ENTER);
	    
                       
	
	
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    //div[. = 'Log In']
		
		
		
		//*[@id="loginForm"]/div/div[1]/div/label/input
		
	   // "//input[@value = '__lavanya_reddy___']"
		//__lavanya_reddy___
	
	}

}
