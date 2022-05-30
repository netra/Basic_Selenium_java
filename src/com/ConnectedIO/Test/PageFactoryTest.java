package com.ConnectedIO.Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.ConnectedIO.Helper.BrowserFactory;
import com.ConnectedIO.Pages.LoginPage;
import com.ConnectedIO.Pages.PageFoctoryLogin;

public class PageFactoryTest {
WebDriver driver;
	
	@Test
	public void pagefactoreLoginTest(){
		BrowserFactory.startBrowser("firefox","http://beta.connectedio.com/CIO/");
		PageFoctoryLogin pfLogin = PageFactory.initElements(driver, PageFoctoryLogin.class);
		
		LoginPage login1 = PageFactory.initElements(driver, LoginPage.class);
		pfLogin.pagefactoryLogin("netra.motgi@googlemail.com", "connectedio");
	}
}
