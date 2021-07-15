package Formy_Website;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToAlert {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./Drivers/Drivers/chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://formy-project.herokuapp.com/switch-window");
		Thread.sleep(3000);
		
		WebElement AlertBtn = driver.findElement(By.id("alert-button"));
		AlertBtn.click();
		Thread.sleep(3000);
		
		Alert alert=driver.switchTo().alert();
		alert.accept();
		Thread.sleep(3000);
		
		driver.quit();

	}

}
