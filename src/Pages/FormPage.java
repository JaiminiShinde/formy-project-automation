package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class FormPage 
{
	public static void submitForm(WebDriver driver) throws InterruptedException {
		driver.findElement(By.id("first-name")).sendKeys("John");
		Thread.sleep(2000);

		driver.findElement(By.id("last-name")).sendKeys("Doe");
		Thread.sleep(2000);

		driver.findElement(By.id("job-title")).sendKeys("Software Tester");
		Thread.sleep(2000);

		driver.findElement(By.id("radio-button-2")).click();
		Thread.sleep(2000);

		driver.findElement(By.id("checkbox-1")).click();
		Thread.sleep(2000);

		driver.findElement(By.cssSelector("option[value='2']")).click();
		Thread.sleep(2000);

		driver.findElement(By.id("datepicker")).sendKeys("07/15/2021");
		driver.findElement(By.id("datepicker")).sendKeys(Keys.RETURN);
		Thread.sleep(2000);

		driver.findElement(By.cssSelector(".btn.btn-lg.btn-primary")).click();
		Thread.sleep(2000);
	}

}
