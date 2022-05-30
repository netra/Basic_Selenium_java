package youtubeMukesh;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouseover {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver","/Users/netra/Downloads/selenium_new/ChromeDriver/chromedriver");
		 WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://beta.connectedio.com/CIO/");
		WebElement ele = driver.findElement(By.xpath(".//*[@id='navbar-collapse']/ul/li[2]/a"));
		//WebElement ele1 = driver.findElement(By.xpath(".//*[@id='navbar-collapse']/ul/li[3]/a"));
		
		Actions act = new Actions(driver);
		act.moveToElement(ele).perform();
		
		/*act.moveToElement(ele1).perform();
		Thread.sleep(2000);*/
		
		List<WebElement> submenus = driver.findElements(By.xpath("//div[@class='row']//a[text()='All Products']"));
		for(int i=0; i<submenus.size(); i++){
			WebElement element = submenus.get(i);
			String text = element.getAttribute("innerHTML");
			boolean status = element.isEnabled();
			System.out.println("The submenu name is : " + text + "and the status is : " + status);
			
		}
		driver.close();

	}

}
