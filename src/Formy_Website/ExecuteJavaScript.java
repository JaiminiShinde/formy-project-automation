package Formy_Website;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExecuteJavaScript {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./Drivers/Drivers/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://formy-project.herokuapp.com/modal");
		Thread.sleep(3000);
		
		WebElement modalButton=driver.findElement(By.id("modal-button"));
		modalButton.click();
		Thread.sleep(3000);
		
		WebElement ClickClose=driver.findElement(By.id("close-button"));
		ClickClose.click();
		Thread.sleep(3000);
		//to use javascriptexecutor create an object of the class javascriptexecutor
		JavascriptExecutor js=(JavascriptExecutor)driver;
		Thread.sleep(3000);
		js.executeScript("arguments[0].click();", ClickClose);
		Thread.sleep(3000);
		
		driver.quit();

	}

}
