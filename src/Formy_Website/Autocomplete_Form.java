package Formy_Website;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Autocomplete_Form {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./Drivers/Drivers/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://formy-project.herokuapp.com/autocomplete");
		Thread.sleep(3000);
		
		WebElement autocomplete=driver.findElement(By.id("autocomplete"));
		autocomplete.sendKeys("212, New Chhani Road, Swaminarayan Nagar, New Sama, Vadodara, Gujarat, India");
		
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);//demo use of implicit wait
		
		//explicit wait demo 
		WebDriverWait wait = new WebDriverWait(driver,10);
		WebElement autocompleteResult = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("pac-item")));
		autocompleteResult.click();
		//Thread.sleep(3000);
		
		driver.quit();
		
		System.out.println("Run Successful");

	}

}
