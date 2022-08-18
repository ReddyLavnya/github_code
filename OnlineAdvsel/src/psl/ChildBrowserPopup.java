package psl;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ChildBrowserPopup {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./Software/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://skpatro.github.io/demo/links/");
		Thread.sleep(2000);
		//WAS to fetch parent id***********************************************
		 String parent_id = driver.getWindowHandle();
		 System.out.println("parent_id : " + parent_id);
		 
		 //WAS tofetch both parent and child************************************
		 driver.findElement(By.xpath("//input[@name='NewWindow']")).click();
		 Thread.sleep(2000);
		    Set<String> all_id = driver.getWindowHandles();
		  //  System.out.println("all_id : " + all_id);
   /*     for(String id : all_id)
        {
        	System.out.println(id);
        } */
       
        //WAS to switch the  control from one tab to another ************************
        
     /*   for(String tab : all_id)
        {
        	driver.switchTo().window(tab);
        	 Thread.sleep(2000);
            String title = driver.getTitle();
            System.out.println(title);
            Thread.sleep(2000);
        }   */
		    
	    //WAS to perform close only parent browser***************************************
		    
		/*    for (String id : all_id)
		    {
		       driver.switchTo().window(id);
		           String title1 = driver.getTitle();
		           System.out.println(title1);
		           Thread.sleep(2000);
		           
		           if(parent_id.equals(id))
		           {
		        	   driver.close();
		           }
		           
		    }   */
		    
		    //WAS to perform close only child Browser********************************
           
		    
		    all_id.remove(parent_id);
		    
		    
	        for(String id1 : all_id)
	        {
	        	driver.switchTo().window(id1);
	        	           String title2 = driver.getTitle();
	        	           Thread.sleep(2000);
	        	         driver.close();   
	        	           
	        }
	
	
	}
	
	
	
}

