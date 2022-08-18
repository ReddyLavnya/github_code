package takescreenshot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Tss {
	


	public static void main(String[] args) throws IOException, InterruptedException {
		
		System.setProperty("webdriver.gecko.driver","./Software/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.amazon.in");
		Thread.sleep(2000);
		
		//step1:
	  TakesScreenshot tss = (TakesScreenshot)driver;
	  
	   //step2:
	     File src = tss.getScreenshotAs(OutputType.FILE);
	     
	     //step3: 
	     File dst = new File("./Photos/a1.png");
	     
	     //step4:
	    FileUtils.copyFile(src, dst);
	}

}
