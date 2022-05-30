package youtubeMukesh;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandlingCheckbox {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "/Users/netra/eclipse-workspace/geckodriver/geckodriver");
		 WebDriver driver = new FirefoxDriver();
		 driver.get("http://seleniumpractise.blogspot.in/2016/08/how-to-automate-radio-button-in.html");
		 
		List<WebElement> checkBox =  driver.findElements(By.xpath("//input[@type='checkbox' and @name='lang']"));
		for(int i=0; i<checkBox.size(); i++) {
			WebElement local_checkBox = checkBox.get(i);
			String id = local_checkBox.getAttribute("id");
			System.out.println("VALUE FOR CHECKBOX BUTTON ARE : "+ id);
			
			if(id.equalsIgnoreCase("code")) {
				local_checkBox.click();
			
			}
		}
		driver.close();
	}

}
