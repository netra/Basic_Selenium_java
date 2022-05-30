/**
 * 
 */
package com.ConnectedIO.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * @author Netra
 *
 */
public class LoginPage {
	
	WebDriver driver;
	
	By loginMenu = By.xpath("//a[text()='Login']");
	By username = By.name("username");
	By password = By.xpath("//input[@name='loginpassword'] ");
    By submitButton = By.id("submit_button");
    
    public LoginPage(WebDriver driver){
    	this.driver = driver;
    }
    
    public void loginpage(String userid, String pass){
    	driver.findElement(loginMenu).click();
    	driver.findElement(username).sendKeys(userid);
    	driver.findElement(password).sendKeys(pass);
    	driver.findElement(submitButton).click();
    }
}
