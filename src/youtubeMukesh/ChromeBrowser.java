package youtubeMukesh;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ChromeBrowser {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "/Users/amitmotgi/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver(); 
        driver.get("http://www.facebook.com");
        
        WebElement month_dropdown = driver.findElement(By.id("month"));
		Select month_dd = new Select(month_dropdown);
		WebElement select_value = month_dd.getFirstSelectedOption();
		
		System.out.println("Before Selecting value "+ select_value.getText());
		month_dd.selectByVisibleText("Nov");
		WebElement select_value1 = month_dd.getFirstSelectedOption();
		System.out.println("After Selecting value "+ select_value1.getText());
		
        WebElement day_dropdown = driver.findElement(By.xpath(".//*[@id='day']"));
		Select day_dd = new Select(day_dropdown);
		day_dd.selectByIndex(1);
		
		
		WebElement year_dropdown = driver.findElement(By.xpath(".//*[@id='year']"));
		Select year_dd = new Select(year_dropdown);
		year_dd.selectByValue("2016");
		
		driver.quit();
        
	}

}
