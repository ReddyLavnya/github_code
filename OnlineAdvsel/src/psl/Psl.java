package psl;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Psl {
	public static void main(String[] args) throws InterruptedException {
		
	System.setProperty("webdriver.gecko.driver","./Software/geckodriver.exe");
	 WebDriver driver = new FirefoxDriver();
//	 driver.get("https://www.amazon.in/?tag=admpdesktopin-21&ref=pd_sl_112da17f5f3ef01e0314055140e7e3155ebf556a570c6905495a6e77&mfadid=adm");
	driver.get("file:///C:/Users/user/Desktop/new%20html/text.html");
//	driver.get("file:///C:/Users/user/Desktop/new%20html/chck1.html");
//	 String title = driver.getTitle();
//	System.out.println(title);
	
//	 String url = driver.getCurrentUrl();
//	 System.out.println(url);
	 
	// driver.findElement(By.tagName("a")).click();
	//   driver.findElement(By.id("a1")).click(); 
	// driver.findElement(By.name("N1")).click();
	// driver.findElement(By.className("C1")).click();
	 
	// driver.findElement(By.tagName("input")).sendKeys("hellooo");
	//	   driver.findElement(By.id("A2")).sendKeys("heyyy");
	//	driver.findElement(By.name("N2")).clear();
		// driver.findElement(By.className("C1")).click();
		   
	//	driver.findElement(By.linkText("google")).click();   
		 
	// driver.findElement(By.partialLinkText("goog")).click();
	 
	/* driver.findElement(By.xpath("//input[@type = 'text']")).sendKeys("hello");
	 driver.findElement(By.xpath("//input[@type = 'password']")).sendKeys("hey hii");
	 driver.findElement(By.xpath("//input[@type = 'button']")).click();
	 Thread.sleep(4000);
	 	 driver.quit(); */
	 
	// driver.manage().window().maximize();
	//      Dimension dm = new Dimension(200, 500);  
	//      driver.manage().window().setSize(dm);
	//	 driver.quit();
	 
	    //       Point pn = new Point(200, 300);
	   //        driver.manage().window().setPosition(pn);
	
	 
	 //by using is displayed web element *****************************************
	Thread.sleep(3000);	
	
	/*     WebElement ele = driver.findElement(By.id("a1"));
	     Thread.sleep(3000);	
	      boolean b = ele.isDisplayed();
	      System.out.println(b);
	      
	   /*   if(b)
	      {
	    	  System.out.println("textfield is didsplayed");
	      }
	      else 
	      {
	    	  System.out.println("text field is not displayed");
	      }
		*/
		
	//by using is enabled web element *******************************************	
		
	/*	WebElement wele = driver.findElement(By.id("a1"));
		Thread.sleep(3000);	
		boolean bool = wele.isEnabled();
		System.out.println(bool);
	/*	if(bool)
		{
			System.out.println(" textfield is Enabled");
		}
		else
		{
			System.out.println("text field is not Enabled");
		}
		   */
		
		
	/*	
	     WebElement lavi = driver.findElement(By.tagName("input"));
		Thread.sleep(3000);
		 Boolean reddy = lavi.isSelected();
		  
		 System.out.println(reddy);   */
		
		
		driver.close();
	/*	if (reddy)
		{
			System.out.println("is it selected");
		}
		else
		{
			System.out.println("its not selected");
		}  */
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*		//which is used to launch the browser
		String key = "webdriver.chrome.driver";
		//the path of driver executable file
		String value = "./Software/chromedriver.exe";
		System.setProperty(key, value);
		 ChromeDriver ch = new ChromeDriver();
		Thread.sleep(4000);
		ch.close();  */
		
		
	}

}
