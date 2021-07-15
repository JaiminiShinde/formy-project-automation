package Formy_Website;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDownMenu {

	public static void main(String[] args) throws InterruptedException 
	{
        System.setProperty("webdriver.chrome.driver", "./Drivers/Drivers/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://formy-project.herokuapp.com/dropdown");
		Thread.sleep(3000);
		
		WebElement DropDown = driver.findElement(By.id("dropdownMenuButton"));
		DropDown.click();
		Thread.sleep(3000);
		
		WebElement SelectItemDropDown = driver.findElement(By.id("autocomplete"));
		SelectItemDropDown.click();
		Thread.sleep(3000);
		
		driver.quit();
	}

}
