package Formy_Website;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {

	public static void main(String[] args) throws InterruptedException 
	{
		 System.setProperty("webdriver.chrome.driver", "./Drivers/Drivers/chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			
			driver.get("https://formy-project.herokuapp.com/fileupload");
			Thread.sleep(3000);
			
			WebElement FileUploadField = driver.findElement(By.id("file-upload-field"));
			FileUploadField.sendKeys("kat1.jpg");
			Thread.sleep(3000);
			
			WebElement ResetClick = driver.findElement(By.xpath("//button[@class='btn btn-warning btn-reset']"));
			ResetClick.click();
			Thread.sleep(2000);
			
			driver.quit();
	}

}
