package youtubeMukesh;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;


public class DropDownDemo {
    
	@Test
	public void selectDDValues()
	{
		System.setProperty("webdriver.gecko.driver", "/Users/netra/eclipse-workspace/geckodriver/geckodriver");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.facebook.com");
		driver.manage().window().maximize();
		
		WebElement month_dropdown = driver.findElement(By.id("month"));
		Select month_dd = new Select(month_dropdown);
		month_dd.selectByVisibleText("Nov");
		
		WebElement day_dropdown = driver.findElement(By.xpath(".//*[@id='day']"));
		Select day_dd = new Select(day_dropdown);
		day_dd.selectByIndex(1);
		
		
		WebElement year_dropdown = driver.findElement(By.xpath(".//*[@id='year']"));
		Select year_dd = new Select(year_dropdown);
		year_dd.selectByValue("2016");
		
		driver.quit();
        
		
	}
}
