package Formy_Website;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./Drivers/Drivers/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://formy-project.herokuapp.com/radiobutton");//checkbox can also be automated the same way as radio button
		Thread.sleep(3000);
		
		WebElement RadioBtn1 = driver.findElement(By.id("radio-button-1"));
		RadioBtn1.click();
		Thread.sleep(3000);
		
		WebElement RadioBtn2 = driver.findElement(By.cssSelector("input[value='option2']"));
		RadioBtn2.click();
		Thread.sleep(3000);
		
		WebElement RadioBtn3 = driver.findElement(By.xpath("/html/body/div/div[3]/input"));
		RadioBtn3.click();
		Thread.sleep(3000);
		
		driver.quit();
	}

}
