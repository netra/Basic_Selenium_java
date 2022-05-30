package youtubeMukesh;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class ErrorMessage {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "/Users/netra/eclipse-workspace/geckodriver/geckodriver");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.gmail.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath(".//*[@id='next']")).click();
		Thread.sleep(2000)
;
	    String actual_error = driver.findElement(By.xpath(".//*[@id='errormsg_0_Email']")).getText();
	    String expected_error = "Please enter your email.";
	    // Type 1
	    Assert.assertEquals(actual_error, expected_error);
	    System.out.println("Test completed");
	    // Type 2
	    Assert.assertTrue(actual_error.contains("email"));
	    System.out.println("Test completed");
		driver.quit();
	}

}
