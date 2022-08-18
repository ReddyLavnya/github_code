package bollywood;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Bollywood {
	public static void main(String[] args) throws InterruptedException
{
	
	System.setProperty("webdriver.gecko.driver","./Software/geckodriver.exe" );
	WebDriver driver = new FirefoxDriver();
	driver.get("https://www.bollymoviereviewz.com/2013/04/bollywood-box-office-collection-2013.html");
	Thread.sleep(4000);
	driver.findElement(By.xpath("//td[.='Thor 4']/../td[2]")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("//td[.='Hit The First Case']/following-sibling::td[1]")).click();
	Thread.sleep(4000);
//	driver.findElement(By.xpath("//b[.='Jug Jug Jeeyo']/following-sibling::td[2]")).getText();
//	Thread.sleep(4000);
	    Dimension dm = new Dimension(300, 400);
	driver.manage().window().setSize(dm);
	Thread.sleep(4000);
	     Point pn = new Point(200, 300);
	 driver.manage().window().setPosition(pn);
	  
	 driver.manage().window().maximize();
	
	driver.close();  
		}

}
//*[@id="gp-content"]/article/div[4]/table[1]/tbody/tr[2]/td[1]/a/b
///html/body/div[1]/div/div[2]/div[1]/div/div/article/div[4]/table[1]/tbody/tr[2]/td[1]/a/b
//driver.findElement(By.xpath("//b[.='Thor 4']/following-sibling::td[1]")).getText();