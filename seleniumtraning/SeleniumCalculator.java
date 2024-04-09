package seleniumtraning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumCalculator {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		logintoApplication();
	calculator();
	}

	static void logintoApplication() throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
		driver.get("https://selenium-prd.firebaseapp.com/home.html");
		Thread.sleep(2000);
		WebElement email=driver.findElement(By.id("email_field"));
		email.sendKeys("admin123@gmail.com");
		WebElement password=driver.findElement(By.id("password_field"));
		password.sendKeys("admin123");
		WebElement login=driver.findElement(By.xpath("//button[contains(text(),'Login')]"));
		login.click();
		Thread.sleep(2000);
}//a[contains(text(),'Calculator')]
	static void homeTab() throws InterruptedException
	{
		Thread.sleep(2000);
		WebElement home=driver.findElement(By.xpath("//a[contains(text(),'Home')]"));
		home.click();
		Thread.sleep(2000);
		
	}
	static void calculator() throws InterruptedException
	{
		Thread.sleep(2000);
		WebElement calculator=driver.findElement(By.xpath("//a[contains(text(),'Calculator')]"));
		Actions action=new Actions(driver);
		action.moveToElement(calculator).build().perform();
		calculator.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value='8']")).click();
		driver.findElement(By.xpath("//input[@value='+']")).click();
		driver.findElement(By.xpath("//input[@value='2']")).click();
		driver.findElement(By.xpath("//input[@value='=']")).click();
	Thread.sleep(2000);
		String display=driver.findElement(By.xpath("//input[@id='display']")).getAttribute("value");
		
	//	String result=display.getText();
		
	System.out.println("Result: "+display);	
		//driver.close();
		driver.quit();
	}
	
	}
