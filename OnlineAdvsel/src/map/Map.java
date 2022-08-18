package map;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Map {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		 driver.get("https://www.google.com/maps/@12.959744,77.6470528,12z");
		
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  
	     driver.findElement(By.xpath("//button[@aria-label ='Directions']")).click();
		
		 driver.findElement(By.xpath("//input [ @aria-label = 'Choose starting point, or click on the map...']")).sendKeys("Bengaluru, Karnataka");
		
		 driver.findElement(By.xpath("//input[@aria-label  = 'Choose destination, or click on the map...']")).sendKeys("Mysuru, Karnataka");
		
		 driver.findElement(By.xpath("//img[@aria-label = 'Driving']")).click();
		  
		 driver.findElement(By.xpath("//span[. = 'NH948']")).click();
		 


 
	}

}




//input[@class='tactile-searchbox-input']
//img[@aria-label = 'Driving']
//span[. = 'NH948']