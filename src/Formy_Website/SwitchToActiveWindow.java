package Formy_Website;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToActiveWindow {

	public static void main(String[] args) throws InterruptedException 
	{
          System.setProperty("webdriver.chrome.driver", "./Drivers/Drivers/chromedriver.exe");
          
          WebDriver driver = new ChromeDriver();
          
          driver.get("https://formy-project.herokuapp.com/switch-window");
          WebElement NewWindow=driver.findElement(By.id("new-tab-button"));
          NewWindow.click();
          Thread.sleep(3000);
          
          String originalHandle =driver.getWindowHandle();//to swicth to original handle that was opened earlier
          Thread.sleep(3000);
          
          //for loop to iterate between the two handles & swicth back to the tab that was open originally
          for(String handle1: driver.getWindowHandles()) //focus on second tab
          {
        	  driver.switchTo().window(handle1);
        	  Thread.sleep(3000);
          }
          
          driver.switchTo().window(originalHandle);
          Thread.sleep(3000);
          
          driver.quit();
	}

}
