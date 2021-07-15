package Formy_Website;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePicker {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./Drivers/Drivers/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://formy-project.herokuapp.com/datepicker");
		Thread.sleep(3000);
		
		WebElement DateField = driver.findElement(By.id("datepicker"));
		DateField.sendKeys("07/12/2021");
		Thread.sleep(3000);
		DateField.sendKeys(Keys.RETURN);
		Thread.sleep(3000);
		
		driver.quit();
	}

}
