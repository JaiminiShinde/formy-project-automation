package Formy_Website;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import Pages.Confirmation;
import Pages.FormPage;

public class CompleteForm {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Drivers/Drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://formy-project.herokuapp.com/form");
		Thread.sleep(2000);

		FormPage formPage = new FormPage();
		formPage.submitForm(driver);
		
		Confirmation confirm = new Confirmation();
		confirm.waitForAlertBanner(driver);

		assertEquals("The form was successfully submitted!", confirm.getAlertBannerText(driver)); 
		//Used Page object model to create separate classes and call all method in the main
        //created pages package and in it two classes 
		driver.quit();
	}

	
	
}
