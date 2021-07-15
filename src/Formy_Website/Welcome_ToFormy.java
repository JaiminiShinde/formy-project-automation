package Formy_Website;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Welcome_ToFormy 
{
	public static void main (String[]args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","./Drivers/Drivers/chromedriver.exe");
		Thread.sleep(4000);
		
		WebDriver driver= new ChromeDriver();
		Thread.sleep(3000);
		driver.get("https://formy-project.herokuapp.com/keypress");
		Thread.sleep(3000);
		
		WebElement Name=driver.findElement(By.id("name"));
		Thread.sleep(3000);
		Name.click();
		Thread.sleep(3000);
		Name.sendKeys("Jaimini Shinde");
		Thread.sleep(3000);
		
		WebElement Button=driver.findElement(By.id("button"));
		Thread.sleep(3000);
		Button.click();
		Thread.sleep(3000);
		
		System.out.println("Session closed");
		driver.quit();
		
	}

}
