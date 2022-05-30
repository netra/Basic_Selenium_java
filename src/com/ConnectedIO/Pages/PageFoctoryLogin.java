package com.ConnectedIO.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class PageFoctoryLogin {
	
	WebElement driver;
	
	public PageFoctoryLogin(WebElement driver){
		this.driver=driver;
	}
	
	@FindBy(xpath="//a[text()='Login']")
	WebElement loginmenu;
	@CacheLookup
	
	@FindBy(how=How.NAME,using="username")
    WebElement username;
	@CacheLookup
	
	@FindBy (how=How.XPATH, using="//input[@name='loginpassword']")
	WebElement password;
	@CacheLookup
	
	@FindBy (how=How.ID,using="submit_button")
	WebElement submitbutton;
	
	public void pagefactoryLogin(String userid, String pass){
		loginmenu.click();
		username.sendKeys(userid);
		password.sendKeys(pass);
	    submitbutton.click();
	}
	
}
