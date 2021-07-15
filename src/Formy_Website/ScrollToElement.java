package Formy_Website;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScrollToElement {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./Drivers/Drivers/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://formy-project.herokuapp.com/scroll");
		Thread.sleep(3000);
		
		WebElement Name=driver.findElement(By.id("name"));
		Actions actions=new Actions(driver);
		actions.moveToElement(Name);
		Thread.sleep(1000);
		Name.sendKeys("Jaimini");
		Thread.sleep(1000);
		
		WebElement Date=driver.findElement(By.id("date"));
		Date.sendKeys("24/09/2021");
		Thread.sleep(1000);
		
		driver.quit();
		
		

	}

}
