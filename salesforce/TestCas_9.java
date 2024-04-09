package salesforce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCas_9 {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		logintosalesforce();
		RoshniPatel();
		logout();
	}
		
	static void logintosalesforce() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		driver.get("https://login.salesforce.com/");
		Thread.sleep(2000);
		WebElement username=driver.findElement(By.id("username"));
		username.sendKeys("roshni@patel.com");
		WebElement password=driver.findElement(By.id("password"));
		password.sendKeys("Pankti123");
		WebElement login=driver.findElement(By.xpath("//input[@id='Login']"));
		login.click();
	}
	 static void  RoshniPatel() throws InterruptedException {
			
			WebElement RoshniPatel = driver.findElement(By.id("userNavLabel"));
			Actions action = new Actions(driver);
			action.moveToElement(RoshniPatel).build().perform();
			RoshniPatel.click();
	 }
	static void logout()
	{
	WebElement logout = driver.findElement(By.xpath("//a[@title='Logout']"));
	logout.click();
	System.out.println("Logout sucessful");
	}
}
