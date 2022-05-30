package youtubeMukesh;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Loginfacebook {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "/Users/netra/eclipse-workspace/⁨BasicSeleniumJava⁩/driver/geckodriver");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.facebook.com");
		driver.manage().window().maximize();
		driver.findElement(By.id("email")).sendKeys("netra.motgi@googlemail.com");
		driver.findElement(By.id("pass")).sendKeys("netravati11");
		driver.findElement(By.id("u_0_2")).click();
		
		/*driver.findElement(By.xpath(".//*[@id='u_0_1']")).sendKeys("netra.motgi@googlemail.com");	
		driver.findElement(By.xpath(".//*[@id='u_0_3']")).sendKeys("netravati11");
		driver.findElement(By.xpath(".//*[@id='u_0_d']")).click();
		
		
		Select sel1 = new Select(driver.findElement(By.xpath(".//*[@id='month']")));
		sel1.selectByVisibleText("Nov");
		Select sel2 = new Select(driver.findElement(By.xpath(".//*[@id='day']")));
		sel2.selectByIndex( 2);
		Select sel3 = new Select(driver.findElement(By.xpath(".//*[@id='year']")));
		sel3.selectByValue("2016");
		
		driver.findElement(By.xpath(".//*[@id='u_0_i']")).click();
		driver.findElement(By.xpath(".//*[@id='reg_pages_msg']/a")).click();
		driver.navigate().back(); 
		
		driver.quit();*/

	}

}
