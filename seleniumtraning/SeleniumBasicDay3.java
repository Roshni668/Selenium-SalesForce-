package seleniumtraning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumBasicDay3 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://selenium-prd.firebaseapp.com/home.html");
		Thread.sleep(2000);
		WebElement username=driver.findElement(By.id("email_field"));
		username.sendKeys("admin123@gmail.com");

		WebElement password=driver.findElement(By.id("password_field"));
		password.sendKeys("admin123");
		
WebElement login=driver.findElement(By.xpath("//button[contains(text(),'Login to Account')]"));
	login.click();
	Thread.sleep(2000);
//	WebElement home=driver.findElement(By.xpath("//a[contains(text(),'Home')])"));
//		home.click();
	 WebElement home = driver.findElement(By.xpath("//a[contains(text(),'Home')]"));
	   home.click();
	   Thread.sleep(2000);
	   WebElement female = driver.findElement(By.xpath("//input[@value='female']"));
	   female.click();
	 
	  WebElement citydropdown=driver.findElement(By.id("city"));
	  Select city=new Select(citydropdown);
	  city.selectByVisibleText("GOA");
	  WebElement coursedropdown=driver.findElement(By.name("course"));
	  Select course=new Select(coursedropdown);	  
	  course.selectByIndex(3);
	  Thread.sleep(2000);
	  	
	  
//	  	We need to identify the drop down element
//	    Create an object of Select class by passing element to constructor
//	      the Select Object 
//	          - 1. selectbyIndex
//	            2. SelectbyValue
//	            3. SelectbyVisibleText.
		
	}

}
