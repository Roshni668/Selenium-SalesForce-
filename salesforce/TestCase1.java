package salesforce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase1 {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		logintosalesforce();
	}
		
	static void logintosalesforce() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		driver.get("https://login.salesforce.com/");
		Thread.sleep(2000);
		WebElement username=driver.findElement(By.id("username"));
		username.sendKeys("roshni@patel.com");
		WebElement password=driver.findElement(By.id("password"));
		//password.sendKeys("Pankti123");
		password.clear();
		//System.out.println("Please enter your password");
		WebElement login=driver.findElement(By.id("Login"));
		//WebElement login=driver.findElement(By.xpath("//input[@id='Login']"));
		login.click();
		Thread.sleep(3000);
		WebElement errormsg=driver.findElement(By.id("error"));
		if(errormsg.getText().contentEquals("Please enter your password."))
		{
			System.out.println("Error massage is displayed correctly.Test passed");
		}
		else
		{
			System.out.println("Error massage not displayed correctly.Test failed");
		}
		
		driver.close();
	}}
	
