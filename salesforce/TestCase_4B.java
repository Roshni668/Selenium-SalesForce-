package salesforce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase_4B {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		loginfail();
	}
		
	static void loginfail() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		driver.get("https://login.salesforce.com/");
		Thread.sleep(2000);
		WebElement username=driver.findElement(By.id("username"));
		username.sendKeys("123");
		WebElement password=driver.findElement(By.id("password"));
		password.sendKeys("22131");
		
		//System.out.println("Your login attempt has failed");
		WebElement login=driver.findElement(By.xpath("//input[@id='Login']"));
		login.click();
		 WebElement errorMessage = driver.findElement(By.id("error"));
		 if (errorMessage.getText().equals("Please check your username and password. If you still can't log in, contact your Salesforce administrator.")) 
		 {
	       System.out.println("Error message displayed correctly. Test Passed!");
	      }
		 else 
	        {
	            System.out.println("Error message not displayed correctly. Test Failed!");
		Thread.sleep(2000);
	        }
		//div[@id='error']
}}
