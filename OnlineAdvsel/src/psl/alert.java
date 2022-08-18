package psl;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alert {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver" ,"./Software/chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		driver.findElement(By.name("cusid")).sendKeys("admine");
		Thread.sleep(2000);
		driver.findElement(By.name("submit")).click();
		Thread.sleep(2000);
	    Alert a = driver.switchTo().alert();
	       a.accept();  //click on OK
	    //   a.dismiss(); //click on cancel
	   
	       String text = a.getText();  //get the text of popup
	       System.out.println(text);
		
		
	}

}
