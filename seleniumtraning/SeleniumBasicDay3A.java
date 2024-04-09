package seleniumtraning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumBasicDay3A {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		logintoApplication();
		homeTab();
		switchToTab();
		District();
		

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
		}
		static void switchToTab() {
			
			WebElement switchto = driver.findElement(By.xpath("//button[contains(text(),'Switch To')]"));
			Actions action = new Actions(driver);
			action.moveToElement(switchto).build().perform();
	}
		static void District() throws InterruptedException
		{
			Thread.sleep(2000);
			WebElement districtdropdown =driver.findElement(By.id("district"));
			Select district=new Select(districtdropdown);
			district.selectByValue("mumbai");
		}
		
		}
	
		
	

		/* HOW TO DO MOUSE HOVER
		 *  1. Find the element where I need to do mouse hover
		 *  2. Create an Object for Actions selenium Class by passing webdriver object
		 *  3.  action we used movetoElement and passed the webelement
		 *  4. action object build and perform.
		 */
	
	