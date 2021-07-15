package Formy_Website;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop {

	public static void main(String[] args) throws InterruptedException 
	{
        System.setProperty("webdriver.chrome.driver", "./Drivers/Drivers/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://formy-project.herokuapp.com/dragdrop");
		Thread.sleep(3000);
		
		WebElement Image=driver.findElement(By.id("image"));
		
		WebElement Box=driver.findElement(By.id("box"));
		
		Actions actions = new Actions(driver);
		actions.dragAndDrop(Image, Box).build().perform();
		Thread.sleep(3000);
		
		driver.quit();


	}

}
