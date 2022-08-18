package Byown;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class pslbyown {
	public static void main(String[] args) throws InterruptedException {
		
	
	
	System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	 driver.get("https://www.youtube.com");
	
	Thread.sleep(2000);
	
	
	
	

  /*  WebElement ele = driver.findElement(By.name("search_query"));
    ele.sendKeys("chandanshetty");
    Thread.sleep(2000);
    ele.sendKeys(Keys.ENTER);
    Thread.sleep(2000);
    WebElement ele1 = driver.findElement(By.linkText("PARTY FREAK | CHANDAN SHETTY | NEW KANNADA SONG | OFFICIAL MUSIC VIDEO 4K | UNITED AUDIOS"));
    ele1.click();
    Thread.sleep(6000);  */
    
    
	     WebElement ele = driver.findElement(By.name("search_query"));
	     ele.sendKeys("night changes");
	     Thread.sleep(2000);
	     ele.sendKeys(Keys.ENTER);
	     Thread.sleep(2000);
	     WebElement ele1 = driver.findElement(By.linkText("One Direction - Night Changes (Lyrics)"));
	     ele1.click();
	     Thread.sleep(60000); 
	     
	     
	
	
	
	/*WebElement ele = driver.findElement(By.xpath("//select[@ class = 'nav-search-dropdown searchSelect nav-progressive-attrubute nav-progressive-search-dropdown']"));
	
	ele.click();
	
	Thread.sleep(2000);
	
	Select dd = new Select(ele) ;
	Thread.sleep(2000);
	
	dd.selectByIndex(4);
	Thread.sleep(4000); */
	
	
	driver.close();
	
 	      
	}
}



// driver.findElement(By.xpath("//select[@ class = 'nav-search-dropdown searchSelect nav-progressive-attrubute nav-progressive-search-dropdown']")).click();