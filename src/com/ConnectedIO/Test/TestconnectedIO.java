/**
 * 
 */
package com.ConnectedIO.Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import com.ConnectedIO.Pages.LoginPage;

/**
 * @author  Netra
 *
 */
public class TestconnectedIO {
	
	WebDriver driver;
	
	@Test
	public void connectedIO(){
	    driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://beta.connectedio.com/CIO/");
		
		LoginPage loginpage = new LoginPage(driver);
		loginpage.loginpage("netra.motgi@googlemail.com", "connectedio");
		driver.close();
	}
	
	
}
