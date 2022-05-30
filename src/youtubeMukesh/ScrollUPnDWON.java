package youtubeMukesh;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ScrollUPnDWON {

	public static void main(String[] args) throws Throwable  {
	    System.setProperty("webdriver.gecko.driver", "/Users/netra/eclipse-workspace/geckodriver/geckodriver");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://jqueryui.com/");
		
		Thread.sleep(3000);
		
		((JavascriptExecutor)driver).executeScript("scroll(0,400)");
        driver.close();
	}

}
