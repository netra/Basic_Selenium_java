package youtubeMukesh;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;



public class VerifyTitle {
	
	@Test
	public void verifyApplicationTitle()
	{
		System.setProperty("webdriver.chrome.driver","/Users/netra/Downloads/selenium_new/ChromeDriver/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://learn-automation.com/");
		driver.manage().window().maximize();
		//String ActualTitle = driver.getPageSource();
		String ActualTitle = driver.getTitle();
		System.out.println("Actual title of the page is : "+  ActualTitle);
		String expectedTitle = "Selenium WebDriver Complete Selenium Webdriver tutorial guide Online";
	   
		Assert.assertEquals(ActualTitle, expectedTitle);
	    //Assert.assertTrue(ActualTitle.contains("Selenium WebDriver Complete Selenium Webdriver tutorial guide Online"));
	    System.out.println("Test passed page verified");
	    
	    driver.quit();
	    
	    
	}


}
