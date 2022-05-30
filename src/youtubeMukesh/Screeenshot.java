package youtubeMukesh;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Screeenshot {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.gecko.driver", "/Users/netra/eclipse-workspace/geckodriver/geckodriver");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.facebook.com");
		driver.manage().window().maximize();
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		Files.copyFile(source, new File("./Screenshots/facebook.png"));
        System.out.println("screenshot taken");
        
		// Utility class
		Utility.capturescreenshot(driver, "Browser_started");
		driver.findElement(By.xpath(".//*[@id='u_0_1']")).sendKeys("netra");	
		Utility.capturescreenshot(driver, "netra"); 
        
        driver.quit();
	}

}
