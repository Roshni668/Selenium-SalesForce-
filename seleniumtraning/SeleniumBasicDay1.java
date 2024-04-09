package seleniumtraning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumBasicDay1 {

	public static void main(String[] args) throws InterruptedException {
		
		//System.out.println("hello");
		//launch browser
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//Enter the url
	
		driver.get("https://selenium-prd.firebaseapp.com/home.html");
		//need to enter the value in the textbox
		//a.identify the textbox -inspect the element
		//b.type or enter the value
		WebElement username=driver.findElement(By.id("email_field"));
		username.sendKeys("admin123@gmail.com");
		//username.sendKeys("patel.roshni668@gmail.com");
		WebElement password=driver.findElement(By.id("password_field"));
		password.sendKeys("admin123");
		//password.sendKeys("test123");
		// click on the button
		WebElement login=driver.findElement(By.tagName("button"));
	//	WebElement login=driver.findElement(By.xpath("//button[contains(text(),'Login to Account')]"));
		login.click();
		Thread.sleep(5000);
		driver.close();
	}

}
