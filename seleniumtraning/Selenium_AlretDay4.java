package seleniumtraning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Selenium_AlretDay4 {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		logintoApplication();
		homeTab();
		switchToTab();
		alert();
		//Windowtab();
	}
	static void logintoApplication() throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
		driver.get("https://selenium-prd.firebaseapp.com/home.html");
		WebElement email=driver.findElement(By.id("email_field"));
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
	static void switchToTab() {
		
		WebElement switchto = driver.findElement(By.xpath("//button[contains(text(),'Switch To')]"));
		Actions action = new Actions(driver);
		action.moveToElement(switchto).build().perform();
		}
	static void alert() throws InterruptedException
		{	
		WebElement Alert=driver.findElement(By.xpath("//a[contains(text(),'Alert')]"));
		Alert.click();
		Thread.sleep(1000);
		WebElement windowalert=driver.findElement(By.xpath("//button[contains(text(),'Window Alert')]"));
		windowalert.click();
		String alertText=driver.switchTo().alert().getText();
		System.out.println(alertText);
		
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		WebElement promptalert=driver.findElement(By.xpath("//button[contains(text(),'Promt Alert')]"));
		promptalert.click();
		Thread.sleep(1000);
	//driver.switchTo().alert().dismiss();		
		driver.switchTo().alert().sendKeys("Roshni");
		driver.switchTo().alert().accept();
		}
	static void Windowtab() throws InterruptedException
	{	
		
	WebElement windowtab=driver.findElement(By.xpath("//a[contains(text(),'Windows')]"));
	windowtab.click();
	String parentwindow=driver.getWindowHandle();
	System.out.println(parentwindow);
	driver.findElement(By.xpath("//button[contains(text(),'Tab')]")).click();
	for(String handle:driver.getWindowHandles()) {
		System.out.println(handle);
		driver.switchTo().window(handle);
		}
	Thread.sleep(4000);
	
	System.out.println(driver.getTitle());
	
	driver.findElement(By.name("q")).sendKeys("Selenium");
	driver.switchTo().window(parentwindow);
	 System.out.println(driver.getTitle());
	}
	
		  
		 
	
	
	
}
