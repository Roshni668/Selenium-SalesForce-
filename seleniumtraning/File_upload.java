package seleniumtraning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class File_upload {
	static WebDriver driver;
	static Actions actions;
	public static void main(String[] args) throws InterruptedException {
		logintoApplication();
		homeTab();
		fileupload();
		
}
	static void logintoApplication() throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
		driver.get("https://selenium-prd.firebaseapp.com/home.html");
		WebElement email=driver.findElement(By.id("email_field"));
		Thread.sleep(2000);
		email.sendKeys("admin123@gmail.com");
		WebElement password=driver.findElement(By.id("password_field"));
		password.sendKeys("admin123");
		WebElement login=driver.findElement(By.xpath("//button[contains(text(),'Login')]"));
		login.click();
		Thread.sleep(2000);
		
		
	}
	static void homeTab() throws InterruptedException
	{
		Thread.sleep(2000);
		WebElement home=driver.findElement(By.xpath("//a[contains(text(),'Home')]"));
		home.click();
		Thread.sleep(2000);
		
	}
	static void fileupload() throws InterruptedException {
		
		WebElement upload = driver.findElement(By.xpath("//a[contains(text(),'File Upload')]"));
		actions = new Actions(driver);
		actions.moveToElement(upload).build().perform();
		upload.click();
		Thread.sleep(2000);
		WebElement file=driver.findElement(By.xpath("//input[@id='logo']"));
		String filepath="\"C:\\Assignment screenshot\\Screenshot 2024-02-20 131257.png\"";
		
		file.sendKeys(filepath);
		
		
		// how to upload file
		
	}
	
	
}