package youtubeMukesh;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RadioAndCheckbox {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "/Users/netra/eclipse-workspace/geckodriver/geckodriver");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://seleniumpractise.blogspot.in/2016/08/how-to-automate-radio-button-in.html");
        List<WebElement> radio = driver.findElements(By.xpath("//input[@type='radio' and @name='lang']"));
        
        for(int i=0; i<radio.size(); i++)
        {
        	   WebElement local_radio = radio.get(i);
        	   String value = local_radio.getAttribute("value");
        	   System.out.println("Values from radio buttons are : "+value);
        	   
        	   if(value.equalsIgnoreCase("Ruby"))
        	   {
        		   local_radio.click();
        	   }
        	 
        }
        List<WebElement> checkbox =driver.findElements(By.xpath("//input[@type='checkbox' and @name='lang']"));
        for(int i=0; i<checkbox.size(); i++)
        {
        	    WebElement local_checkbox = checkbox.get(i);
        	    String id = local_checkbox.getAttribute("id");
        	    System.out.println("Values from checkbox are :" + id);
        	    
        	    if(id.equalsIgnoreCase("code"))
        	    {
        	    	   local_checkbox.click();
        	    }
        	    
        }
	}

}
