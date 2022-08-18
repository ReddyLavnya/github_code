package amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Amazon {
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "./Software/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		Thread.sleep(20000);
		driver.get("https://www.amazon.in");
		Thread.sleep(20000);
		String title = driver.getTitle();
		System.out.println(title);
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		 driver.findElement(By.xpath("//span[@class = 'nav-cart-icon nav-sprite']"));
	     Thread.sleep(4000);
		driver.quit();
	}

}
