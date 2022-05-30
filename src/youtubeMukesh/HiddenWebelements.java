package youtubeMukesh;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HiddenWebelements {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "/Users/netra/eclipse-workspace/geckodriver/geckodriver");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://seleniumpractise.blogspot.in/2016/08/how-to-automate-radio-button-in.html");
        List<WebElement> radio = driver.findElements(By.id("male"));
        
        for(int i=0; i<radio.size(); i++)
        {
        	   WebElement ele = radio.get(i);
        	   int x = ele.getLocation().getX();
        	   if(x!=0){
        		   ele.click();
        		   break;
        	   }
        }
        driver.close();
	}

}
/* normal case - if element is not hidden
 List<WebElement> radio = driver.findElements(By.id("male"));
        
        for(int i=0; i<radio.size(); i++)
        {
        	   WebElement ele = radio.get(i);
               String id = ele.getAttribute("id");
               System.out.println("Values from checkbox are :" + id);
   
               if(id.equalsIgnoreCase("male"))
               {
   	              ele.click();
   	              break;
                }
        }
*/
